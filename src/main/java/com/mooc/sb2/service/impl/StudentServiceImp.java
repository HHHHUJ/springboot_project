package com.mooc.sb2.service.impl;

import com.mooc.sb2.bean.Student;
import com.mooc.sb2.mapper.StudentMapper;
import com.mooc.sb2.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("StudentService")
public class StudentServiceImp implements StudentService {
    @Resource
    private StudentMapper studentMapper;

    @Override
    public int add(Student student) {
        return this.studentMapper.add(student);
    }

    @Override
    public int update(Student student) {
        return this.studentMapper.update(student);
    }

    @Override
    public int deleteByIds(Student studentId) {
        return this.studentMapper.deleteByIds(studentId);
    }

    @Override
    public Student queryStudentById(String studentId) {
        return this.studentMapper.queryStudentById(studentId);
    }
}
