package com.exam.sample.javaapi;

import java.util.StringTokenizer;

/**
 * [실습] StringTokenizer 사용
 * 학생의 이름과 과목별 점수가 다음과 같은 문자열로 주어질 때, 
 * 실행결과와 같이 출력할 수 있도록 코드를 작성해보자
 * “홍길동,80,90,100|홍길순,70,70,80|김자바,90,90,80”

 * [실행결과]
 * 홍길동
 * 80
 * 90
 * 100
 * ==========
 * 홍길순
 * 70
 * 70
 * 80
 * ==========
 * 김자바
 * 90
 * 90
 * 80
 * 
 */
public class StringTokenizerTest {
	public static void main(String[] args) {
		String source = "홍길동,80,90,100|홍길순,70,70,80|김자바,90,90,80";
		StringTokenizer st = new StringTokenizer(source, "|");

		while(st.hasMoreTokens()){
		    String item = st.nextToken();
		    StringTokenizer st2 = new StringTokenizer(item, ",");
		    while(st2.hasMoreTokens()){
		    	System.out.println(st2.nextToken());
		    }
		    System.out.println("==========");
		}
	}
}
