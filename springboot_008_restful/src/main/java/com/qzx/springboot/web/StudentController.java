package com.qzx.springboot.web;

import com.qzx.springboot.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

/**
 * @author qzx
 * @create 2021-10-07 10:06
 * @function
 */
@RestController
public class StudentController {

//    @RequestMapping(value = "/student/detail/{id}/{name}")
    @GetMapping(value = "/student/detail/{id}/{name}")
    public Object student(@PathVariable("id") Integer id,
                            @PathVariable("name") String name)
    {
        Student student=new Student();
        student.setId(id);
        student.setName(name);
        return student;
    }
}
