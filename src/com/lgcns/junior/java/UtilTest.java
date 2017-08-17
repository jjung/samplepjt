package com.lgcns.junior.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UtilTest {
	
	public static void main(String[] args) {
		
		int[] numberArray = {5, 2, 1, 7, 8, 6, 9, 3, 4, 10}; //new int[ 10 ];
		int[] beforeArr = {5, 2, 1, 7, 8, 6, 9, 3, 4, 10};

		Arrays.sort(beforeArr);
		
		for(int i : beforeArr){
			System.out.println(i);
		}
		
//		Arrays.sort(numberArray, Collections.reverseOrder());

//		List<int[]> list = Arrays.asList(numberArray);
//	//	Collections.sort(list);
//		
//		Collections.reverse(list);

	}

}
