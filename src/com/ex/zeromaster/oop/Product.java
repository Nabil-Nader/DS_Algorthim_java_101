package com.ex.zeromaster.oop;

import java.math.BigDecimal;

public class Product {
    private String name;
    private BigDecimal price;

    public Product() {
    }

    public Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }
}
