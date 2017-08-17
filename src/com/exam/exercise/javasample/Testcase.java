package com.lgcns.exercise.javasample;

public class Testcase {
	
	public static void main(String[] args) {
		int[] numbers = {55,66,77,88,99};
		for (int num : numbers){
			System.out.println(num);
		}
		
		boolean breakValue = true;
		int tempNum = 0;
		int index = 0;
		while (breakValue) {
			tempNum = numbers[index];
			if(tempNum == 88){
			breakValue = false;
			System.out.println(tempNum);
			}
			index ++;
		}
	}

}
