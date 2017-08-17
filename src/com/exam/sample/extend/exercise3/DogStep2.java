package com.lgcns.sample.extend.exercise3;

public class DogStep2 extends AnimalStep2 {
    
    private String name;
    
    public DogStep2( int age, String kind, String name ) {
        super( age, kind );
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    @Override
    public void hunt() {
        System.out.println( "순록을 잡아요~" );
    }
    
    @Override
    public void run() {
        System.out.println( "시속 40km로 뛰어!!" );
    }
}