package com.exam.sample.total1.exercise4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductSearching {
	
	public static List<Product1> proList = new ArrayList<Product1>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product1 p1 = new Product1("ABC123211BBD", 100, "100");
		Product1 p2 = new Product1("ABC234211DEF", 200, "200");
		Product1 p3 = new Product1("ABD234211BBD", 300, "300");

		proList.add(p1);
		proList.add(p2);
		proList.add(p3);

		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("��ǰ�ڵ带 �Է��ϼ���>");
		String input = scan.next();
		while (!input.equals("0")) {

			getProductList(input);
			
			
			System.out.print("��ǰ�ڵ带 �Է��ϼ���> ");
			input = scan.next();
		}
		scan.close();
		
		
	}
	
	public static void getProductList(String input){
		List<Product1> resultList = new ArrayList<Product1>();
		for (Product1 pp : proList){
			if(input.endsWith("*")){
				if(pp.code.indexOf(input.substring(0, input.length()-1))==0) resultList.add(pp);
			}else{
				if(pp.code.equals(input)) resultList.add(pp);
			}
		}
		
		if(resultList.size() >0){
			for(Product1 pp : resultList){

				System.out.println(pp.toString());
			}
		}
	}
	
}
	
	
	
	
class Product1 {
	String code;
	int price;
	String description;

	public Product1(String code, int price, String description) {
		this.code = code;
		this.price = price;
		this.description = description;
	}

	public String toString() {
		return "��ǰ�ڵ�: " + this.code + " ��ǰ��: " + this.description + " ����: " + this.price;
	}
}
