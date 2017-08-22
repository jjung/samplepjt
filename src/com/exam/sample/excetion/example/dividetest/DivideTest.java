package com.exam.sample.excetion.example.dividetest;

/*
 * [따라하기] 나누기 연산하기
 * 
 * 100을 -3부터 3까지 순차적으로 나누어 결과를 출력한다. 
 * 
 * 나누기 연산은 Exception 이 발생할 여지가 있으므로 예외 처리를 하도록 한다. 
 * 
 * 연산을 한 번 수행할 때마다 구분자로 “----------” 문자열이 무조건 출력되도록 하자.
 * 
 * 
 * [실행 결과]
 * 
 * 100 / -3 = -33
 * ----------------------
 *  100 / -2 = -50
 * ----------------------
 *  100 / -1 = -100
 * ----------------------
 * 잘못된 연산 발생!!
 * ----------------------
 *  100 / 1 = 100
 * ----------------------
 * 100 / 2 = 50
 * ----------------------
 *  100 / 3 = 33
 * ----------------------
 * 
 */
public class DivideTest {
    
    public static void main( String[] args ) {
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