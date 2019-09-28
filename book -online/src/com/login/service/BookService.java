package com.login.service;

import com.login.entity.Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author suyuxi
 * @className BookService
 * @Description TODO
 * @Date 2019/9/26
 * @Version 1.0
 **/
public class BookService {
    private List<Book> bookList;
    public List<Book> init(){
        bookList = new ArrayList<>(10);
        Book[] books = {
                new Book(1,"java","book1.jpg","java作者"),
                new Book(1,"java","book1.jpg","java作者"),
                new Book(1,"java","book1.jpg","java作者"),
                new Book(1,"java","book1.jpg","java作者"),
                new Book(1,"java","book1.jpg","java作者"),
                new Book(1,"java","book1.jpg","java作者"),
                new Book(1,"java","book1.jpg","java作者"),
                new Book(1,"java","book1.jpg","java作者"),
                new Book(1,"java","book1.jpg","java作者"),
                new Book(1,"java","book1.jpg","java作者")
        };

        bookList = Arrays.asList(books);
        return bookList;
    }

}
