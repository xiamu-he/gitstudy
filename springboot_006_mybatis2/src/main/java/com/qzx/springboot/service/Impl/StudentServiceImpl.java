package com.qzx.springboot.service.Impl;

import com.qzx.springboot.mapper.StudentMapper;
import com.qzx.springboot.model.Student;
import com.qzx.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author qzx
 * @create 2021-10-07 8:54
 * @function
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student queryStudentById(int id) {
        return studentMapper.selectByPrimaryKey(id);
    }
}
