package com.example.demo.web.dao;

import com.example.demo.web.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by chupeng on 2017/7/14.
 */

@Mapper
public interface UserMapper {

    @Select("select * from user ")
    public List<User> findAll();
}
