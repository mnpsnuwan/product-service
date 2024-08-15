package com.imatrix.microservices.product.dto;

import java.math.BigDecimal;

/**
 * Created by IntelliJ IDEA.
 * Project : ProductService
 * Class : {@link ProductResponse}
 *
 * @author : iMatrixLabs
 */
public record ProductResponse(String id, String name, String description, String skuCode, BigDecimal price)
{
}
