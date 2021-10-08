package com.qzx.springboot.web;

import com.qzx.springboot.config.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author qzx
 * @create 2021-10-06 16:02
 * @function
 */
@Controller
public class IndexController {
    @Autowired
    private School school;


    @RequestMapping("/say")
    public @ResponseBody String test()
    {
        return "school.name="+school.getName()+"-----------school.websit="+school.getWebsit();
    }
}
