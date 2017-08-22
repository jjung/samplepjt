package com.exam.sample.excetion.exercise4;

/*
 * 토렌트로 파일 다운로드
 * 
 * 토렌트는 여러 컴퓨터로부터 분산적으로 파일을 내려받는 기술이다. 
 * 하나의 파일을 2대의 토렌트 클라이언트로부터 다운로드 받는 과정을 출력해보자.
 * 
 * 진행률은 10%씩 증가하며 100%를 초과할 수 없다. 
 * 진행률을 증가시키기 전에 항상 Thread.sleep(1000)의 딜레이를 준다.
 * 
 * 
 * [실행 결과] – 출력 순서 및 내용은 다를 수 있음
 * 
 * 파일 다운로드(Thread-0) : 10%
 * 파일 다운로드(Thread-0) : 20%
 * 파일 다운로드(Thread-0) : 30%
 * 파일 다운로드(Thread-0) : 40%
 * 파일 다운로드(Thread-0) : 50%
 * 파일 다운로드(Thread-0) : 60%
 * 파일 다운로드(Thread-1) : 70%
 * 파일 다운로드(Thread-1) : 80%
 * 파일 다운로드(Thread-1) : 90%
 * 파일 다운로드(Thread-1) : 100%
 * 
 */
public class TorrentFileDownloadTest {
	public static void main(String args[]) {
		Runnable runnable = new TorrentFileDownloadThread();
		new Thread(runnable).start();
		new Thread(runnable).start();
	}
}
