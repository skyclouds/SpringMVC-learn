package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/HelloController")
public class HelloController {

    //localhost:8080/HelloController/hello
    //Model是ModelAndView的简化版本,专门处理数据
    @RequestMapping("/hello")
    public String hello(Model model) {
        //封装数据,相当于调用ModelAndView的addObject
        model.addAttribute("msg", "Hello,SpringMVC Annotation!");
        // 返回数据给视图解析器处理,相当于调用ModelAndView的setViewName
        return "hello";
    }
}
