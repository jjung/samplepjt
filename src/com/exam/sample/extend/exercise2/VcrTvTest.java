package com.exam.sample.extend.exercise2;

/*
 * 비디오비전 만들기
 * 
 * 제공된 Tv와 Vcr 클래스를 가지고 VcrTv 클래스를 만들고, 
 * 아래 실행 결과와 같이 나오도록 출력해 보자.
 * 
 * 
 * 
 * [실행 결과]
 * 
 * TV 전원이 켜졌습니다. 채널 : 1
 * 채널 : 2
 * 채널 : 1
 * VCR : PLAY
 * VCR : STOP
 * VCR : REW
 * VCR : FF
 * 
 */
public class VcrTvTest extends Tv{
    
    public static void main( String[] args ) {
        
        VcrTv vcrTv = new VcrTv();
        
        vcrTv.power();
        vcrTv.channelUp();
        vcrTv.channelDown();
        vcrTv.play();
        vcrTv.stop();
        vcrTv.rew();
        vcrTv.ff();
    }
}
