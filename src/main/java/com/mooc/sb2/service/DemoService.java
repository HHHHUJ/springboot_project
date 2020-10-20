package com.mooc.sb2.service;

import com.mooc.sb2.bean.Demo;
import com.mooc.sb2.mapper.DemoMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;

@Service
public class DemoService {
    // 注入mapper层
    @Resource
    private DemoMapper demoMapper;
    public Demo getDemoById(Long id) {
        return Optional.ofNullable(demoMapper.selectByPrimaryKey(id)).orElse(null);
    }
}
