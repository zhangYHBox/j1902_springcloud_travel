package com.qf.j1902.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * `id` int(11) NOT NULL AUTO_INCREMENT,
 `loginname` varchar(64) DEFAULT NULL,
 `password` varchar(64) DEFAULT NULL,
 `email` varchar(64) DEFAULT NULL,
 `username` varchar(64) DEFAULT NULL,
 `gender` varchar(10) DEFAULT NULL,
 `birth` datetime DEFAULT NULL,
 `tel` varchar(32) DEFAULT NULL,
 * Created by Administrator on 2019/7/26.
 */
public class Member implements Serializable {
    private int id;  //id
    private String loginname;  //账号
    private String password;  //密码
    private String email;  //邮箱
    private String username;  //姓名
    private String gender; //性别
    private Date birth;  //出生日期
    private String tel;  //电话

    public Member() {
    }

    public Member(String loginname, String password, String email, String username, String gender, Date birth, String tel) {
        this.loginname = loginname;
        this.password = password;
        this.email = email;
        this.username = username;
        this.gender = gender;
        this.birth = birth;
        this.tel = tel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", loginname='" + loginname + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", gender='" + gender + '\'' +
                ", birth=" + birth +
                ", tel='" + tel + '\'' +
                '}';
    }
}
