package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EncodingController {
    
    //过滤器解决乱码
    @RequestMapping("/encoding/test1")
    public String test1(String name,Model model){
        System.out.println("接收到name:" + name);
        model.addAttribute("msg", name);
        return "test";
    }
}
