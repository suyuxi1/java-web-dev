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
                new Book(1, "战争与和平", "book (1).jpg", "列夫·尼古拉耶维奇·托尔斯泰"),
                new Book(2, "巴黎圣母院", "book (2).jpg", "维克多·雨果"),
                new Book(3, "童年", "book (3).jpg", "马克西姆·高尔基"),
                new Book(4, "呼啸山庄", "book (4).jpg", "艾米莉·勃朗特"),
                new Book(5, "大卫·科波菲尔", "book (5).jpg", "查尔斯·狄更斯"),
                new Book(6, "红与黑", "book (6).jpg", "司汤达"),
                new Book(7, "悲惨世界", "book (7).jpg", "维克多·雨果"),
                new Book(8, "安娜·卡列尼娜", "book (8).jpg", "列夫·尼古拉耶维奇·托尔斯泰"),
                new Book(9, "约翰·克利斯朵夫", "book (9).jpg", "罗曼·罗兰"),
                new Book(10, "飘", "book (10).jpg", "玛格丽特·米切尔")
        };

        bookList = Arrays.asList(books);
        return bookList;
    }


}
