package com.lgcns.sample.total2.exercise4;

/*
 * 성냥개비는 숫자를 나타내기에 아주 이상적인 도구이다. 보통 십진수를 성냥개비로 표현하는 방법은 다음과 같다.
 * 1 - 2개, 2 - 5개, 3 - 5개, 4 - 4개, 5 - 5개, 6 - 6개, 7 - 3개, 8 - 7개, 9 - 6개
 * 성냥개비의 개수가 주어졌을 때, 성냥개비를 모두 사용해서 만들 수 있는 가장  큰 수를 찾는 프로그램을 작성하시오.
 * 
 * [실행 결과]
 * 
 * 입력 : 4  가장 큰 수 : 11
 * 입력 : 3  가장 큰 수 : 7
 * 입력 : 6  가장 큰 수 : 111
 * 입력 : 7  가장 큰 수 : 711
 * 입력 : 15  가장 큰 수 : 7111111
 * 
 */
public class MatchstickTest {
	private static final int MIN_COUNT = 2;
	private static final int MIN_NUMBER = 1;
	private static final int MAX_COUNT = 3;
	private static final int MAX_NUMBER = 7;
	
	public static void main(String args[]) {
		int[] inputs = {4, 3, 6, 7, 15};
		
		for(int input:inputs) {
			System.out.println("입력 : " + input + "  가장 큰 수 : " + getMaxNumber(input));
		}
	}
	
	/*
	 * 가작 큰 수를 구할 때는 최대한 많은 수를 뽑아야 하므로 최대한 성냥개비가 적게 필요한 숫자를 뽑아 일의 자리부터 배치해야 한다.
	 * 2개씩 뽑다가 마지막에 3개가 남으면 3개가 필요한 숫자를 제일 큰 자리에 배치한다.
	 */
	private static String getMaxNumber(int input) {
		StringBuilder maxNumber = new StringBuilder("");
		
		while(input > 0) {
			if(input == MAX_COUNT) {
				maxNumber.insert(0, MAX_NUMBER);
				input = input - MAX_COUNT;
			}else {
				maxNumber.insert(0, MIN_NUMBER);
				input = input - MIN_COUNT;
			}
		}
		
		return maxNumber.toString();
	}
}
