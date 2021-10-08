package com.qzx.springboot.web;

import com.qzx.springboot.model.Student;
import com.qzx.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author qzx
 * @create 2021-10-07 9:06
 * @function
 */
@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/student")
    public @ResponseBody Object student(int id){
        int count=0;
        Student student=new Student();
        student.setId(1);
        student.setName("qzx");
        count= studentService.updateByPrimaryKeySelective(student);

        return count;
    }
}
