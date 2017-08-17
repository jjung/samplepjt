package com.lgcns.exercise.problem;

import java.text.SimpleDateFormat;
import java.util.Date;

public class OneSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		long number = 1;
//		for (int inx = 1; inx < 101; inx ++){
//			number = number * inx;
//			System.out.println(number);
//		}
//		System.out.println(number);


        int a=5, b=24;
        System.out.println(getDayName(a,b));
        int b2=23;
        System.out.println(getDayName(a,b2));
        int b3=29;
        System.out.println(getDayName(a,b3));
      
        int c=10, d=7;
        System.out.println(getDayName(c,d));

	}
	
    public static String getDayName(int a, int b)
    {
        String answer = "";
        String stringDate = "";
        String mm = "";
        String dd = "";
  
				SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
      try{
        if(a < 10) {
          mm = "0" + a; 
        }else{
          mm = "" + a; 
        }
        if(b < 10) {
          dd = "0" + b; 
        }else{
          dd = "" + b; 
        }
        stringDate = "2016" + mm + dd;
        System.out.println(stringDate);
      
        Date referenceDate = formatter.parse(stringDate);
        
        String[] dayArray = {"SUN", "MON", "TUE", "WED", "THU", "FRI",  "SAT"};
        System.out.println(dayArray[referenceDate.getDay()]);
      }catch (Exception e){
      }
        return answer;
    }

}
