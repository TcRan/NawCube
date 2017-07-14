package com.example.demo.web.model;

/**
 *
 * 根据User表所建的User类，字段值和属性值相同
 * Created by chupeng on 2017/7/13.
 */
public class User {

    //
    private long id;

    private String username;

    private String password;

    private String email;

    private String phoneNumber;

    public User(){}

    public User(String username,String password){
        this.username = username;
        this.password = password;
    }

    public User(String username){
        this.username = username;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
