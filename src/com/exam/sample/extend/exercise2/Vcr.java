package com.lgcns.sample.extend.exercise2;

public class Vcr {
	private boolean power;
	
	public void power() {
		power = !power;
		
		if(power) {
			System.out.println("VCR 전원이 켜졌습니다.");
		} else {
			System.out.println("VCR 전원이 꺼졌습니다.");
		}
	}
	
	public void play() {
		System.out.println("VCR : PLAY");
	}

	public void stop() {
		System.out.println("VCR : STOP");
	}
	
	public void rew() {
		System.out.println("VCR : REW");
	}
	
	public void ff() {
		System.out.println("VCR : FF");
	}
}
