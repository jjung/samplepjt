package com.exam.sample.javaapi;

public class Book {
    
    private String title;
    private int page;
    private int price;
    
    public Book( String title, int page, int price ) {
        this.title = title;
        this.page = page;
        this.price = price;
    }
    
    public String getTitle() {
        return title;
    }
    
    public int getPage() {
        return page;
    }
    
    public int getPrice() {
        return price;
    }
    
    public void setPrice( int price ) {
        this.price = price;
    }
    
    public void printBookInfo() {
        System.out.println( title + " (" + page + " page) : " + price + "원" );
    }
}