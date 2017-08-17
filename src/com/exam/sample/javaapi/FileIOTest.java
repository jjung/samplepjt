package com.lgcns.sample.javaapi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * [실습] 파일 입력을 받아 성적을 계산하는 프로그램 작성
 * 파일로 성적 정보를 입력 받아 수학, 영어, 국어의 평균 점수를 출력하는 프로그램을 작성하시오.
 * 
 * 파일 포맷은 다음과 같다.
 * 이름|수학점수|영어점수|국어점수
 * <파일 내용>
 * 홍길동|100|90|80
 * 홍길순|100|100|100
 * 김자바|100|95|90

 * [실행결과]
 * 평균 수학점수: 100
 * 평균 영어점수: 95
 * 평균 국어점수: 90
 *  
 */
public class FileIOTest {
	public static void main(String args[]) throws IOException {
		ArrayList<Student> studentList = new ArrayList<Student>();

		FileReader fr = new FileReader("data/score.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String line = "";
		while((line=br.readLine())!=null) {
			String[] tokens = line.split("\\|");
			String name = tokens[0];
			int math = Integer.parseInt(tokens[1]);
			int eng = Integer.parseInt(tokens[2]);
			int kor = Integer.parseInt(tokens[3]);
			Student student = new Student(name, math, eng, kor);
			studentList.add(student);
		}
		br.close();

		
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
}