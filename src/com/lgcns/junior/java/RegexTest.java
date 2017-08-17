package com.lgcns.junior.java;

public class RegexTest {

	public static void main(String[] args) {
		
		String regex = "\\d"; // \d 숫자 찾기 digit 줄임
							  // \d+라고 쓰면 "하나 혹은 그 이상 연결된 숫자"
		                      // 자연수는 [1-9]\d*, 0개 이상은 *으로 표현하는데요
							  // ?는 '있거나 없거나'
		                      // - 또는 (공백)이 있거나 없다는 조건은 [- ]
		String regexPhone = "\\d+[- ]?\\d+[- ]?\\d+";
							  // \d{2}라고 하면 정확히 2번의 숫자가 나타나는걸 의미
							  // 숫자가 2~3번 나오는 건 \d{2,3}
		String regexPhone2 = "\\d{2,3}[- ]?\\d{3,4}[- ]?\\d{4}";
		String regex2 = "\\w"; // \w 문자 찾기 word 줄임, _ 까지 포함해서 찾아줌
	}
}
