package com.example.springbootkotlin.services.mappers;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\'\u00a8\u0006\b"}, d2 = {"Lcom/example/springbootkotlin/services/mappers/ProductMapper;", "", "productDtoToProductModel", "Lcom/example/springbootkotlin/models/ProductModel;", "productDto", "Lcom/example/springbootkotlin/services/dtos/ProductDto;", "productModelToProductDto", "productModel", "springboot-kotlin"})
@org.mapstruct.Mapper(componentModel = "spring")
public abstract interface ProductMapper {
    
    @org.mapstruct.Mapping(target = "id", source = "productModel.id", defaultExpression = "java(java.util.UUID.randomUUID())")
    @org.jetbrains.annotations.NotNull
    public abstract com.example.springbootkotlin.services.dtos.ProductDto productModelToProductDto(@org.jetbrains.annotations.NotNull
    com.example.springbootkotlin.models.ProductModel productModel);
    
    @org.mapstruct.InheritInverseConfiguration
    @org.jetbrains.annotations.NotNull
    public abstract com.example.springbootkotlin.models.ProductModel productDtoToProductModel(@org.jetbrains.annotations.NotNull
    com.example.springbootkotlin.services.dtos.ProductDto productDto);
}