package com.exam.junior.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.exam.junior.ssp.User;

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
		
		//	User [] userArr = {new User(), new User()};
		
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
        System.out.println("List -> String[]");
        for(String s : sArrays){
            System.out.println(s);
        }
         
        // String[] -> List
        ArrayList<String> mNewList = new ArrayList<String>(Arrays.asList(sArrays));
        System.out.println("String[] -> List");
        for(String s : mNewList){
            System.out.println(s);
        }

        // 단순 sort 
        int [] numarray = {1, 57, 20, 399, 62};

        Arrays.sort(numarray);
        System.out.println("sort result =>");
        for(int s : numarray){
            System.out.println(s);
        }
        
        // binarySearch
        System.out.println("binarySearch index =>");
        System.out.println(Arrays.binarySearch(numarray, 57));
		
		
		/////SORT
		int[] arraa = {4, 23, 12, 16, 91, 59, 73, 28, 33, 41};

		List<int[]> listaa = Arrays.asList(arraa);
		
		//Collections.sort(listaa);
		
		Collections.reverse(listaa);
		
        /**
         * sort 방식
         * 
         */
        
		// TODO Auto-generated method stub
		List<User> users = getCreateUsers();
 
		System.out.println("===== 정렬 하기전 =====");
		for (User temp : users) {
			System.out.println(temp);
		}
 
		Collections.sort(users, new NameAscCompare());
		System.out.printf("\n\n===== 문자 오름 차순 정렬 =====\n");
		for (User temp : users) {
			System.out.println(temp);
		}
 
		Collections.sort(users, new NameDescCompare());
		System.out.printf("\n\n===== 문자 내림 차순 정렬 =====\n");
		for (User temp : users) {
			System.out.println(temp);
		}
 
		Collections.sort(users, new NoAscCompare());
		System.out.printf("\n\n===== 숫자 오름 차순 정렬 =====\n");
		for (User temp : users) {
			System.out.println(temp);
		}
 
		Collections.sort(users, new NoDescCompare());
		System.out.printf("\n\n===== 숫자 내림 차순 정렬 =====\n");
		for (User temp : users) {
			System.out.println(temp);
		}
	}
 
 
	/**
	 * User Data Create
	 * @return
	 */
	 private static List<User> getCreateUsers() {
		// TODO Auto-generated method stub
		 List<User> users = new ArrayList<User>();
 
		 User user = new User();
		 user.setName("고철수");
		 user.setAddress("경기도 성남시 분당구");
		 user.setPhone("010-1234-0192");
		 user.setNo(1);
		 users.add(user);
 
 
		 user = new User();
		 user.setName("박영희");
		 user.setAddress("부산 해운대");
		 user.setPhone("010-4234-0192");
		 user.setNo(2);
		 users.add(user);
 
 
		 user = new User();
		 user.setName("감수왕");
		 user.setAddress("충북 제천");
		 user.setPhone("010-7234-0192");
		 user.setNo(3);
		 users.add(user);
 
 
		 user = new User();
		 user.setName("이사람");
		 user.setAddress("강원도 영울");
		 user.setPhone("010-0234-0192");
		 user.setNo(4);
		 users.add(user);
		return users;
	}
 
 
	 private static class User {
		private int no;
		private String name;
		private String address;
		private String phone;
		public int getNo() {
			return no;
		}
		public void setNo(int no) {
			this.no = no;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		
		public String toString(){
			return "no= " + no + " name= " + name + " address= " + address + " phone= " + phone;
		}
	 }
	 /**
	  * 이름 오름차순
	  * @author falbb
	  *
	  */
	static class NameAscCompare implements Comparator<User> {
 
		/**
		 * 오름차순(ASC)
		 */
		@Override
		public int compare(User arg0, User arg1) {
			// TODO Auto-generated method stub
			return arg0.getName().compareTo(arg1.getName());
		}
 
	}
 
	/**
	 * 이름 내림차순
	 * @author falbb
	 *
	 */
	static class NameDescCompare implements Comparator<User> {
 
		/**
		 * 내림차순(DESC)
		 */
		@Override
		public int compare(User arg0, User arg1) {
			// TODO Auto-generated method stub
			return arg1.getName().compareTo(arg0.getName());
		}
		//현재의 객체가 다른객체와 비교하여 최종 반환되는 값이 0이면 순서가 같음을 의미하고, 
		//반환되는 값이 양수이면 순서가 뒤에 위치함을 의미하고, => 순서를 바꿔야햄
		//반환되는 값이 음수이면 순서가 앞에 있음을 의미한다. => 그대로 두면 돼(순서 맞음)
		//비교하는 주체는 해당 메소드를 호출하는 객체가 주체자가 되고, 
		//비교대상은 주체자를 제외한 다른 객체를 의미한다
	}
 
	 /**
	  * No 오름차순
	  * @author falbb
	  *
	  */
	static class NoAscCompare implements Comparator<User> {
 
		/**
		 * 오름차순(ASC)
		 */
		@Override
		public int compare(User arg0, User arg1) {
			// TODO Auto-generated method stub
			return arg0.getNo() < arg1.getNo() ? -1 : arg0.getNo() > arg1.getNo() ? 1:0;
		}
			//3항연산자 => (boolean) ? c(true일경우) : d(false일경우)
	}
 
	/**
	 * No 내림차순
	 * @author falbb
	 *
	 */
	static class NoDescCompare implements Comparator<User> {
 
		/**
		 * 내림차순(DESC)
		 */
		@Override
		public int compare(User arg0, User arg1) {
			// TODO Auto-generated method stub
			return arg0.getNo() > arg1.getNo() ? -1 : arg0.getNo() < arg1.getNo() ? 1:0;
		}
 
	}

}
