package com.liuzeyu.service;

import com.liuzeyu.pojo.Books;

import java.util.List;

/**
 * Created by liuzeyu on 2020/5/1.
 */
public interface BookService {

    //增加一个Book
    void addBook(Books books);

    //根据id删除一个book
    void deleteBookById(int id);

    //更新Booke
    int updateBook(Books books);

    //根据id查询
    Books queryBookById(int id);

    //查询全部
    List<Books> findAll();

    //根据名称模糊查询
    List<Books> queryBook(String name);
}
