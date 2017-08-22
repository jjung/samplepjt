package com.exam.sample.excetion.exercise4;

class TorrentFileDownload {
	private int progress = 0;

	public int getProgress() {
		return progress;
	}
	
	public synchronized void setProgress() {
		if(progress < 100) {
			try {
				Thread.sleep(1000);
			} catch(Exception e) {}
			progress += 10;
			System.out.println("파일 다운로드(" + Thread.currentThread().getName() + ") : " + progress + "%");
		}
	}
}