package com.login.listener;

import com.login.entity.Book;
import com.login.entity.User;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author suyuxi
 * @className ContextLoaderListener
 * @Description TODO
 * @Date 2019/9/29
 * @Version 1.0
 **/


/**
 * 监视Tomcat
 * @author 22968
 */

@WebListener
public class ContextLoaderListener implements ServletContextListener {
    /**
     * @param sce
     * @Description 容器初始化方法
     */
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("容器启动");
        //创建并生成用户数据列表
        List<User> userList = new ArrayList<>(3);
        User[] users = {
                new User(1, "aaa@qq.com", "698d51a19d8a121ce581499d7b701668", "苏", "login (1).jpg", "江苏", LocalDate.of(2019, 1, 1)),
                new User(2, "bbb@qq.com", "bcbe3365e6ac95ea2c0343a2395834dd", "王", "login (2).jpg", "江苏", LocalDate.of(2019, 2, 2)),
                new User(3, "ccc@qq.com", "310dcbbf4cce62f762a2aaa148d556bd", "张", "login (3).jpg", "江苏", LocalDate.of(2019, 3, 3))
        };
        //创建并生成图书数据列表
        List<Book> bookList = new ArrayList<>(10);
        Book[] books = {
                new Book(1, "战争与和平", "book1.jpg", "列夫·尼古拉耶维奇·托尔斯泰"),
                new Book(2, "巴黎圣母院", "book2.jpg", "维克多·雨果"),
                new Book(3, "童年", "book3.jpg", "马克西姆·高尔基"),
                new Book(4, "呼啸山庄", "book4.jpg", "艾米莉·勃朗特"),
                new Book(5, "大卫·科波菲尔", "book5.jpg", "查尔斯·狄更斯"),
                new Book(6, "红与黑", "book6.jpg", "司汤达"),
                new Book(7, "悲惨世界", "book7.jpg", "维克多·雨果"),
                new Book(8, "安娜·卡列尼娜", "book8.jpg", "列夫·尼古拉耶维奇·托尔斯泰"),
                new Book(9, "约翰·克利斯朵夫", "book9.jpg", "罗曼·罗兰"),
                new Book(10, "飘", "book10.jpg", "玛格丽特·米切尔")
        };
        userList = Arrays.asList(users);
        bookList = Arrays.asList(books);
        //获得全局变量
        ServletContext servletContext = sce.getServletContext();
        //设置全局变量属性，将用户和图书列表数据记入，整个应用可以共享
        servletContext.setAttribute("userList", userList);
        servletContext.setAttribute("bookList", bookList);
        /**
         * 销毁方法
         *          * @param sce
         */

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

        System.out.println("容器销毁");
    }
}
