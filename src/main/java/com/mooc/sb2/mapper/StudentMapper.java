package com.mooc.sb2.mapper;

import com.mooc.sb2.bean.Student;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface StudentMapper {
    @Insert("insert into student(id, name, score) values(#{id}, #{name}, #{score})")
    int add(Student student);
    @Update("update student set name=#{name}, score=#{score} where id=#{id}")
    int update(Student student);
    @Delete("delete from student where id=#{id}")
    int deleteByIds(String id);
    @Select("select * from student where id=#{id}")
    @Results(id = "student",value= {
            @Result(property = "id", column = "id", javaType = String.class),
            @Result(property = "name", column = "name", javaType = String.class),
            @Result(property = "score", column = "score", javaType = String.class)
    })
    Student queryStudentById(String id);
}
