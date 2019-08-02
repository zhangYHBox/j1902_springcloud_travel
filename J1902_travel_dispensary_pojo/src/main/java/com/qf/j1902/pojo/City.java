package com.qf.j1902.pojo;

/**
 *  `cid` int(11) NOT NULL AUTO_INCREMENT,
 `  cname` varchar(64) DEFAULT NULL,
 * Created by Administrator on 2019/7/25.
 */
public class City {
    private int cid;
    private String cname;

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "City{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                '}';
    }
}
