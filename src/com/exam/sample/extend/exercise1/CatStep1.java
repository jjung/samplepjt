package com.exam.sample.extend.exercise1;

public class CatStep1 extends AnimalStep1 {
    
    private String name;
    
    public CatStep1( int age, String kind, String name ) {
        super( age, kind );
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName( String name ) {
        this.name = name;
    }
    
    public void hunt() {
        System.out.println( "쥐를 잡을꺼야!!" );
    }
    
    public void play() {
        System.out.println( "모빌 놀이가 좋아요~" );
    }
}