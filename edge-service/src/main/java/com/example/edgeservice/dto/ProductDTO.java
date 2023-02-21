package com.example.edgeservice.dto;

import java.math.BigDecimal;

public class ProductDTO {
    private Long serialNumber;
    private String name;
    private BigDecimal price;
    private Integer quantity;

    public ProductDTO(Long serialNumber, String name, BigDecimal price, Integer quantity) {
        this.serialNumber = serialNumber;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public Long getSerialNumber() {
        return serialNumber;
    }


    public void setSerialNumber(Long serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
