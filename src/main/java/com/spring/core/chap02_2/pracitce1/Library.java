package com.spring.core.chap02_2.pracitce1;

import java.util.List;
import java.util.Stack;

public class Library {

    private List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    public void printBooks() {
        books.forEach(System.out::println);
    }
}
