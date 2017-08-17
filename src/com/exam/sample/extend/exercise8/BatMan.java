package com.lgcns.sample.extend.exercise8;

public class BatMan extends Hero {
    
    @Override
    public void action() {
        swim();
        fight();
    }
    
    @Override
    public String toString() {
        return "배트맨";
    }
}