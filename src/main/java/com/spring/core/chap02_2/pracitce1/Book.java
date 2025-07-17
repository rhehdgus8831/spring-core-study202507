package com.spring.core.chap02_2.pracitce1;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Book {

    private String title;
    private String author;

}
