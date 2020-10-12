package com.mooc.sb2.service;

import com.mooc.sb2.bean.Student;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

//@CacheConfig(cacheNames = "student")
public interface StudentService {
//    @CachePut(key = "#p0.id")
    int add(Student student);
//    @CachePut(key = "#p0.id")
    int update(Student student);
//    @CacheEvict(key = "#p0", allEntries = true)
    int deleteByIds(Student id);
//    @Cacheable(key = "#p0")
    Student queryStudentById(String id);
}
