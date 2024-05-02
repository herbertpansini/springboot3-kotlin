package com.example.springbootkotlin.services.mappers

import com.example.springbootkotlin.models.ProductModel
import com.example.springbootkotlin.services.dtos.ProductDto
import org.mapstruct.InheritInverseConfiguration
import org.mapstruct.Mapper
import org.mapstruct.Mapping

@Mapper(componentModel = "spring")
interface ProductMapper {
    @Mapping(target = "id", source = "productModel.id", defaultExpression = "java(java.util.UUID.randomUUID())")
    fun productModelToProductDto(productModel: ProductModel): ProductDto

    @InheritInverseConfiguration
    fun productDtoToProductModel(productDto: ProductDto): ProductModel
}