package com.qzx.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qzx
 * @create 2021-10-07 15:29
 * @function
 */
@RestController
public class TestController {
    @RequestMapping(value = "/test")
    public Object test(){
        return "不是吧";
    }
}
