package com.imatrix.microservices.product.controller;

import com.imatrix.microservices.product.dto.ProductRequest;
import com.imatrix.microservices.product.dto.ProductResponse;
import com.imatrix.microservices.product.model.Product;
import com.imatrix.microservices.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : ProductService
 * Class : {@link ProductController}
 *
 * @author : iMatrixLabs
 */

@RestController
@RequestMapping( "/api/product" )
@RequiredArgsConstructor
public class ProductController
{
    private final ProductService productService;

    @PostMapping
    @ResponseStatus( HttpStatus.CREATED )
    public ProductResponse createProduct( @RequestBody ProductRequest productRequest )
    {
        return productService.createProduct( productRequest );
    }

    @GetMapping
    @ResponseStatus( HttpStatus.OK )
    public List<ProductResponse> getAllProducts()
    {
        return productService.getAllProducts();
    }
}
