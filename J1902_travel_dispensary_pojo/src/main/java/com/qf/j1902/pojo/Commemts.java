package com.qf.j1902.pojo;

import lombok.Data;

import java.util.Date;
@Data
public class Commemts {
    private Integer cid;
    private Integer sid;
    private Integer uid;
    private Integer satisfydegree;
    private String state;
    private String content;
    private Date committime;
    private String pic;
    private User user;
}