package com.lgcns.sample.extend.example.producttest;

public class Television extends Product {
    
    private String description;
    
    public Television( String name, int price, int discountRate, String description ) {
        super( name, price, discountRate );
        this.description = description;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription( String description ) {
        this.description = description;
    }
}