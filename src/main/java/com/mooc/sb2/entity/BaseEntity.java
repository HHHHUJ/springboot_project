package com.mooc.sb2.entity;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mooc.sb2.bean.BeanHelper;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

/**
 * Entity基类
 *
 * @author linmeijie
 */
@Getter
@Setter
@Slf4j
public abstract class BaseEntity implements Serializable {

    private static final long serialVersionUID = -277891939915574508L;

    /**
     * 主键
     */
    protected String id;

//    /**
//     * 创建人
//     */
//    @Operator
//    protected String createBy;
//
//    /**
//     * 创建日期
//     */
//    @OperatedAt
//    @JsonFormat(pattern = DateConstant.FMT_YMD)
//    protected Date createDate;
//
//    /**
//     * 更新人
//     */
//    @Operator
//    protected String updateBy;
//
//    /**
//     * 更新日期
//     */
//    @OperatedAt
//    @JsonFormat(pattern = DateConstant.FMT_YMD)
//    protected Date updateDate;
//
//    /**
//     * 删除标记（0：正常；1：删除；）
//     */
//    protected Integer delFlag = 0;
//
//    /**
//     * 备注
//     */
//    private String remarks;
//
//    @JsonAnySetter
//    public void handleUnknown(String key, Object value) {
//        log.warn("Unknown Property:{{}: {}}", key, value);
//    }

    @Override
    public String toString() {
        ObjectMapper om = BeanHelper.getBean(ObjectMapper.class);
        try {
            return om.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return super.toString();
    }
}
