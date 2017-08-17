package com.lgcns.sample.total1.exercise3;

import java.util.Arrays;

public class Lotto {

	public static void main(String[] args) {

		int my[] = { 3, 13, 35, 24, 44, 28 };
		int lotto[] = lotto();

		printMyArray(my);
		printLottoArray(lotto);

		compare(my, lotto);
	}

	private static void printLottoArray(int[] lotto) {
		System.out.print("Lotto 당첨 번호는 ");
		printArray(Arrays.copyOf(lotto, 6));
		System.out.print("(보너스번호: " + lotto[6] + ")");
		System.out.println(" 입니다.");
	}

	private static void printMyArray(int[] my) {
		System.out.print("당신의 번호는 ");
		printArray(my);
		System.out.println(" 입니다.");
	}

	private static void compare(int[] my, int[] lotto) {

		// 오름차순으로 배열을 정렬한다.
		Arrays.sort(my);

		// 보너스 숫자와 보너스가 아닌 숫자를 구분한다.
		// 보너스가 아닌 숫자를 오름차순으로 정렬한다.
		int bonus = lotto[6];
		int[] lottoWithoutBonus = Arrays.copyOf(lotto, 6);
		Arrays.sort(lottoWithoutBonus);

		int match = 0;
		for (int myInt : my) {
			for (int lottoInt : lottoWithoutBonus) {
				if (myInt == lottoInt) {
					match++;
				}
			}
		}

		switch (match) {

		case 0:
			System.out.println("0개 맞았습니다. 꽝입니다.");
			break;
		case 1:
			System.out.println("1개 맞았습니다. 꽝입니다.");
			break;
		case 2:
			System.out.println("2개 맞았습니다. 꽝입니다.");
			break;
		case 3:
			System.out.println("축하합니다. 5등입니다.");
			break;
		case 4:
			System.out.println("축하합니다. 4등입니다.");
			break;
		case 5:
			boolean bonusMatch = false;
			for (int myInt : my) {
				if (bonus == myInt) {
					bonusMatch = true;
				}
			}
			if (bonusMatch) {
				System.out.println("축하합니다. 2등입니다.");
			} else {
				System.out.println("축하합니다. 3등입니다.");
			}
			break;
		case 6:
			System.out.println("축하합니다. 1등입니다.");
			break;
		default:
			break;
		}

	}

	private static void printArray(int[] lotto) {
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}

	private static int[] lotto() {
		int lotto[] = new int[7];

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45) + 1;
			// 랜덤 값 반환
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				} // 중복 값 제거1
			}
		}
		return lotto;
	}
}
