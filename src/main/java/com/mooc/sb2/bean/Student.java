package com.mooc.sb2.bean;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mooc.sb2.entity.BaseEntity;

import java.io.Serializable;

public class Student extends BaseEntity {

//    private static final long serialVersionUID = -277891939915574508L;
    private String id;
    private String name;
    private String score;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
}
