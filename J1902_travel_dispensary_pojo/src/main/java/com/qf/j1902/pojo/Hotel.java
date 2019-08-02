package com.qf.j1902.pojo;

/**
 *  `hid` int(11) NOT NULL AUTO_INCREMENT,
 `hname` varchar(64) DEFAULT NULL,
 `intro` varchar(100) DEFAULT NULL,
 `himg` varchar(120) DEFAULT NULL,
 `comment` varchar(100) DEFAULT NULL,
 `score` varchar(10) DEFAULT NULL,
 `hprice` varchar(64) DEFAULT NULL,
 PRIMARY KEY (`hid`)
 * Created by Administrator on 2019/7/23.
 */
public class Hotel {
    private int hid; //酒店的id
    private String hname; //酒店名字
    private String intro; //酒店的简介
    private String himg; //酒店的图片
    private String commentid; //酒店的评论对应的id值
    private String score;  //酒店的评分
    private String hprice; //酒店的一晚起步价

    public int getHid() {
        return hid;
    }

    public void setHid(int hid) {
        this.hid = hid;
    }

    public String getHname() {
        return hname;
    }

    public void setHname(String hname) {
        this.hname = hname;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getHimg() {
        return himg;
    }

    public void setHimg(String himg) {
        this.himg = himg;
    }

    public String getCommentid() {
        return commentid;
    }

    public void setCommentid(String commentid) {
        this.commentid = commentid;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getHprice() {
        return hprice;
    }

    public void setHprice(String hprice) {
        this.hprice = hprice;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hid=" + hid +
                ", hname='" + hname + '\'' +
                ", intro='" + intro + '\'' +
                ", himg='" + himg + '\'' +
                ", commentid='" + commentid + '\'' +
                ", score='" + score + '\'' +
                ", hprice='" + hprice + '\'' +
                '}';
    }
}
