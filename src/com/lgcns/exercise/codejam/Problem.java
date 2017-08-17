package com.lgcns.exercise.codejam;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Problem {
	
	public static void main(String[] args) {
		String inputFile = "data/B-small-practice.in";
		String outputFile = "data/output1.txt";
		
		BufferedReader reader = null;
		BufferedWriter writer = null;
		try {
			reader = new BufferedReader(new FileReader(inputFile));
			writer = new BufferedWriter(new FileWriter(outputFile));
			
			// 첫줄 읽기 - 문항 숫자
			int totalCount = Integer.parseInt(reader.readLine());
			
			// 문항 읽어 가기
			for (int inx =0; inx < totalCount; inx++){
				String tempLine = reader.readLine();
				String[] tempValue = tempLine.split(" ");
				
				String anwserStr = calculateProblem(tempValue[0], tempValue[1], tempValue[2], tempValue[3], tempValue[4]);

				//output 만들기
				String output = "Case #" + (inx+1) + ": " + anwserStr + "\r\n";
				System.out.println(output);
				writer.write(output);
			}
			
			reader.close();
			writer.flush();
			writer.close();
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static String calculateProblem(String firstNum, String operator, String secondNum, String equalOperator, String resultNum){
		String anwserStr = null;
		
		int firstMark = firstNum.indexOf("?");
		int secondMark = secondNum.indexOf("?");
		int resultMark = resultNum.indexOf("?");
		
		//물음표가 하나도 없어졌을때 계산이 정확한지 확인
		if (firstMark<0  && secondMark<0 && resultMark<0){
			int firstNumber = Integer.parseInt(firstNum);
			int secondNumber = Integer.parseInt(secondNum);
			int resultNumber = Integer.parseInt(resultNum);
			
			if(operator.equals("+") && resultNumber==(firstNumber+secondNumber)){
				anwserStr = firstNum + " " + operator + " " + secondNum + " " + equalOperator + " " + resultNum;
			}else if (operator.equals("-") && resultNumber==(firstNumber-secondNumber)){
				anwserStr = firstNum + " " + operator + " " + secondNum + " " + equalOperator + " " + resultNum;
			}else{
				anwserStr = null;
			}
		}else if(firstMark<0){
			if(secondMark<0){
				// 결과값 ? 제거
				breakout1 :
				for (int i=0; i < 10; i++){
					if( i==0 && resultMark==0 ) continue;
					String tempResult = resultNum.substring(0, resultMark) + String.valueOf(i) + resultNum.substring(resultMark+1);
					anwserStr = calculateProblem(firstNum, operator, secondNum, equalOperator, tempResult);
					if( anwserStr !=null ) break breakout1;
				}
			}else{
				// 두번째값 ? 제거
				breakout2 :
				for (int i=0; i < 10; i++){
					if( i==0 && secondMark==0 ) continue;
					String tempSecond = secondNum.substring(0, secondMark) + String.valueOf(i) + secondNum.substring(secondMark+1);
					anwserStr = calculateProblem(firstNum, operator, tempSecond, equalOperator, resultNum);
					if( anwserStr !=null ) break breakout2;
				}
			}
		} else {
			// 첫번째값 ? 제거
			breakout3 :
			for (int i=0; i < 10; i++){
				if( i==0 && firstMark==0 ) continue;
				String tempFirst = firstNum.substring(0, firstMark) + String.valueOf(i) + firstNum.substring(firstMark+1);
				anwserStr = calculateProblem(tempFirst, operator, secondNum, equalOperator, resultNum);
				if( anwserStr !=null ) break breakout3;
			}
		}
		return anwserStr;
		
	}
	
}
