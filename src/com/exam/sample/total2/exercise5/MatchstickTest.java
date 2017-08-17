package com.lgcns.sample.total2.exercise5;

import java.util.HashMap;

/*
 * 성냥개비는 숫자를 나타내기에 아주 이상적인 도구이다. 보통 십진수를 성냥개비로 표현하는 방법은 다음과 같다.
 * 1 - 2개, 2 - 5개, 3 - 5개, 4 - 4개, 5 - 5개, 6 - 6개, 7 - 3개, 8 - 7개, 9 - 6개
 * 성냥개비의 개수가 주어졌을 때, 성냥개비를 모두 사용해서 만들 수 있는 가장  작은 수를 찾는 프로그램을 작성하시오.
 * 
 * [실행 결과]
 * 
 * 입력 : 4  가장 작은 수 : 4
 * 입력 : 3  가장 작은 수 : 7
 * 입력 : 6  가장 작은 수 : 6
 * 입력 : 7  가장 작은 수 : 8
 * 입력 : 15  가장 작은 수 : 168
 * 
 */
public class MatchstickTest {

	private static final int DEFAULT_VALUE = 7;
	
	@SuppressWarnings("serial")
	private static final HashMap<Integer, Integer> minMap = new HashMap<Integer, Integer>() {
		{
            put(2,1);
            put(3,7);
            put(4,4);
            put(5,2);
            put(6,6);
            put(7,8);
            // 8, 9, 10, 11 의 4가지 케이스는 무조건 7개를 뽑으면 안되는 케이스이므로 해당 경우의 최소의 숫자 조합을 맵에 추가
            put(8,16);
            put(9,18);
            put(10,22);
            put(11,26);
         }
    };
	
	public static void main(String args[]) {
		int[] inputs = {4, 3, 6, 7, 15};
		
		for(int input:inputs) {
			System.out.println("입력 : " + input + "  가장 작은 수 : " + getMinNumber(input));
		}
	}
	
	/*
	 * 가작 큰 수를 구할 때는 자릿수를 줄이기 위해 최대한 적은 개수를 뽑아야 하므로 기본적으로 최대한 성냥개비가 많이 필요한 숫자를 뽑아 일의 자리부터 배치해야 한다.
	 * 7개씩 뽑다가 마지막에 11개 이하가 남으면 해당 개수에 맞는 가장 적은 숫자의 조합을 맵에서 가져온다.
	 */
	private static String getMinNumber(int input) {
		StringBuilder maxNumber = new StringBuilder("");
		
		while(input > 0) {
			if(minMap.containsKey(input)) {
				maxNumber.insert(0, minMap.get(input));
				input = 0;
			}else {
				maxNumber.insert(0, minMap.get(DEFAULT_VALUE));
				input = input - DEFAULT_VALUE;
			}
		}
		
		return maxNumber.toString();
	}
}
