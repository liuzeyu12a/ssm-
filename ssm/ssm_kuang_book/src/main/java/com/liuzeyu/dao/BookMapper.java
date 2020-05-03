package com.liuzeyu.dao;

import com.liuzeyu.pojo.Books;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by liuzeyu on 2020/5/1.
 */
public interface BookMapper {

    //增加一个Book
    void addBook(Books books);

    //根据id删除一个book
    void deleteBookById(@Param("bookId") int id);

    //更新Booke
    int updateBook(Books books);

    //根据id查询
    Books queryBookById(@Param("bookId") int id);

    //查询全部
    List<Books> findAll();

    //根据名称模糊查询
    List<Books> queryBook(@Param("bookName") String name);
}
