package com.qf.j1902.pojo;

/**
 *  `commentid` int(11) DEFAULT NULL,
 `pid` int(11) DEFAULT NULL
 * Created by Administrator on 2019/7/25.
 */
public class HotelPinglun {
    private int commentid;
    private int pid;

    public int getCommentid() {
        return commentid;
    }

    public void setCommentid(int commentid) {
        this.commentid = commentid;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    @Override
    public String toString() {
        return "HotelPinglun{" +
                "commentid=" + commentid +
                ", pid=" + pid +
                '}';
    }
}
