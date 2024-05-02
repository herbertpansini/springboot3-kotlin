package com.example.springbootkotlin.services

import com.example.springbootkotlin.services.dtos.ProductDto
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import java.util.UUID

interface ProductService {
    fun save(productDto: ProductDto): ProductDto
    fun findById(id: UUID): ProductDto
    fun update(id: UUID, productDto: ProductDto): ProductDto
    fun findAll(pageable: Pageable): Page<ProductDto>
    fun delete(id: UUID)
}