package com.exam.sample.extend.exercise8;

public class SpiderMan extends Hero {
    
    @Override
    public void action() {
        fight();
    }
    
    @Override
    public String toString() {
        return "스파이더맨";
    }
}