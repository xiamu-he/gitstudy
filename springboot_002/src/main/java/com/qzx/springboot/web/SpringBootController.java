package com.qzx.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBodyReturnValueHandler;

/**
 * @author qzx
 * @create 2021-10-06 11:39
 * @function
 */
@Controller
public class SpringBootController {
    @RequestMapping(value = "/say")
    @ResponseBody
    public String say(){
        return "hello springboot";
    }
}
