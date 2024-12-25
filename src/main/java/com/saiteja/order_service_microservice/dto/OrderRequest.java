package com.saiteja.order_service_microservice.dto;

import java.math.BigDecimal;

public record OrderRequest(Long id, String orderNumber, String skuCode, BigDecimal price, Integer quantity,UserDetails userDetails) {

}
