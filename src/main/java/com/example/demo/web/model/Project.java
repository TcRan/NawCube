package com.example.demo.web.model;

import java.util.Date;
import java.util.List;

/**
 * 主要涉及的表：project  user 。。。
 *
 * Created by chupeng on 2017/7/13.
 */
public class Project {

    private long id;

    private String name ;

    private String template;

    private String description;

    private Date createdate;

    private int del ;//del=1 表示删除，del=0 表示没有删除

    private String manager;

    private List<String> members;

    public Project(){}

    public Project(String name, String template, Date createdate, String description) {
        this.name = name;
        this.template = template;
        this.createdate = createdate;
        this.description = description;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", template='" + template + '\'' +
                ", description='" + description + '\'' +
                ", createdate=" + createdate +
                '}';
    }
}