package com.lgcns.sample.extend.exercise8;

public class SuperMan extends Hero {
    
    @Override
    public void action() {
        fly();
        swim();
        fight();
    }
    
    @Override
    public String toString() {
        return "슈퍼맨";
    }
}