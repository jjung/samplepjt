package com.lgcns.exercise.triplegame;


public class TripleGame {

    // --------------------------------------
    // 아래 메소드에 로직을 구현하시오.
    public static int countTriple() {
        int cnt = 0;
        String contValue = "";

        for (int inx = 31; inx < 65; inx++){
        	contValue = String.valueOf(inx);

        	for (int jnx = 0; jnx < contValue.length(); jnx++){
        		if (contValue.charAt(jnx) =='3') cnt ++;
        		if (contValue.charAt(jnx) =='6') cnt ++;
        		if (contValue.charAt(jnx) =='9') cnt ++;
        	}
        	System.out.println(contValue);
    	}	
        
        return cnt;
    }

}
