package com.mooc.sb2.mapper;

import com.mooc.sb2.bean.Student;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface StudentMapper {
    @Insert("insert into student(studentId, name, score) values(#{studentId}, #{name}, #{score})")
    int add(Student student);
    @Update("update student set name=#{name}, score=#{score} where studentId=#{studentId}")
    int update(Student student);
    @Delete("delete from student where studentId=#{studentId}")
    int deleteByIds(Student studentId);
    @Select("select * from student where studentId=#{studentId}")
    @Results(id = "student",value= {
            @Result(property = "studentId", column = "studentId", javaType = String.class),
            @Result(property = "name", column = "name", javaType = String.class),
            @Result(property = "score", column = "score", javaType = String.class)
    })
    Student queryStudentById(String studentId);
}
