package com.lgcns.sample.excetion.exercise4;

class TorrentFileDownloadThread implements Runnable {
	TorrentFileDownload file = new TorrentFileDownload();
	
	public void run() {
		while(file.getProgress() < 100) {
			file.setProgress();
		}
	}
}