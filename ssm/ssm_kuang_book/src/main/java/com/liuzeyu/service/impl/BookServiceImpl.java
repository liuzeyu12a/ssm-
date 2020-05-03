package com.liuzeyu.service.impl;

import com.liuzeyu.dao.BookMapper;
import com.liuzeyu.pojo.Books;
import com.liuzeyu.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by liuzeyu on 2020/5/1.
 */

public class BookServiceImpl implements BookService{

    private BookMapper bookMapper = null;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public void addBook(Books books) {
        bookMapper.addBook(books);
    }

    public void deleteBookById(int id) {
        bookMapper.deleteBookById(id);
    }

    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    public Books queryBookById(int id) {
        Books books = bookMapper.queryBookById(id);
        return books;
    }

    public List<Books> findAll() {
        List<Books> booksList = bookMapper.findAll();
        return booksList;
    }

    public List<Books> queryBook(String name) {
        return bookMapper.queryBook(name);
    }
}
