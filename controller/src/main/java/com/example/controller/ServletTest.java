package com.example.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ServletTest {

    @RequestMapping("/servlet/test1")
    public void test1(HttpServletRequest req, HttpServletResponse rsp) throws IOException {
        rsp.getWriter().println("Hello,Servlet API");
    }

    @RequestMapping("/servlet/test2")
    public void test2(HttpServletRequest req, HttpServletResponse rsp) throws IOException {
        // 重定向
        rsp.sendRedirect("/index.jsp");
    }

    @RequestMapping("/servlet/test3")
    public void test3(HttpServletRequest req, HttpServletResponse rsp) throws IOException, ServletException {
        // 转发
        req.setAttribute("msg", "Hello,Request dispatcher by servlet");
        req.getRequestDispatcher("/WEB-INF/jsp/test.jsp").forward(req, rsp);
    }
}
