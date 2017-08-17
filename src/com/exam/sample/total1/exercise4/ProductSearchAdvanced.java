package com.lgcns.sample.total1.exercise4;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeMap;

public class ProductSearchAdvanced {
	private static TreeMap<String, Product> orderedMap = new TreeMap<String, Product>();
	private static TreeMap<String, Product> reversedMap = new TreeMap<String, Product>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		Random rnd = new Random();

		Product[] products = new Product[1000000];
		for (int n = 0; n < 1000000; n++) {
			StringBuffer buf = new StringBuffer();
			for (int i = 0; i < 12; i++) {
				if (rnd.nextBoolean()) {
					buf.append((char) ((int) (rnd.nextInt(26)) + 65));
				} else {
					buf.append((rnd.nextInt(10)));
				}
			}
			Product p = new Product(buf.toString(), 1000000, "description");
			products[n] = p;
		}

		makeProductCache(products);

		System.out.print("제품코드를 입력하세요> ");
		String input = sc.next();
		while (!input.equals("0")) {
			long start = System.currentTimeMillis();
			getList(input);
			long end = System.currentTimeMillis();
			System.out.println("소요시간:" + (end-start) + "ms");
			System.out.print("제품코드를 입력하세요> ");
			input = sc.next();
		}
		sc.close();

	}

	private static void getList(String query) {
		Map<String, Product> resultMap = new HashMap<String, Product>();
		if (query.endsWith("*")) {
			String key = query.substring(0, query.length() - 1);
			resultMap = orderedMap.subMap(key + "000000000", true, key + "ZZZZZZZZZ", true);
		} else if (query.startsWith("*")) {
			String key = query.substring(1, query.length());
			StringBuilder sb = new StringBuilder(key);
			String reverseKey = sb.reverse().toString();
			resultMap = reversedMap.subMap(reverseKey + "000000000", true, reverseKey + "ZZZZZZZZZ", true);
		} else {
			if (orderedMap.containsKey(query)){
				resultMap.put(query, orderedMap.get(query));
			}
		}
		if(resultMap.size() > 0) {
			for (String key : resultMap.keySet()) {
				System.out.println(resultMap.get(key));
			}
			System.out.println("상품 " + resultMap.size() + "개를 찾았습니다.");	
		} else {
			System.out.println("일치하는 상품이 없습니다.");	
		}
	}

	public static void makeProductCache(Product[] products) {
		for (Product p : products) {
			orderedMap.put(p.code, p);

			StringBuilder sb = new StringBuilder(p.code);
			String reverseKey = sb.reverse().toString();
			reversedMap.put(reverseKey, p);
		}
	}
}
