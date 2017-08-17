package com.lgcns.sample.extend.exercise2;

public class VcrTv extends Tv{
	Vcr vcr = new Vcr();
	
	public void play() {
		vcr.play();
	}

	public void stop() {
		vcr.stop();
	}
	
	public void rew() {
		vcr.rew();
	}
	
	public void ff() {
		vcr.ff();
	}
}
