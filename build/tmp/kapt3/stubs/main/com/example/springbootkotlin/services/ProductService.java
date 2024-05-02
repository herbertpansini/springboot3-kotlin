package com.example.springbootkotlin.services;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH&J\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\bH&\u00a8\u0006\u000f"}, d2 = {"Lcom/example/springbootkotlin/services/ProductService;", "", "delete", "", "id", "Ljava/util/UUID;", "findAll", "Lorg/springframework/data/domain/Page;", "Lcom/example/springbootkotlin/services/dtos/ProductDto;", "pageable", "Lorg/springframework/data/domain/Pageable;", "findById", "save", "productDto", "update", "springboot-kotlin"})
public abstract interface ProductService {
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.springbootkotlin.services.dtos.ProductDto save(@org.jetbrains.annotations.NotNull
    com.example.springbootkotlin.services.dtos.ProductDto productDto);
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.springbootkotlin.services.dtos.ProductDto findById(@org.jetbrains.annotations.NotNull
    java.util.UUID id);
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.springbootkotlin.services.dtos.ProductDto update(@org.jetbrains.annotations.NotNull
    java.util.UUID id, @org.jetbrains.annotations.NotNull
    com.example.springbootkotlin.services.dtos.ProductDto productDto);
    
    @org.jetbrains.annotations.NotNull
    public abstract org.springframework.data.domain.Page<com.example.springbootkotlin.services.dtos.ProductDto> findAll(@org.jetbrains.annotations.NotNull
    org.springframework.data.domain.Pageable pageable);
    
    public abstract void delete(@org.jetbrains.annotations.NotNull
    java.util.UUID id);
}