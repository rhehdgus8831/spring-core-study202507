package com.spring.core.chap01;

import com.spring.chap01.Chef;

public class KimuraChef implements Chef {
    @Override
    public void cook() {
        System.out.println("스시 니기리의 장인 키무라다.");
    }
}