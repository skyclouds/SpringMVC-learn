package com.example.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.example.pojo.User;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AjaxController {

    @RequestMapping("/test")
    public String test() {
        return "test";
    }

    @RequestMapping("/a1")
    public void a1(String name, HttpServletResponse response) throws IOException {
        System.out.println("a1:name=>" + name);
        if ("kobe".equals(name)) {
            response.getWriter().println("true");
        } else {
            response.getWriter().println("false");
        }
    }

    @RequestMapping("/a2")
    public List<User> a2() {
        List<User> userList = new ArrayList<User>();

        // 添加数据
        userList.add(new User("Kobe", 24, "男"));
        userList.add(new User("Thea", 5, "女"));
        userList.add(new User("James", 45, "男"));

        return userList;
    }

    @RequestMapping("/a3")
    public String a3(String name, String pwd) {
        String msg = "";
        if (name != null) {
            // admin 这些数据应该在数据库中查询
            if ("admin".equals(name)) {
                msg = "OK";
            } else {
                msg = "用户名有误";
            }
        }
        if (pwd != null) {
            // pwd 这些数据应该在数据库中查询
            if ("123456".equals(pwd)) {
                msg = "OK";
            } else {
                msg = "密码有误";
            }
        }
        return msg;
    }
}
