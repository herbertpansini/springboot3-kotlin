package com.example.springbootkotlin.models

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.util.UUID

@Entity
@Table(name = "TB_PRODUCTS")
data class ProductModel(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: UUID?,
    val name: String,
    val value: Double
)