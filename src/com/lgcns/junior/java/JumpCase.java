package com.lgcns.junior.java;

public class JumpCase {

    public int jumpCase(int num) {
        int answer = 0;

        if(num == 1){
        	answer = 1;
        }else if(num == 2){
        	answer = 2;
        }else{
        	answer = jumpCase(num - 1) + jumpCase(num -2);
        }
        return answer;
    }

    public static void main(String[] args) {
        JumpCase c = new JumpCase();
        int testCase = 4;
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println(c.jumpCase(testCase));
    }
}
