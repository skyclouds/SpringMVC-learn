package com.example.controller;

import java.util.LinkedHashMap;

import com.example.pojo.User;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {

    //localhost:8080/user/test1?username=kobe
    @GetMapping("/test1")
    public String test1(@RequestParam("username") String name, Model model) {
        // 1.接收前端参数
        System.out.println("接收到name:" + name);
        // 2.将返回的结果传递给前端
        model.addAttribute("msg", name);
        // 3.跳转视图
        return "test";
    }

    //前端接收的是一个对象:id,name,age
    
    /**
     * 1.接收前端用户传递的参数,判断参数的名字,假设名字直接在方法上,可以直接使用
     * 2、假设传递的是一个User对象,匹配User对象中的字段名:如果名字一致则OK,否则匹配不到
     */
    //localhost:8080/user/test2?name=kobe&age=24&id=1
    @GetMapping("/test2")
    public String test2(User user, Model model) {
        // 1.接收前端参数
        System.out.println("接收到user:" + user.toString());
        // 2.将返回的结果传递给前端
        model.addAttribute("msg", user.toString());
        // 3.跳转视图
        return "test";
    }

    //ModelMap(继承LinkedHashMap)
    //Model(精简版)
    @GetMapping("/test3")
    public String test3(User user, ModelMap map) {
        // 1.接收前端参数
        System.out.println("接收到user:" + user.toString());
        // 2.将返回的结果传递给前端
        map.addAttribute("msg", user.toString());
        // 3.跳转视图
        return "test";
    }
}
