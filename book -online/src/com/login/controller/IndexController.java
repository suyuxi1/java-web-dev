package com.login.controller;

import com.login.service.BookService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author suyuxi
 * @className IndexController
 * @Description TODO
 * @Date 2019/9/26
 * @Version 1.0
 **/
@WebServlet(urlPatterns = "/index")
public class IndexController extends HttpServlet {
    protected void doDet(HttpServletRequest req, HttpServletResponse resp)throws SecurityException{
        BookService bs = new BookService();

    }
}
