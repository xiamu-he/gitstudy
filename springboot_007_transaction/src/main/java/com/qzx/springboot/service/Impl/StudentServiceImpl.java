package com.qzx.springboot.service.Impl;

import com.qzx.springboot.mapper.StudentMapper;
import com.qzx.springboot.model.Student;
import com.qzx.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author qzx
 * @create 2021-10-07 9:14
 * @function
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Transactional
    @Override
    public int updateByPrimaryKeySelective(Student student) {
        int i = studentMapper.updateByPrimaryKeySelective(student);
        int s= 10/0;
        return i;
    }
}
