package com.imatrix.microservices.product.service;

import com.imatrix.microservices.product.dto.ProductRequest;
import com.imatrix.microservices.product.dto.ProductResponse;
import com.imatrix.microservices.product.model.Product;
import com.imatrix.microservices.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : ProductService
 * Class : {@link ProductService}
 *
 * @author : iMatrixLabs
 */

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService
{
    private final ProductRepository productRepository;

    public ProductResponse createProduct( ProductRequest productRequest )
    {
        Product product = Product.builder()
                                 .name( productRequest.name() )
                                 .description( productRequest.description() )
                                 .price( productRequest.price() ).build();
        productRepository.save( product );
        log.info( "Product created successfully" );
        return new ProductResponse( product.getId(), product.getName(), product.getDescription(), product.getPrice() );
    }

    public List<ProductResponse> getAllProducts()
    {
        return productRepository.findAll()
                                .stream()
                                .map( product -> new ProductResponse( product.getId(), product.getName(), product.getDescription(), product.getPrice() ) )
                                .toList();
    }
}
