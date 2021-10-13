package com.qzx.springboot.Controller;

import com.qzx.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author qzx
 * @create 2021-10-08 17:23
 * @function
 */
@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/student/count")
    public @ResponseBody Object count(){

       Integer count= studentService.QueryStudentCount();
        return "学生总数为："+count;
    }
}
