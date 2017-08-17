package com.lgcns.exercise.accesslog;

public class AccessLogParsing {

    private int success;
    private int images;

    public int getSuccess() {
        return success; //200
    }

    public int getImages() {
        return images; //jpg, gif, png
    }

    // --------------------------------------
    // 아래 메소드에 로직을 구현하시오.
    public void parse( String[] parseLog ) {
    	
    	String logLine = null;
    	
    	for (int inx =0; inx < parseLog.length; inx++){
    		logLine = parseLog[inx];

    		String[] log = logLine.split(" ");
    		
    		if(log[6].indexOf("jpg") != -1 || log[6].indexOf("gif") != -1 || log[6].indexOf("png") != -1) images++;
    		if(log[8].equals("200")) success++;
    	    		
//    		if(log[6].indexOf("jpg") != -1 || log[6].indexOf("gif") != -1 || log[6].indexOf("png") != -1){
//    			images++;
//    	    //	System.out.println(log[6]);
//    	    		}
//    	    
//    		
//    		if(log[8].equals("200")){
//    			success++;
//		    	System.out.println(log[8]);
//		    		}
    	}

    }

}
