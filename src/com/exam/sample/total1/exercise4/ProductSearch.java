package com.lgcns.sample.total1.exercise4;

import java.util.HashMap;
import java.util.Scanner;

public class ProductSearch {
	private static HashMap<String, Product> productMap = new HashMap<String, Product>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Product p1 = new Product("ABC123211BBD", 100, "100");
		Product p2 = new Product("ABC234211DEF", 200, "200");
		Product p3 = new Product("ABD234211BBD", 300, "300");

		Product[] products = new Product[] { p1, p2, p3 };
		makeProductCache(products);

		System.out.print("제품코드를 입력하세요> ");
		String input = sc.next();
		while (!input.equals("0")) {
			getList(input);
			System.out.print("제품코드를 입력하세요> ");
			input = sc.next();
		}
		sc.close();
	}

	private static void getList(String query) {
		HashMap<String, Product> resultMap = new HashMap<String, Product>();
		if (query.endsWith("*")) {
			for(String key : productMap.keySet()) {
				if (key.startsWith(query.substring(0, query.length() - 1))) {
					resultMap.put(key, productMap.get(key));
				}
			}
		} else if (query.startsWith("*")) {
			for(String key : productMap.keySet()) {
				if (key.endsWith(query.substring(1, query.length()))){
					resultMap.put(key, productMap.get(key));
				}
			}
		} else {
			if (productMap.containsKey(query)){
				resultMap.put(query, productMap.get(query));
			}
		}
		
		if(resultMap.size() > 0) {
			for (String key : resultMap.keySet()) {
				System.out.println(resultMap.get(key));
			}
		} else {
			System.out.println("일치하는 상품이 없습니다.");	
		}
		
	}

	public static void makeProductCache(Product[] products) {
		for (Product p : products) {
			productMap.put(p.code, p);
		}
	}
}

class Product {
	String code;
	int price;
	String description;

	public Product(String code, int price, String description) {
		this.code = code;
		this.price = price;
		this.description = description;
	}

	public String toString() {
		return "제품코드: " + this.code + " 제품명: " + this.description + " 가격: " + this.price;
	}
}