package com.login.service;

import com.login.entity.User;
import com.login.utils.Md5Util;

import java.util.Arrays;
import java.util.List;

/**
 * @author suyuxi
 * @className UserService
 * @Description TODO
 * @Date 2019/9/26
 * @Version 1.0
 **/
public class UserService {
    private List<User> userList;

    /**
     * @return List<User>
     * @Description
     **/
    public List<User> init() {

        User[] user = {
                new User(1, "aaa@qq.com", "698d51a19d8a121ce581499d7b701668", "松山湖", "User.jpg"),
                new User(2, "bbb@qq.com", "bcbe3365e6ac95ea2c0343a2395834dd", "yang", "User1.jpg"),
                new User(3, "ccc@qq.com", "bcbe3365e6ac95ea2c0343a2395834dd", "yang", "User2.jpg")
        };
        userList = Arrays.asList(user);
        return userList;
    }

    /**
     * @param account
     * @return
     * @Description
     */
    public User userLogin(String account, String password) {
        for (User user : userList) {
            if (user.getAccount().equals(account) && user.getPassword().equals(Md5Util.crypt(password))) {
                return user;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        UserService us = new UserService();
        us.init();
        User user = us.userLogin("aaa@qq.com", "111");
        if (user != null) {
            System.out.println(user);
        } else {
            System.out.println("登录失败");
        }
    }


}
