package com.qzx.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author qzx
 * @create 2021-10-08 16:04
 * @function
 */

@Controller
public class IndexController {
    @RequestMapping(value = "/abc")
    public String abc(Model model) {
        model.addAttribute("data", "SpringBoot 框架打 jar 运行");
        return "abc";
    }

    @RequestMapping(value = "/abc/json")
    public @ResponseBody
    Object json() {
        Map<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("code", "10000");
        return paramMap;
    }
}
