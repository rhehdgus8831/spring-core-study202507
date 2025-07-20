package com.spring.core.chap02_3.repository;

import com.spring.core.chap02_3.modal.MyModal;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

// 데이터 베이스에 접근해서 데이터를 CRUD하는 역할
// @Component
@Repository
public class MyRepository {


    public MyRepository() {
        System.out.println("MyRepsoitory객체 생성!");


    }


    // 데이터 조회
    public MyModal findData(){
        return new MyModal("DB에서 조회한 데이터입니다.");
    }

}
