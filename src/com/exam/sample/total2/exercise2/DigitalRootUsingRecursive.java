package com.exam.sample.total2.exercise2;

/*
 * 디지털 루트
 * 
 * 양의 정수 N의 디지털 루트를 구하려면 N을 이루고 있는 모든 자리수를 더해야 한다. 이 때, 더한 값이 한 자리 숫자라면, 그 수가 N의 디지털 루트가 된다. 
 * 두 자리 이상 숫자인 경우에는 다시 그 수를 이루고 있는 모든 자리수를 더해야 하며, 한 자리 숫자가 될 때 까지 반복한다.
 * 24의 디지털 루트를 구해보자. 2+4=6이다. 6은 한 자리 숫자이기 때문에, 24의 디지털 루트는 6이 된다. 
 * 39의 경우에는 3+9=12이기 때문에, 한 번 더 더해야 한다. 따라서, 1+2=3이 디지털 루트가 된다.
 * 다음의 코드에서 양의 정수 N이 주어졌을 때, 그 수의 디지털 루트를 구하는 calculateDigitalRoot() 메서드를 작성하시오.

 * 
 * 
 * 
 * [실행 결과]
 * 
 * input : 24    digital root: 6
 * input : 39    digital root: 3
 * input : 3222    digital root: 9
 * 
 */
public class DigitalRootUsingRecursive {
	public static void main(String args[]) {
		int[] inputs = {24, 39, 3222};
		
		for(int input:inputs) {
			System.out.println("Input : " + input + "    Digital Root: " + calculateDigitalRootUsingRecursive(input));
		}
	}
	
	private static int calculateDigitalRootUsingRecursive(int input) {
		if(input < 10)
			return input;
		
		int digitalRoot = 0;
		while(input > 0) {
			digitalRoot += input%10;
			input = input/10;
		}
		
		return calculateDigitalRootUsingRecursive(digitalRoot);
	}
}
