package com.example.demo.web.controller;

import com.example.demo.web.dao.ProjectMapper;
import com.example.demo.web.dao.UserMapper;
import com.example.demo.web.model.Project;
import com.example.demo.web.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by chupeng on 2017/7/13.
 */

@RestController
@RequestMapping("/ziding")
public class ProjectController {

    @Autowired
    private ProjectMapper projectMapper;
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/project")
    public List<Project> findAllProjects(){
        List<Project> projects = projectMapper.findAll();
        return projects;
    }

    @RequestMapping("/user")
    public List<User> findAllUser(){
        List<User> users = userMapper.findAll();
        return users;
    }

}
