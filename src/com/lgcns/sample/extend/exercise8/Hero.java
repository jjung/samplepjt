package com.lgcns.sample.extend.exercise8;

public class Hero implements CanFly, CanSwim, CanFight {
    
    @Override
    public void fight() {
        System.out.println( this + "이 싸운다." );
    }
    
    @Override
    public void swim() {
        System.out.println( this + "이 헤엄친다." );
    }
    
    @Override
    public void fly() {
        System.out.println( this + "이 난다." );
    }
    
    public void action() {
        
    }
}