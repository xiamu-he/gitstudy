package com.qzx.springboot.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author qzx
 * @create 2021-10-06 15:20
 * @function
 */
@Controller
public class IndexController {
    @Value("${qzx.mysql}")
    private String name;

    @RequestMapping(value = "/say")
    @ResponseBody
    public String test(){
        return "Hello muti-enviroment"+name;
    }
}
