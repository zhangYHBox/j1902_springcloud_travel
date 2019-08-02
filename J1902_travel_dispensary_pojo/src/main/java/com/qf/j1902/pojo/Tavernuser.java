package com.qf.j1902.pojo;


import java.util.Date;

/**
 * CREATE TABLE `tavernuser` (
 `uid` int(11) NOT NULL AUTO_INCREMENT,
 `uname` varchar(64) DEFAULT NULL,
 `email` varchar(64) DEFAULT NULL,
 `stay_date` datetime DEFAULT NULL,
 `departure_date` datetime DEFAULT NULL,
 `room` varchar(64) DEFAULT NULL,
 `numbers` int(11) DEFAULT NULL,
 PRIMARY KEY (`uid`)
 ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
 * Created by Administrator on 2019/7/19.
 */
public class Tavernuser {
    private Integer uid; //id自增
    private String uname; //姓名
    private String email; //邮箱
    private Date stay_date;  //入住日期
    private Date departure_date; //离店日期
    /*private String room; //房间类型*/
    private Integer numbers; //入住人数
    private Integer id; /*外键*/
    private  Tavern tavern; //订阅者所在的酒店类型

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Tavern getTavern() {
        return tavern;
    }

    public void setTavern(Tavern tavern) {
        this.tavern = tavern;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getStay_date() {
        return stay_date;
    }

    public void setStay_date(Date stay_date) {
        this.stay_date = stay_date;
    }

    public Date getDeparture_date() {
        return departure_date;
    }

    public void setDeparture_date(Date departure_date) {
        this.departure_date = departure_date;
    }


    public Integer getNumbers() {
        return numbers;
    }

    public void setNumbers(Integer numbers) {
        this.numbers = numbers;
    }

    @Override
    public String toString() {
        return "Tavernuser{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", email='" + email + '\'' +
                ", stay_date=" + stay_date +
                ", departure_date=" + departure_date +
                ", numbers=" + numbers +
                ", tavern=" + tavern +
                '}';
    }
}
