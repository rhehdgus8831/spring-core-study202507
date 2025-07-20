package com.spring.core.chap02_4.Controller;

import com.spring.core.chap02_4.model.Student;
import com.spring.core.chap02_4.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.util.List;

// 학생 조회 요청, 생성 요청을 처리
@Controller
// @Scope("prototype") // 싱글톤 해제 *실무팁 : 프로토타입을 쓸 애들은 스피링에게 맡기지 않음
/*
    request : HTTP 요청이 시작될 때 생성되고 응답을 하는 순간 사라짐
    session : HTTP 세선 시간동안 유지됨 (Ex: 은행 웹 15분 뒤 로그아웃 되면 사라짐)
    application : 서버가 살아있는 동안은 계속 존재함
    근데 이거는 거의 쓸일 없음
*/

public class StudentController {

    private StudentRepository repository;

    @Autowired               // @Qualifier 빈의 이름은 클래스 이름의 캐멀케이스로 결정됨 (앞 글자를 소문자로 바꿔줘야함)
    public StudentController(@Qualifier("smr") StudentRepository repository) {
        this.repository = repository;
    }

    // 조회 요청을 처리
    public void showStudents() {
        List<Student> studentList = repository.findAll();
        System.out.println("---- 학생 목록 출력 ----");
        studentList.forEach(System.out::println);

    }

}
