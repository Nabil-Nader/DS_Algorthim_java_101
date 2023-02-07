package com.ex.zeromaster.oop.inher;

public class Product {
    private int id;
    private String name;

    public Product(String name) {
        this.name = name;
    }

    public Product() {
//        System.out.println("Call to 'super()' must be first statement in constructor body");
        super();
        System.out.println("hello");
    }

    public int calculateRemainingAmount() {
        return 100; // just a stub for the sake of example
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  Product[] listVariants() {
        // some code that fetches the variant products from database
        return new Product[3]; // just a fake return object for the sake of example
    }
}
