package com.spring.core.chap02_3.service;

import com.spring.core.SpringCor202507Application;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class ProductServiceTest {


    @Test
    void test() {
        ApplicationContext context
                = new AnnotationConfigApplicationContext(SpringCor202507Application.class);

        ProductService service = context.getBean(ProductService.class);
        String result = service.findProduct();
        System.out.println("result = " + result);

    }

}