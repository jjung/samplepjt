package com.lgcns.sample.excetion.exercise2;

import java.util.ArrayList;

/*
 * 나머지 공부 과목 찾기
 * 
 * 과목의 점수가 70점 미만이면 나머지 공부를 해야 한다. 
 * 아래 데이터를 보고, 점수가 70점 미만인 과목은 Exception 을 강제로 발생시켜 보자. 
 * 과목의 정보는 ArrayList 를 이용하여 관리한다.
 *  - 데이터 : 역사(86점), 지리(65점), 생물(58점), 물리(76점)
 * 
 * 
 * [실행 결과]
 * 
 * 나머지 공부를 해야 하는 과목은?
 * 지리 ( 65점 )
 * 생물 ( 58점 )
 * 
 */
public class ExamFailTest {
    
    public static void main( String[] args ) {
        
        ArrayList<Subject> subjectList = new ArrayList<Subject>();
        
        subjectList.add( new Subject( "역사", 86 ) );
        subjectList.add( new Subject( "지리", 65 ) );
        subjectList.add( new Subject( "생물", 58 ) );
        subjectList.add( new Subject( "물리", 76 ) );
        
        System.out.println( "나머지 공부를 해야 하는 과목은?" );
        
        for ( Subject subject : subjectList ) {
            
            try {
                if ( subject.getScore() < 70 ) {
                    throw new Exception( subject.getName() + " (" + subject.getScore() + "점)" );
                }
            } catch ( Exception e ) {
                System.out.println( e.getMessage() );
            }
        }
    }
}