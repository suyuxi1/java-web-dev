package com.login.service;

import com.login.entity.User;
import com.login.utils.Md5Util;

import java.time.LocalDate;
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
//    public List<User> init() {
//
//        User[] user = {
//                new User(1,"aaa@qq.com", "698d51a19d8a121ce581499d7b701668", "苏","login (1).jpg", "广西", LocalDate.of(2019,1,1)),
//                new User(2,"bbb@qq.com", "bcbe3365e6ac95ea2c0343a2395834dd", "王","login (2).jpg", "江苏", LocalDate.of(2019,2,2)),
//                new User(3,"ccc@qq.com", "310dcbbf4cce62f762a2aaa148d556bd", "张","login (3).jpg", "山西", LocalDate.of(2019,3,3))
//        };
//        userList = Arrays.asList(user);
//        return userList;
//    }
    public void setUserList(List<User> userList){
        this.userList = userList;
    }


    /**
     * @param account
     * @return
     * @Description
     */
    public User signIn(String account, String password) {
        for (User user : userList) {
            if (user.getAccount().equals(account) && user.getPassword().equals(Md5Util.crypt(password))) {
                return user;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        User user = new UserService().signIn("13951905171", Md5Util.crypt("111"));
        if (user != null) {
            System.out.println(user);
        } else {
            System.out.println("登录失败");
        }
    }
}
