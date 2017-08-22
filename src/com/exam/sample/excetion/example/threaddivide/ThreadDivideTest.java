package com.exam.sample.excetion.example.threaddivide;

/*
 * [따라하기] 쓰레드로 나누기 연산하기
 * 
 * 앞에서 실습한 100을 -3부터 3까지 순차적으로 나누어 
 * 결과를 출력하는 프로그램을 쓰레드로 작성하여 실행해보자.
 * 
 * 
 * [실행 결과]
 * 
 * 100 / -3 = -33
 * ----------------------
 * 100 / -2 = -50
 * ----------------------
 * 100 / -1 = -100
 * ----------------------
 * 잘못된 연산 발생!!
 * ----------------------
 * 100 / 1 = 100
 * ----------------------
 * 100 / 2 = 50
 * ----------------------
 * 100 / 3 = 33
 * ----------------------
 * 
 */
public class ThreadDivideTest {
    
    public static void main( String[] args ) {
    	Thread thread = new Thread(new ThreadDivide());
    	thread.start();
    }
}