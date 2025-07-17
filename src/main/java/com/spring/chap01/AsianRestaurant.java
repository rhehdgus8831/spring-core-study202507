package com.spring.chap01;

import com.spring.core.chap01.KimuraChef;

public class AsianRestaurant implements Restaurant{

    // 전문 셰프
    private Chef mainChef;
    // 코스 메뉴
    private Course course;


    // 생성자
    public AsianRestaurant(Chef chef, Course course) {
        this.mainChef = chef;
        this.course = course;
    }

    @Override
    public void order() {
        System.out.println("아시안 요리를 주문합니다.");
        course.combineMenu();
        mainChef.cook();
    }
}
