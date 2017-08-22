package com.exam.sample.excetion.example.threaddivide;

public class ThreadDivide implements Runnable {
	public void run() {
		for(int i=-3;i<=3;i++) {
        	try {
        		int result = 100/ i;
        		System.out.println("100 / " + i + " = " + result);
	        } catch( ArithmeticException e ) {
	        	System.out.println("잘못된 연산 발생!!");
	        } finally {
	        	System.out.println("-----------------------------");
	        }
	    }
	}
}
