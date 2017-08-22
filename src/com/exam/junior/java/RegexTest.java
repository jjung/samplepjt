package com.exam.junior.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
		
		String regex3 = "[\\W]+"; // 문자를 제외한 숫자,특수문자
		String regex4 = "[\\S]"; // 공백을 제외하고 붙음 문자들 찾기
		String regex5 = "[\\D]+"; // 숫자를 제외한 문자
		String regex6 = "[\\s]"; // 공백 찾기
		

		
		
		
		String searchTarget = "Luke Skywarker 02-123-4567 luke@daum.net\n다스베이더 070-9999-9999 darth_vader@gmail.com\nprincess leia 010 2454 3457 leia@gmail.com";
	
		Pattern pattern = Pattern.compile("\\d+");//여기에 정규표현식을 적습니다.
		Matcher matcher = pattern.matcher(searchTarget);
		while(matcher.find()){
			System.out.println(matcher.group(0));
		}
	}
}
