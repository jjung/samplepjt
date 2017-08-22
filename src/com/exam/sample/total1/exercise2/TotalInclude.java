package com.exam.sample.total1.exercise2;

public class TotalInclude {
	public static void main(String[] args) {
		String input1 = "abcdefabcdefabc";
		String include1 = "abc";
		String input2 = "abcdeabcde";
		String include2 = "cde";
		String input3 = "cbcbcbc";
		String include3 = "cbc";
		System.out.println(input1 + " / " + include1 + " = "
				+ countInclude(input1, include1));
		System.out.println(input2 + " / " + include2 + " = "
				+ countInclude(input2, include2));
		System.out.println(input3 + " / " + include3 + " = "
				+ countInclude(input3, include3));
		
		
		countIndexoF(input1, include1);
		countIndexoF(input2, include2);
		countIndexoF(input3, include3);
	}

	private static int countIndexoF(String input, String input2){
		int count = 0;
		for(int inx=0; inx < input.length(); inx++){

			if(input.substring(inx).indexOf(input2) == 0){
				count++;
			}
				
		}
		System.out.println(count);
		
		
		return count;
	}
	
	
	
	
	
	
	
	
	
	
	private static int countInclude(String input, String include) {
		// int count = 0;
		// int index = input.indexOf(include);
		// while (index >= 0) {
		// input = input.substring(index + include.length());
		// index = input.indexOf(include);
		// count++;
		// }

		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.substring(i).indexOf(include) == 0) {
				count++;
			}
		}
		return count;
	}
}
