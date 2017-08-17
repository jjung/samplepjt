package com.lgcns.sample.extend.exercise1;

public class AnimalStep1 {
    
    private int age;
    private String kind;
    
    public AnimalStep1( int age, String kind ) {
        this.age = age;
        this.kind = kind;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge( int age ) {
        this.age = age;
    }
    
    public String getKind() {
        return kind;
    }
    
    public void setKind( String kind ) {
        this.kind = kind;
    }
    
    public void run() {
        System.out.println( "달려라!!!" );
    }
}