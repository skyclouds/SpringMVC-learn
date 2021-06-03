package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //代表这类会被Spring接管,被这个注解类中的所有方法,如果返回值是String,并且有具体的页面可以跳转,那么就会被视图解析器解析跳转
public class ControllerTest2 {
    
    @RequestMapping("/test2")
    public String test2(Model model) {
        model.addAttribute("msg", "Test2Controller");
        return "test";
    }
}
