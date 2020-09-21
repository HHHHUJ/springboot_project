package com.mooc.sb2.mapper;

import com.mooc.sb2.bean.Demo;
import com.mooc.sb2.bean.DemoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface DemoMapper {


    Demo selectByPrimaryKey(@Param("id")  Long id);


}
