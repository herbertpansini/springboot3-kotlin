package com.example.springbootkotlin.repositories

import com.example.springbootkotlin.models.ProductModel
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface ProductRepository: JpaRepository<ProductModel, UUID>