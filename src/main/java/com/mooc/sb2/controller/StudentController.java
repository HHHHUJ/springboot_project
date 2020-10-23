package com.mooc.sb2.controller;

import com.mooc.sb2.bean.Student;
import com.mooc.sb2.exception.NotExistException;
import com.mooc.sb2.service.StudentService;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.xml.transform.Result;
import java.util.HashMap;
import java.util.List;

@RestController
public class StudentController {
    @Resource
    private RedisTemplate<String, Object> redisTemplate;
    @Resource
    private StudentService studentService;
    @RequestMapping( value = "/querystudent", method = RequestMethod.GET)
    public Student queryStudentById(String id) {
        Student result = this.studentService.queryStudentById(id);
        redisTemplate.opsForValue().set("hashKey", result);
        Object hashKey = redisTemplate.opsForValue().get("hashKey");
        if(hashKey == null) throw new NotExistException(id);
        else {
            return (Student) hashKey;
        }
    }

    @RequestMapping(value = "/addstudent", method = RequestMethod.POST)
    public HashMap add(@RequestBody Student student) {
//        redisTemplate.opsForValue().set("test",111111);
//        Object value = redisTemplate.opsForValue().get("test");
//        System.out.println(value);
//        StringRedisTemplate.opsForValue().set("test", 11111);
//        System.out.println(StringRedisTemplate.opsForValue().get("test"));
        HashMap<Object, Object> objectObjectMap = new HashMap<>();
        int result = this.studentService.add(student);
        objectObjectMap.put("success",result>0);
        objectObjectMap.put("data", result);
        return objectObjectMap;
    }

    @RequestMapping(value = "/delstudent", method = RequestMethod.POST)
    public HashMap deleteByIds(@RequestBody Student id) {
        HashMap<Object, Object> objectObjectMap = new HashMap<>();
        int result = this.studentService.deleteByIds(id);
        objectObjectMap.put("success", result > 0);
        objectObjectMap.put("data", result);
        return objectObjectMap;
    }

    @RequestMapping(value = "/updatestudent", method = RequestMethod.POST)
    public HashMap update(@RequestBody Student student) {
        HashMap<Object, Object> objectObjectMap = new HashMap<>();
        int result = this.studentService.update(student);
        objectObjectMap.put("success", result > 0);
        objectObjectMap.put("data", result);
        return objectObjectMap;
    }
}
