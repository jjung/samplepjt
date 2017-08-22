package com.exam.sample.javaapi;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * [실습] 콘솔 입력을 받아 성적을 계산하는 프로그램 작성
 * 실행 결과와 같이 메뉴입력을 받아 수학, 영어, 국어의 평균 점수를 출력하는 프로그램을 작성하시오.

 * [실행결과]
 * ====================
 * 1. 성적입력을 계속한다
 * 2. 프로그램을 종료한다
 * ====================
 * 1
 * 이름은? 홍길동
 * 수학점수는? 100
 * 영어점수는? 90
 * 국어점수는? 80
 * ====================
 * 1. 성적입력을 계속한다
 * 2. 프로그램을 종료한다
 * ====================
 * 1
 * 이름은? 홍길순
 * 수학점수는? 100
 * 영어점수는? 100
 * 국어점수는? 100
 * ====================
 * 1. 성적입력을 계속한다
 * 2. 프로그램을 종료한다
 * ====================
 * 2
 * 평균 수학점수: 100
 * 평균 영어점수: 95
 * 평균 국어점수: 90
 *  
 */
public class ConsoleIOTest {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> studentList = new ArrayList<Student>();

		printMenu();
		int menu = sc.nextInt();
		while (menu != 2) {
			System.out.print("이름은? ");
			String name = sc.next();
			System.out.print("수학점수는? ");
			int math = sc.nextInt();
			System.out.print("영어점수는? ");
			int eng = sc.nextInt();
			System.out.print("국어점수는? ");
			int kor = sc.nextInt();

			Student student = new Student(name, math, eng, kor);
			studentList.add(student);

			printMenu();
			menu = sc.nextInt();
		}
		
		double sumMath = 0;
		double sumEng = 0;
		double sumKor = 0;
		for(Student student : studentList) {
			sumMath = sumMath + student.getMath();
			sumEng = sumEng + student.getEng();
			sumKor = sumKor + student.getKor();
		}

		double avgMath = sumMath / studentList.size();
		double avgEng = sumEng / studentList.size();
		double avgKor = sumKor / studentList.size();
		
		System.out.println("평균 수학점수: " + Math.round(avgMath*100)/100.0);
		System.out.println("평균 영어점수: " + Math.round(avgEng*100)/100.0);
		System.out.println("평균 국어점수: " + Math.round(avgKor*100)/100.0);
	}

	private static void printMenu() {
		System.out.println("====================");
		System.out.println("1. 성적입력을 계속한다");
		System.out.println("2. 프로그램을 종료한다");
		System.out.println("====================");
	}
}

class Student {
	private String name;
	private int math;
	private int eng;
	private int kor;
	public Student(String name, int math, int eng, int kor) {
		this.name = name;
		this.math = math;
		this.eng = eng;
		this.kor = kor;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the math
	 */
	public int getMath() {
		return math;
	}
	/**
	 * @param math the math to set
	 */
	public void setMath(int math) {
		this.math = math;
	}
	/**
	 * @return the eng
	 */
	public int getEng() {
		return eng;
	}
	/**
	 * @param eng the eng to set
	 */
	public void setEng(int eng) {
		this.eng = eng;
	}
	/**
	 * @return the kor
	 */
	public int getKor() {
		return kor;
	}
	/**
	 * @param kor the kor to set
	 */
	public void setKor(int kor) {
		this.kor = kor;
	}
}