package com.algaworks.di.model;

import java.math.BigDecimal;

public class Product {
    private String name;
    private BigDecimal totalValue;

    public Product(String name, BigDecimal totalValue) {
        super();
        this.name = name;
        this.totalValue = totalValue;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getTotalValue() {
        return totalValue;
    }
}
