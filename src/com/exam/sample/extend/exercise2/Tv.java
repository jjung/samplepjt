package com.lgcns.sample.extend.exercise2;

public class Tv {
	private boolean power;
	private int channel = 1;
	
	public void power() {
		power = !power;
		
		if(power) {
			System.out.println("TV 전원이 켜졌습니다. 채널 : " + channel);
		} else {
			System.out.println("TV 전원이 꺼졌습니다.");
		}
	}
	
	public void channelUp() {
		channel++;
		System.out.println("채널 : " + channel);
	}
	
	public void channelDown() {
		channel--;
		System.out.println("채널 : " + channel);
	}
}
