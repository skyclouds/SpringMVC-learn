package com.example;

import com.example.pojo.Books;
import com.example.service.BookService;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = context.getBean("bookServiceImpl",BookService.class);
        for(Books book : bookService.queryAllBook()){
            System.out.println(book.toString());
        }
    }
}
