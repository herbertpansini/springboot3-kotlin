package com.example.springbootkotlin.controllers

import com.example.springbootkotlin.services.ProductService
import com.example.springbootkotlin.services.dtos.ProductDto
import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Pageable
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import java.util.UUID

@RestController
@RequestMapping("api/products")
class ProductController {
    @Autowired
    private lateinit var productService: ProductService

    @PostMapping
    fun saveProduct(@RequestBody @Valid productDto: ProductDto) =
        ResponseEntity.status(HttpStatus.CREATED).body(this.productService.save(productDto))

    @PutMapping("{id}")
    fun updateProduct(@PathVariable id: UUID, @RequestBody @Valid productDto: ProductDto) =
        ResponseEntity.ok(this.productService.update(id, productDto))

    @GetMapping
    fun getAllProducts(pageable: Pageable) = ResponseEntity.ok(this.productService.findAll(pageable))

    @GetMapping("{id}")
    fun getOneProduct(@PathVariable id: UUID) = ResponseEntity.ok(this.productService.findById(id))

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun deleteProduct(@PathVariable id: UUID) = this.productService.delete(id)
}