package com.example.springbootkotlin.services.impls

import com.example.springbootkotlin.controllers.ProductController
import com.example.springbootkotlin.repositories.ProductRepository
import com.example.springbootkotlin.services.ProductService
import com.example.springbootkotlin.services.dtos.ProductDto
import com.example.springbootkotlin.services.mappers.ProductMapper
import org.springframework.beans.BeanUtils
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.server.ResponseStatusException
import java.util.UUID

@Service
@Transactional
class ProductServiceImpl: ProductService {
    @Autowired
    private lateinit var productRepository: ProductRepository

    @Autowired
    private lateinit var productMapper: ProductMapper

    override fun save(productDto: ProductDto) =
        this.productMapper.productModelToProductDto(
            this.productRepository.save(
                this.productMapper.productDtoToProductModel(productDto)
            )
        )

    override fun update(id: UUID, productDto: ProductDto): ProductDto {
        val product = this.findById(id)
        BeanUtils.copyProperties(productDto, product, "id")
        return this.save(productDto)
    }

    @Transactional(readOnly = true)
    override fun findById(id: UUID): ProductDto {
        var product = this.productMapper.productModelToProductDto(
            this.productRepository.findById(id).orElseThrow { ResponseStatusException(HttpStatus.NOT_FOUND) }
        )
        return product.add(linkTo(methodOn(ProductController::class.java).getAllProducts(Pageable.ofSize(20))).withRel("Product List"))
    }

    @Transactional(readOnly = true)
    override fun findAll(pageable: Pageable): Page<ProductDto> {
        var products = this.productRepository.findAll(pageable).map(this.productMapper::productModelToProductDto)
        products.forEach { it.add(linkTo(methodOn(ProductController::class.java).getOneProduct(it.id!!)).withSelfRel()) }
        return products
    }

    override fun delete(id: UUID) = this.productRepository.deleteById(id)
}