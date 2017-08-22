package com.exam.sample.total2.exercise3;

/*
 * 직원 급료 계산해서 출력하기
 * 
 * 임시직 : 일수 * 일당
 * 정규직 : 고정급
 * 영업직 : 고정급+(실적*수수료율)
 * 관리직 :
 *   고정급이 250만원이상 -> 인센티브 0.6%
 *   고정급이 200만원이상 -> 인센티브 0.5%
 *   고정급이 200만원미만 -> 인센티브 0.4%
 * 
 * 
 * [실행 결과]
 * 
 * 이름 : 박치기, 나이 : 21, 월  급 : 1800000.0원
 * 이름 : 홍길동, 나이 : 23, 고정급 : 1234000.0원
 * 이름 : 한송이, 나이 : 25, 수령액 : 2345750.0원
 * 이름 : 한국인, 나이 : 27, 수령액 : 4088000.0원
 * 
 */
public class EmployeeTest {
	public static void main(String[] args) {
		Temporary tem = new Temporary("박치기", 21, 20, 90000);
		tem.print();
		Regular reg = new Regular("홍길동", 23, 1234000);
		reg.print();
		SalesMan sal = new SalesMan("한송이", 25, 2345000, 3000, 0.25);
		sal.print();
		Manager man = new Manager("한국인", 27, 2555000);
		man.print();
	}
}