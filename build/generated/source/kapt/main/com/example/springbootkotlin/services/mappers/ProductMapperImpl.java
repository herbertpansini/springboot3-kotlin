package com.example.springbootkotlin.services.mappers;

import com.example.springbootkotlin.models.ProductModel;
import com.example.springbootkotlin.services.dtos.ProductDto;
import java.util.UUID;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-05T08:45:01-0300",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from kotlin-annotation-processing-gradle-1.8.22.jar, environment: Java 17.0.8 (Oracle Corporation)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public ProductDto productModelToProductDto(ProductModel productModel) {
        if ( productModel == null ) {
            return null;
        }

        UUID id = null;
        String name = null;
        double value = 0.0d;

        if ( productModel.getId() != null ) {
            id = productModel.getId();
        }
        else {
            id = java.util.UUID.randomUUID();
        }
        name = productModel.getName();
        value = productModel.getValue();

        ProductDto productDto = new ProductDto( id, name, value );

        return productDto;
    }

    @Override
    public ProductModel productDtoToProductModel(ProductDto productDto) {
        if ( productDto == null ) {
            return null;
        }

        UUID id = null;
        String name = null;
        double value = 0.0d;

        id = productDto.getId();
        name = productDto.getName();
        value = productDto.getValue();

        ProductModel productModel = new ProductModel( id, name, value );

        return productModel;
    }
}
