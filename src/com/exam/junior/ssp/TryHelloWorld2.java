package com.exam.junior.ssp;

class TryHelloWorld2
{
    public int nextBigNumber(int n)
    {
        int answer = 0;
        
        int oneCnt = getOneCnt(n);
        
        for(int i=1; i <= 1000000 ; i++) {
        	if(n == i) {
        		continue;
        	}
        	int cOneCnt = getOneCnt(i);
        	if(cOneCnt == oneCnt && n < i) {
        		answer = i;
        		break;
        	}
        }

        return answer;
    }
    public static void main(String[] args)
    {
        TryHelloWorld2 test = new TryHelloWorld2();
        int n = 78;
        System.out.println(test.nextBigNumber(n));
    }
    
    public static int getOneCnt(int nn) {
        //int oneCnt = 0;
        int oneCnt = Integer.bitCount(1);
        /*String binary = Integer.toBinaryString(nn);
        for(int i=0; i < binary.length() ;i++) {
        	if(binary.charAt(i) == '1') {
        		oneCnt++;
        	}
        }*/
        return oneCnt;
    }
}