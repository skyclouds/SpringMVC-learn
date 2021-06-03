package com.example.controller;

import java.util.Date;

import com.alibaba.fastjson.JSON;
import com.example.pojo.User;
import com.example.utils.JsonUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller 返回视图解析器处理
@RestController //直接返回String
public class UserController {


    //解决JSON乱码方法:@RequestMapping(value = "/json1", produces = "application/json;charset=utf-8")
     //@ResponseBody // 不会走视图解析器,会直接返回一个字符串
    @RequestMapping("/json1")
    public String json1() throws JsonProcessingException {
        // jackson ObjectMapper
        ObjectMapper mapper = new ObjectMapper();
        // 创建一个对象
        User user = new User(1, "科比", 24);
        String str = mapper.writeValueAsString(user);
        return str;
    }

    @RequestMapping("/json2")
    public String json2() {
        return JsonUtils.getJson(new Date());
    }


    @RequestMapping("/json3")
    public String json3() {
        User user = new User(1, "科比", 24);
        return JSON.toJSONString(user);
    }
}
