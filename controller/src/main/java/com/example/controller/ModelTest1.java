package com.example.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ModelTest1 {
    
    @RequestMapping("/model/test1")
    public String test1(HttpServletRequest request, HttpServletResponse response){
        HttpSession session =request.getSession();
        System.out.println("SessionId="+session.getId());
        return "test";
    }

    @RequestMapping("/model/test2")
    public String test2(HttpServletRequest request, HttpServletResponse response){
        //重定向(默认视图转发器配置是转发)
        return "redirect:/index.jsp";
    }

    @RequestMapping("/model/test3")
    public String test3(HttpServletRequest request, HttpServletResponse response){
        //转发
        return "forward:/index.jsp";
    }
}
