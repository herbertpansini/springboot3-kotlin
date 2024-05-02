package com.example.springbootkotlin.services.dtos

import jakarta.persistence.Id
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull
import org.springframework.hateoas.RepresentationModel
import java.io.Serializable
import java.util.UUID

data class ProductDto(
    @Id
    val id: UUID?,
    @NotBlank
    val name: String,
    @NotNull
    val value: Double
): RepresentationModel<ProductDto>(), Serializable