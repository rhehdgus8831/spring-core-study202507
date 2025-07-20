package com.spring.core.chap02_3.modal;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder

// 데이터베이스로 부터 조회한 데이터라고 가정
public class MyModal {

    private String data;

}
