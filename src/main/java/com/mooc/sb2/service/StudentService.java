package com.mooc.sb2.service;

import com.mooc.sb2.bean.Student;

public interface StudentService {
    int add(Student student);
    int update(Student student);
    int deleteByIds(String id);
    Student queryStudentById(String id);
}
