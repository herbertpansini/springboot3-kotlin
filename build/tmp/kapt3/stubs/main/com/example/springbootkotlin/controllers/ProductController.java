package com.example.springbootkotlin.controllers;

@org.springframework.web.bind.annotation.RestController
@org.springframework.web.bind.annotation.RequestMapping(value = {"api/products"})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0017J*\u0010\t\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\f \r*\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b0\u000b0\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0017J \u0010\u0010\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f0\n2\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0017J \u0010\u0011\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f0\n2\b\b\u0001\u0010\u0012\u001a\u00020\fH\u0017J*\u0010\u0013\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f0\n2\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u0012\u001a\u00020\fH\u0017R\u0012\u0010\u0003\u001a\u00020\u00048\u0012@\u0012X\u0093.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/example/springbootkotlin/controllers/ProductController;", "", "()V", "productService", "Lcom/example/springbootkotlin/services/ProductService;", "deleteProduct", "", "id", "Ljava/util/UUID;", "getAllProducts", "Lorg/springframework/http/ResponseEntity;", "Lorg/springframework/data/domain/Page;", "Lcom/example/springbootkotlin/services/dtos/ProductDto;", "kotlin.jvm.PlatformType", "pageable", "Lorg/springframework/data/domain/Pageable;", "getOneProduct", "saveProduct", "productDto", "updateProduct", "springboot-kotlin"})
public class ProductController {
    @org.springframework.beans.factory.annotation.Autowired
    private com.example.springbootkotlin.services.ProductService productService;
    
    public ProductController() {
        super();
    }
    
    @org.springframework.web.bind.annotation.PostMapping
    @org.jetbrains.annotations.NotNull
    public org.springframework.http.ResponseEntity<com.example.springbootkotlin.services.dtos.ProductDto> saveProduct(@org.springframework.web.bind.annotation.RequestBody
    @jakarta.validation.Valid
    @org.jetbrains.annotations.NotNull
    com.example.springbootkotlin.services.dtos.ProductDto productDto) {
        return null;
    }
    
    @org.springframework.web.bind.annotation.PutMapping(value = {"{id}"})
    @org.jetbrains.annotations.NotNull
    public org.springframework.http.ResponseEntity<com.example.springbootkotlin.services.dtos.ProductDto> updateProduct(@org.springframework.web.bind.annotation.PathVariable
    @org.jetbrains.annotations.NotNull
    java.util.UUID id, @org.springframework.web.bind.annotation.RequestBody
    @jakarta.validation.Valid
    @org.jetbrains.annotations.NotNull
    com.example.springbootkotlin.services.dtos.ProductDto productDto) {
        return null;
    }
    
    @org.springframework.web.bind.annotation.GetMapping
    @org.jetbrains.annotations.NotNull
    public org.springframework.http.ResponseEntity<org.springframework.data.domain.Page<com.example.springbootkotlin.services.dtos.ProductDto>> getAllProducts(@org.jetbrains.annotations.NotNull
    org.springframework.data.domain.Pageable pageable) {
        return null;
    }
    
    @org.springframework.web.bind.annotation.GetMapping(value = {"{id}"})
    @org.jetbrains.annotations.NotNull
    public org.springframework.http.ResponseEntity<com.example.springbootkotlin.services.dtos.ProductDto> getOneProduct(@org.springframework.web.bind.annotation.PathVariable
    @org.jetbrains.annotations.NotNull
    java.util.UUID id) {
        return null;
    }
    
    @org.springframework.web.bind.annotation.DeleteMapping(value = {"{id}"})
    @org.springframework.web.bind.annotation.ResponseStatus(value = org.springframework.http.HttpStatus.NO_CONTENT)
    public void deleteProduct(@org.springframework.web.bind.annotation.PathVariable
    @org.jetbrains.annotations.NotNull
    java.util.UUID id) {
    }
}