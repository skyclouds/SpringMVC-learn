package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RestFulController {

    // http://localhost:8080/add?a=1&b=2
    @RequestMapping("/add")
    public String add(String a, String b, Model model) {
        String res = a + b;
        model.addAttribute("msg", "add结果为" + res);
        return "test";
    }

    // 查询
    // RestFul:http://localhost:8080/api/a/b
    // @RequestMapping(value = "/api/{a}/{b}", method = RequestMethod.GET)
    @GetMapping("/api/{a}/{b}")
    public String get(@PathVariable String a, @PathVariable String b, Model model) {
        String res = a + b;
        model.addAttribute("msg", "get结果为" + res);
        return "test";
    }

    // 新增
    // RestFul:http://localhost:8080/api/a/b
    // @RequestMapping(value = "/api/{a}/{b}", method = RequestMethod.POST)
    @PostMapping("/api/{a}/{b}")
    public String post(@PathVariable String a, @PathVariable String b, Model model) {
        String res = a + b;
        model.addAttribute("msg", "post结果为" + res);
        return "test";
    }

    // 删除
    // RestFul:http://localhost:8080/api/a/b
    // @RequestMapping(value = "/api/{a}/{b}", method = RequestMethod.DELETE)
    @DeleteMapping("/api/{a}/{b}")
    public String delete(@PathVariable String a, @PathVariable String b, Model model) {
        String res = a + b;
        model.addAttribute("msg", "delete结果为" + res);
        return "test";
    }

    // 更新
    // RestFul:http://localhost:8080/api/a/b
    // @RequestMapping(value = "/api/{a}/{b}", method = RequestMethod.PUT)
    @PutMapping("/api/{a}/{b}")
    public String put(@PathVariable String a, @PathVariable String b, Model model) {
        String res = a + b;
        model.addAttribute("msg", "put结果为" + res);
        return "test";
    }
}
