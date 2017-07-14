package com.example.demo.web.dao;

import com.example.demo.web.model.Project;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by chupeng on 2017/7/13.
 */

@Mapper
public interface ProjectMapper {

    /**
     * 查询project表，获取全部的project的基本信息
     * @return
     */
    @Select("select * from project")
    public List<Project> findAll();



}
