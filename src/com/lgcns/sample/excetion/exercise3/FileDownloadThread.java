package com.lgcns.sample.excetion.exercise3;

class FileDownloadThread implements Runnable {
	private String fileName;
	public FileDownloadThread(String fileName) {
		this.fileName = fileName;
	}
	
	public void run() {
		for(int i=0;i<=100;i+=20) {
			System.out.println(fileName +" : " + i + "%");
		}
		System.out.println(fileName + " 다운로드가 완료되었습니다.");
	}
}