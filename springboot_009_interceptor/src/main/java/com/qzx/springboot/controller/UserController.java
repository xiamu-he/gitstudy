package com.qzx.springboot.controller;

import com.qzx.springboot.model.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author qzx
 * @create 2021-10-07 14:43
 * @function
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {
    @RequestMapping(value = "/login")
    public Object login(HttpServletRequest request){
        User user=new User();
        user.setUsername("qzx");
        user.setPassword("qsqsqsqs");

        request.getSession().setAttribute("user",user);

        return "login success";
    }

    /**
     * 该请求需要用户登录之后才能访问
     */
    @RequestMapping(value = "/center")
    public Object center(){
        return "see center message";
    }

    /**
     * 该请求不登录也可以访问
     */
    @RequestMapping(value = "/out")
    public Object out(){
        return "see out";
    }

    /**
     * 该请求在未登录的情况下访问了需要登录的界面时跳转的界面
     * @return
     */
    @RequestMapping(value = "/error")
    public Object error(){
        return "error";
    }
}
