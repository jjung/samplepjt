package com.lgcns.sample.extend.example.producttest;

import java.text.NumberFormat;
import java.util.Locale;

public class Product {
    
    private String name;
    private int price;
    private int discountRate;
    
    public Product( String name, int price, int discountRate ) {
        this.name = name;
        this.price = price;
        this.discountRate = discountRate;
    }
    
    public String getName() {
        return name;
    }
    
    public int getPrice() {
        return price;
    }
    
    public int getDiscountRate() {
        return discountRate;
    }
    
    public void setDiscountRate( int discountRate ) {
        this.discountRate = discountRate;
    }
    
    public void printProductInfo() {
        
        NumberFormat nf = NumberFormat.getCurrencyInstance( Locale.KOREA );
        
        System.out.println( "제품명 : " + name );
        System.out.println( "정가 : " + nf.format( price ) + " ( 할인율 : " + discountRate + "% )" );
        System.out.println( "판매가 : " + calculateDiscountPrice() );
    }
    
    public String calculateDiscountPrice() {
        NumberFormat nf = NumberFormat.getCurrencyInstance( Locale.KOREA );
        return nf.format( price * ( 100 - discountRate ) / 100 );
    }
}