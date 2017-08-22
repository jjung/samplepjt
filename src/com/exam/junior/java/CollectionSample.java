package com.exam.junior.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionSample {

	
	public static void main(String[] args) {
		
		/**
		 * Array :   초기화 고정 int[] myArray = new int[6];
		 *           사이즈 변경 불가
		 *           다차원 가능 int[][][] muttiArray = new int [3][3][3];
		 * ArrayList : 초기화시 사이즈를 표시하지 않음. 유동적 ArrayList<Integer> myArrayList = new ArrayList<>();
		 *             추가 삭제 가능  add(), remove() 로 가능
		 *             다차원은 불가능
		 */
		
		String [] arr = {"uu", "mm", "ll"};
		//array -> arraylist 
		ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(arr));
		System.out.println("arr =>");
		System.out.println(arr);
		System.out.println("arrayList =>");
		System.out.println(arrayList);
		
		//특정값이 포함되어 있는지 확인하기
		boolean contains = Arrays.asList(arr).contains("ll");
		System.out.println("contains =>");
		System.out.println(contains);
		// OR
		for(String s: arr){
			if(s.equals("lll"))
				contains =  true;
		}
		contains =  false;
		System.out.println("contains =>");
		System.out.println(contains);
		
		
		// 특정값 제거하기
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(arr));
		 
		for (String s : list) {
			if (s.equals("mm"))
				list.remove(s);
		}

		System.out.println("size =>");
		System.out.println(list.size());
		System.out.println(arr.length);
		

		List<String> mList = new ArrayList<String>();
        mList.add("11");
        mList.add("22");
        mList.add("33");
         
        // List -> String[]
        String[] sArrays = mList.toArray(new String[mList.size()]);
         
        for(String s : sArrays){
            System.out.println(s);
        }
         
        // String[] -> List
        ArrayList<String> mNewList = new ArrayList<String>(Arrays.asList(sArrays));
         
        for(String s : mNewList){
            System.out.println(s);
        }

	}
}
