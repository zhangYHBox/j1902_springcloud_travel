package com.qf.j1902.pojo;


/**
 * CREATE TABLE `tavern` (
 `id` int(11) NOT NULL AUTO_INCREMENT,
 `tname` varchar(64) DEFAULT NULL,
 `room` varchar(64) DEFAULT NULL,
 `tdesc` varchar(200) DEFAULT NULL,
 `tprice` varchar(64) DEFAULT NULL,
 `tcomment` varchar(200) DEFAULT NULL,
 PRIMARY KEY (`id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
 * Created by Administrator on 2019/7/19.
 */

public class Tavern {
    private Integer id; //id自增
    private String tname; //名字
    private String room;  //酒店房间
    private String tdesc;  //房间描述
    private String tprice; //价钱
    private String tcomment;  //简介
    private String img;

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getTdesc() {
        return tdesc;
    }

    public void setTdesc(String tdesc) {
        this.tdesc = tdesc;
    }

    public String getTprice() {
        return tprice;
    }

    public void setTprice(String tprice) {
        this.tprice = tprice;
    }

    public String getTcomment() {
        return tcomment;
    }

    public void setTcomment(String tcomment) {
        this.tcomment = tcomment;
    }

    @Override
    public String toString() {
        return "Tavern{" +
                "id=" + id +
                ", tname='" + tname + '\'' +
                ", room='" + room + '\'' +
                ", tdesc='" + tdesc + '\'' +
                ", tprice='" + tprice + '\'' +
                ", tcomment='" + tcomment + '\'' +
                ", img='" + img + '\'' +
                '}';
    }
}
