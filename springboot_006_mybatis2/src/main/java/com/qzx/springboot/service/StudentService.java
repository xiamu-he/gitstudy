package com.qzx.springboot.service;

import com.qzx.springboot.model.Student;

/**
 * @author qzx
 * @create 2021-10-07 8:52
 * @function
 */
public interface StudentService {
    Student queryStudentById(int id);
}
