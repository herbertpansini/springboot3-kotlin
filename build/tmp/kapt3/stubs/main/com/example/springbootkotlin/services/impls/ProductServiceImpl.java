package com.example.springbootkotlin.services.impls;

@org.springframework.stereotype.Service
@org.springframework.transaction.annotation.Transactional
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0017J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\nH\u0017J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\rH\u0016J\u0018\u0010\u0013\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\rH\u0016R\u0012\u0010\u0003\u001a\u00020\u00048\u0012@\u0012X\u0093.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00068\u0012@\u0012X\u0093.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/example/springbootkotlin/services/impls/ProductServiceImpl;", "Lcom/example/springbootkotlin/services/ProductService;", "()V", "productMapper", "Lcom/example/springbootkotlin/services/mappers/ProductMapper;", "productRepository", "Lcom/example/springbootkotlin/repositories/ProductRepository;", "delete", "", "id", "Ljava/util/UUID;", "findAll", "Lorg/springframework/data/domain/Page;", "Lcom/example/springbootkotlin/services/dtos/ProductDto;", "pageable", "Lorg/springframework/data/domain/Pageable;", "findById", "save", "productDto", "update", "springboot-kotlin"})
public class ProductServiceImpl implements com.example.springbootkotlin.services.ProductService {
    @org.springframework.beans.factory.annotation.Autowired
    private com.example.springbootkotlin.repositories.ProductRepository productRepository;
    @org.springframework.beans.factory.annotation.Autowired
    private com.example.springbootkotlin.services.mappers.ProductMapper productMapper;
    
    public ProductServiceImpl() {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.example.springbootkotlin.services.dtos.ProductDto save(@org.jetbrains.annotations.NotNull
    com.example.springbootkotlin.services.dtos.ProductDto productDto) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.example.springbootkotlin.services.dtos.ProductDto update(@org.jetbrains.annotations.NotNull
    java.util.UUID id, @org.jetbrains.annotations.NotNull
    com.example.springbootkotlin.services.dtos.ProductDto productDto) {
        return null;
    }
    
    @org.springframework.transaction.annotation.Transactional(readOnly = true)
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.example.springbootkotlin.services.dtos.ProductDto findById(@org.jetbrains.annotations.NotNull
    java.util.UUID id) {
        return null;
    }
    
    @org.springframework.transaction.annotation.Transactional(readOnly = true)
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public org.springframework.data.domain.Page<com.example.springbootkotlin.services.dtos.ProductDto> findAll(@org.jetbrains.annotations.NotNull
    org.springframework.data.domain.Pageable pageable) {
        return null;
    }
    
    @java.lang.Override
    public void delete(@org.jetbrains.annotations.NotNull
    java.util.UUID id) {
    }
}