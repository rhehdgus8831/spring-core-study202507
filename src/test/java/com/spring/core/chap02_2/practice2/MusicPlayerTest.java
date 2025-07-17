package com.spring.core.chap02_2.practice2;

import com.spring.core.chap02_2.practice2.config.MusicConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class MusicPlayerTest {

    @Test
    void test() {
        ApplicationContext context
                = new AnnotationConfigApplicationContext(MusicConfig.class);

        MusicPlayer musicPlayer = context.getBean(MusicPlayer.class);
        musicPlayer.playMusic();
    }

}