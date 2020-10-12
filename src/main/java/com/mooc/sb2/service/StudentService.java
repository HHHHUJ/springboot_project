package com.mooc.sb2.service;

import com.mooc.sb2.bean.Student;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

public interface StudentService {
    int add(Student student);
    int update(Student student);
    int deleteByIds(Student id);
    Student queryStudentById(String id);
}
