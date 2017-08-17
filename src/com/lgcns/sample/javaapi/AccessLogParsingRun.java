package com.lgcns.sample.javaapi;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/**
 * [실습] Log Parsing
 * access.log 파일을 파싱하여 URL 호출 성공 횟수와 이미지 파일 호출 횟수를 세는 프로그램을 작성한다.
 * <요구사항>
 * 1. access.log 파일을 읽어 들여 문자열을 파싱한다.
 * 2. HTTP 상태 값이 200(성공)인 라인의 수를 센다.
 * 3. 이미지 파일이 호출된 라인 수를 센다. (HTTP 상태와는 상관 없음)
 *  그림 파일은 대소문자 구분 없이 jpg, gif, png 확장자로 끝난다. 단, 디렉토리가 /png/와 같이 포함된 경우도 있다.
 * 4. access.log 파일은 아래와 같은 형태로 구성되어 있다.

 * [실행결과]
 * Result Status 200 count : 1274
 * Image file count : 500
 * 
 */
public class AccessLogParsingRun {

    public static void main( String[] args ) throws IOException {
        AccessLogParsing accessLog = new AccessLogParsing();
        accessLog.parse( parseLog() );
        print( accessLog );
    }

    private static void print( AccessLogParsing accessLog ) {

        System.out.println( "Result Status 200 count : " + accessLog.getSuccess() );
        System.out.println( "Image file count : " + accessLog.getImages() );
    }
    
    private static String[] parseLog() throws IOException {
        Path filePath = new File( "data/access.log" ).toPath();
        Charset charset = Charset.forName( "UTF-8" );

        List<String> stringList = Files.readAllLines( filePath, charset );
        return stringList.toArray( new String[] {} );
    }

}
