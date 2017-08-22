package com.exam.sample.extend.exercise3;

public class AnimalStep2 {
    
    private int age;
    private String kind;
    
    public AnimalStep2( int age, String kind ) {
        this.age = age;
        this.kind = kind;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getKind() {
        return kind;
    }
    
    public void hunt() {
        System.out.println( "사냥을 합니다." );
    }
    
    public void run() {
        System.out.println( "달려라!!!" );
    }
}