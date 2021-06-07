package com.example.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;

public class LoginInterceptor implements HandlerInterceptor{
    
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
            System.out.println("========LoginInterceptor处理前========");
            HttpSession session =request.getSession();
            //放行:判断什么情况下登录

            //登录页面也会放行
            if(request.getRequestURI().contains("goLogin")){
                return true;
            }

            //说明在登录
            if(request.getRequestURI().contains("login")){
                return true;
            }

            //第一次登录也是没有session的
            if(session.getAttribute("userLoginInfo")!=null){
                return true;
            }

            //判断什么情况下没有登录
            request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
            return false;
    }
}
