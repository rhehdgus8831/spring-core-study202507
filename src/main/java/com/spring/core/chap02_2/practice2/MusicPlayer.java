package com.spring.core.chap02_2.practice2;

public class MusicPlayer {

    private Speaker speaker;

    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }

    public void playMusic() {
        if(speaker == null){
            System.out.println("스피커가 셋팅되지 않았습니다.");
            return;
        }
        speaker.playSound();
        System.out.println("음악 플레이어에서 음악이 재생됩니다.");
    }
}
