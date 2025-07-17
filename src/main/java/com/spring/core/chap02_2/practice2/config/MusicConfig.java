package com.spring.core.chap02_2.practice2.config;

import com.spring.core.chap02_2.practice2.MusicPlayer;
import com.spring.core.chap02_2.practice2.Speaker;
import org.springframework.context.annotation.Bean;

public class MusicConfig {

  @Bean
    public Speaker speaker() {
      return new Speaker();
  }
  @Bean
    public MusicPlayer musicPlayer() {
      MusicPlayer musicPlayer = new MusicPlayer();
      musicPlayer.setSpeaker(speaker());
      return musicPlayer;
  }


}
