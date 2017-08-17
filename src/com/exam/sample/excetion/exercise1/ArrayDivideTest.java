package com.lgcns.sample.excetion.exercise1;

/*
 * 두 개의 배열 나누기
 * 
 * 아래 두 개의 배열이 있다. 
 * [10, 20, 13, 25], [2, 5, 0, 3]
 * 두 개의 배열에서 같은 인덱스 번호의 값을 추출하고, 
 * 첫 번째 배열의 값을 두 번째 배열의 값으로 나누기 연산을 실행해 보자.
 * 
 * 연산을 실행하다가 예외 상황이 발생하는 경우에는 예외 처리를 하여 
 * 프로그램이 비정상적으로 종료되지 못하게 한다.
 * 
 * 
 * [실행 결과]
 * 
 * 10 / 2 = 5
 * 20 / 5 = 4
 * 나누기 연산 시 에러가 발생하였습니다. 
 * 25 / 3 = 8
 * 
 */
public class ArrayDivideTest {
    
    public static void main( String[] args ) {
        
        int[] arrayOne = { 10, 20, 13, 25 };
        int[] arrayTwo = { 2, 5, 0, 3 };
        
        for ( int inx = 0 ; inx < arrayOne.length ; inx++ ) {
            try {
                System.out.println( arrayOne[inx] + " / " + arrayTwo[inx] + " = " + ( arrayOne[inx] / arrayTwo[inx] ) );
            } catch ( ArithmeticException e ) {
                System.out.println( "나누기 연산 시 에러가 발생하였습니다." );
            }
        }
    }
}