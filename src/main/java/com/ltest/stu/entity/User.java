package com.ltest.stu.entity;



import java.io.Serializable;
import java.util.Date;

/**
 * 数据源实体 （企业组件调用）
 * @author linwl
 * @date 2021/8/24 19:11
 */
public class User implements Serializable {

    private static final long serialVersionUID=1L;


    private Integer id;


    private String name;


    private Integer age;


    private Date createTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
