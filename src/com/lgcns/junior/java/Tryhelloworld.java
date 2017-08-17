package com.lgcns.junior.java;

public class Tryhelloworld {
	public static void main(String[] args) {
		Tryhelloworld test = new Tryhelloworld();
		int n = 78;
		System.out.println(test.nextBigNumber(n));
	}

	public int nextBigNumber(int n) {
		int answer = 0;

		String binarystr = Integer.toBinaryString(n);
		String onebinary = binarystr.replace("0", "");
		int onecount = onebinary.length();

		answer = n + 1;
		while (true) {
			String tempbinarystr = Integer.toBinaryString(answer);
			String temponebinary = tempbinarystr.replace("0", "");
			int temponecount = temponebinary.length();
			answer++;
			if (onecount == temponecount) {
				answer = Integer.parseInt(tempbinarystr, 2);
				break;
			}
		}
		return answer;
	}
}
