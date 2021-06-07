package com.example.dao;

import java.util.List;

import com.example.pojo.Books;

import org.apache.ibatis.annotations.Param;

public interface BookMapper {
    
    //增加一本书
    int addBook(Books book);
    //删除一本书
    int deleteBookById(@Param("bookId")int id);
    //更新一本书
    int updateBook(Books book);
    //查询一本书
    Books queryBookById(@Param("bookID")int id);
    //查询全部的书
    List<Books> queryAllBook();
    
    Books queryBookByName(@Param("bookName")String bookName);
}
