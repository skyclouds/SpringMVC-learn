package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/controller")
public class ControllerTest3 {
    
    @RequestMapping("/test3")
    public String test3(Model model){
        model.addAttribute("msg", "Test3Controller");
        return "test";
    }
}
