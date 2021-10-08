package com.qzx.springboot.service;

import com.qzx.springboot.model.Student;

/**
 * @author qzx
 * @create 2021-10-07 9:11
 * @function
 */
public interface StudentService {
    int updateByPrimaryKeySelective(Student student);
}
