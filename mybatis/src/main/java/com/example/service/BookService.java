package com.example.service;

import java.util.List;

import com.example.pojo.Books;

public interface BookService {
    
    //增加一本书
    int addBook(Books book);
    //删除一本书
    int deleteBookById(int id);
    //更新一本书
    int updateBook(Books book);
    //查询一本书
    Books queryBookById(int id);
    //查询全部的书
    List<Books> queryAllBook();
    
    Books queryBookByName(String bookName);
}
