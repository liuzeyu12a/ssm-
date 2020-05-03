package com.liuzeyu.controller;

import com.liuzeyu.pojo.Books;
import com.liuzeyu.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;

/**
 * Created by liuzeyu on 2020/5/1.
 */
@Controller
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService = null;
    /**
     * 处理展示所有书籍
     * @param model
     * @return
     */
    @RequestMapping("allBooks")
    public String list(Model model){
        List<Books> list = bookService.findAll();
        System.out.println(list);
        model.addAttribute("list",list);
        return "/allBooks";
    }
    /**
     * 处理保存书籍
     * @param books
     * @return
     */
    @RequestMapping("addBook")
    public String save(Books books){
            bookService.addBook(books);
        return "redirect:allBooks";
        //写成redirect:/books/allBooks可以,写成redirect:books/allBooks就不行
        //allBooks是相对路径
        //写成redirect:/books/allBooks是绝对路径
    }
    /**
     * 删除书籍
     * @param id
     * @return
     */
    @RequestMapping("deleteBook/{bookID}")
    public String delete(@PathVariable("bookID") Integer id){
        bookService.deleteBookById(id);
        return "redirect:/books/allBooks";
    }
    /**
     * 根据id查询books
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("query/{bookID}")
    public String update(@PathVariable("bookID") Integer id,Model model){
        Books books = bookService.queryBookById(id);
        model.addAttribute("books",books);
        return "forward:/update.jsp";   //写成redirect:/update.jsp为什么获取不到数据
    }
    /**
     * 更新books
     * @param books
     * @return
     */
    @RequestMapping("updateBooks")
    public String update(Books books){
        bookService.updateBook(books);
        return "redirect:allBooks";
    }

    @RequestMapping("queryBook")
    public String queryBook(String bookName,Model model){
        List<Books> list = bookService.queryBook("%"+bookName+"%");
        if(list == null || list.size() == 0){
            model.addAttribute("nill","没有查到此类书籍");
        }
        model.addAttribute("list",list);
        return "allBooks";
    }
}