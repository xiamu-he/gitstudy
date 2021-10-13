package com.qzx.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author qzx
 * @create 2021-10-08 14:53
 * @function
 */
@Controller
public class UserController {
    @RequestMapping(value = "/user/detail")
    public @ResponseBody Object userDetail(){
        Map<String, Object> map = new HashMap<>();
        map.put("id",0001);
        map.put("user","lisi");

        return map;
    }

    @RequestMapping(value = "/user/page/detail")
    public  Object userPageDetail(Model model){
        model.addAttribute("id",001);
        model.addAttribute("username","qzx");
        return "UserDetail";
    }
}
