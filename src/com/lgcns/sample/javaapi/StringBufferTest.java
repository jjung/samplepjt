package com.lgcns.sample.javaapi;

/**
 * [실습] StringBuffer 성능 비교
 *  * 별문자“*” 를 10000번 이어 붙이는 코드를 각각 String의 + 연산, 
 * StringBuffer의 append(), StringBuilder의 append()를 이용하여 작성하고 
 * 각각의 실행 시간을 측정하는 코드를 구현해보자.
 * 
 * [실행결과]
 * String:75ms
 * StringBuffer: 2ms
 * StringBuilder: 1ms
 * 
 */
public class StringBufferTest {
	public static void main(String[] args) {

		long start = System.currentTimeMillis();

		String str = "";
		for (int i = 0; i < 10000; i++) {
			str = str + "*";
		}

		long end1 = System.currentTimeMillis();
		System.out.println("String: " + (end1 - start) + "ms");

		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < 10000; i++) {
			buffer.append("*");
		}
		
		long end2 = System.currentTimeMillis();
		System.out.println("StringBuffer: " + (end2 - end1) +"ms" );
		
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < 10000; i++) {
			builder.append("*");
		}
		
		long end3 = System.currentTimeMillis();
		System.out.println("StringBuilder: " + (end3 - end2) + "ms");
	}
}
