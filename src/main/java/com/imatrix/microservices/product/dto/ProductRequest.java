package com.imatrix.microservices.product.dto;

import java.math.BigDecimal;

/**
 * Created by IntelliJ IDEA.
 * Project : SpotHub
 * Class : {@link ProductRequest}
 *
 * @author : iMatrixLabs
 */
public record ProductRequest(String id, String name, String description, String skuCode, BigDecimal price)
{
}
