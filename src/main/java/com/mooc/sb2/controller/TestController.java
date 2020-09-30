package com.mooc.sb2.controller;

import com.mooc.sb2.bean.Student;
import com.mooc.sb2.service.StudentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {
    @Resource
    private StudentService studentService;
    @RequestMapping( value = "/querystudent", method = RequestMethod.GET)
    public Student queryStudentById(String id) {
        return this.studentService.queryStudentById(id);
    }
    @RequestMapping(value = "/addstudent", method = RequestMethod.POST)

    public HashMap add(@RequestBody Student student) {
        HashMap<Object, Object> objectObjectMap = new HashMap<>();
        objectObjectMap.put("success", this.studentService.add(student) >= 0);
        objectObjectMap.put("data", this.studentService.add(student));
        return objectObjectMap;
    }
}
