package com.exam.sample.extend.exercise3;

public class CatStep2 extends AnimalStep2 {
    
    private String name;
    
    public CatStep2( int age, String kind, String name ) {
        super( age, kind );
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    @Override
    public void hunt() {
        System.out.println( "쥐를 잡을꺼야!!" );
    }
    
    public void play() {
        System.out.println( "모빌 놀이가 좋아요~" );
    }
}