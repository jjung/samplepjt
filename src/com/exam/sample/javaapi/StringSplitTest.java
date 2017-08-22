package com.exam.sample.javaapi;

/**
 * [실습] String.split() 사용
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
public class StringSplitTest {
	public static void main(String[] args) {
		String source = "홍길동,80,90,100|홍길순,70,70,80|김자바,90,90,80";
		String[] items = source.split("\\|");
		for(String item : items) {
			String[] tokens = item.split(",");
			for(String token : tokens) {
				System.out.println(token);
			}
			System.out.println("==========");
		}
	}
}
