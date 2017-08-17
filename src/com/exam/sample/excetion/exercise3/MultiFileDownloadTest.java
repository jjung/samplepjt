package com.lgcns.sample.excetion.exercise3;

/*
 * 파일 다운로드 동시 진행 표시
 * 
 * 두 개의 파일을 동시에 다운로드 받을 때 각각이 독립적으로 0%에서 100%가 되는 과정을 출력해 보자. 
 *  
 * 진행률은 0%, 20%, 40%, 60%, 80%, 100%를 출력한다.
 * 
 * 마지막으로 완료메세지를 출력한다.
 * 
 * 
 * [실행 결과]
 * 
 * 파일1 : 0%
 * 파일2 : 0%
 * 파일2 : 20%
 * 파일2 : 40%
 * 파일2 : 60%
 * 파일2 : 80%
 * 파일2 : 100%
 * 파일1 : 20%
 * 파일1 : 40%
 * 파일1 : 60%
 * 파일1 : 80%
 * 파일1 : 100%
 * 파일1 다운로드가 완료되었습니다.
 * 파일2 다운로드가 완료되었습니다.
 * 
 */
public class MultiFileDownloadTest {
	public static void main(String args[]) {
		Thread thread1 = new Thread(new FileDownloadThread("파일1"));
		Thread thread2 = new Thread(new FileDownloadThread("파일2"));
		thread1.start();
		thread2.start();
	}
}
