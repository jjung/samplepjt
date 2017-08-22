package com.exam.sample.total1.exercise1;

public class StringCompress {
	public static void main(String[] args) {
		String input1 = "aaabbbcccaabab";
		String input2 = "aaabbbcccaab";
		
		compress(input1);
		compress(input2);
		//System.out.println(input1 + "->" + compress(input1));
		//System.out.println(input2 + "->" + compress(input2));

	}
	
	
	private static String compress(String input) {
		StringBuffer returnString = new StringBuffer();
		int count = 1;
		input = input.toLowerCase();
		for (int inx=0; inx < input.length(); inx++){
			if(inx+1 == input.length()){
				char nowchar = input.charAt(inx);
				returnString.append(nowchar);
				if(count != 1) returnString.append(count); count =1;
			}else{
				char nowchar = input.charAt(inx);
				char nextchar = input.charAt(inx+1);
				if(nowchar == nextchar){
					count++;
				}else{
					returnString.append(nowchar);
					if(count != 1) returnString.append(count); count =1;
				}
			}

		}

		System.out.println(returnString.toString());
		
		
		return returnString.toString();
	}
	
	
	

//	private static String compress(String input) {
//		StringBuffer sb = new StringBuffer();
//		int count = 1;
//		for (int i=0; i<input.length(); i++) {
//			if (i != input.length() - 1
//					&& input.charAt(i) == input.charAt(i + 1)) {
//				count ++;
//			} else {
//				sb.append(input.charAt(i)).append(count);
//				count = 1;
//			}
//		}
//		if (sb.toString().length() > input.length()) {
//			return input;
//		} else {
//			return sb.toString();
//		}
//	}
}
