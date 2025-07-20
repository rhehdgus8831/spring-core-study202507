package com.spring.core.chap02_4.Controller;

import com.spring.core.chap02_4.config.StudentConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class StudentControllerTest {

    @Test
    void test() {
        ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);

        StudentController controller1 = context.getBean(StudentController.class);
        StudentController controller2 = context.getBean(StudentController.class);

        System.out.println("controller1 = " + controller1);
        System.out.println("controller2 = " + controller2);
        // 기본적으로 스프링은 싱글톤 스코프이기에 객체를 다양하게 만들어도 주소가 똑같음

        controller1.showStudents();
    }

}