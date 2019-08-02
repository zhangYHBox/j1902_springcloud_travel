package com.qf.j1902.pojo;

/**
 *  `pid` int(11) NOT NULL AUTO_INCREMENT,
 `commment` varchar(100) DEFAULT NULL,
 PRIMARY KEY (`pid`)
 * Created by Administrator on 2019/7/25.
 */
public class Pinglun {
    private int pid;
    private String comment;
    private String uname;

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Pinglun{" +
                "pid=" + pid +
                ", comment='" + comment + '\'' +
                ", uname='" + uname + '\'' +
                '}';
    }
}
