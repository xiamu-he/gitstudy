package com.qzx.springboot.service.Impl;

import com.qzx.springboot.Controller.StudentController;
import com.qzx.springboot.mapper.StudentMapper;
import com.qzx.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author qzx
 * @create 2021-10-08 17:27
 * @function
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Integer QueryStudentCount() {
        return studentMapper.QueryStudentCount();
    }
}
