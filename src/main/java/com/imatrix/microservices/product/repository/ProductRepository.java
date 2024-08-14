package com.imatrix.microservices.product.repository;

import com.imatrix.microservices.product.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : ProductService
 * Class : {@link ProductRepository}
 *
 * @author : iMatrixLabs
 */
public interface ProductRepository extends MongoRepository<Product, String>
{
}
