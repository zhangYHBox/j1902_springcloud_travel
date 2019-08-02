package com.qf.j1902.pojo;

/**
 * `cid` int(11) DEFAULT NULL,
 `hid` int(11) DEFAULT NULL
 * Created by Administrator on 2019/7/25.
 */
public class CityHotel {
    private int cid;
    private int hid;

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getHid() {
        return hid;
    }

    public void setHid(int hid) {
        this.hid = hid;
    }

    @Override
    public String toString() {
        return "CityHotel{" +
                "cid=" + cid +
                ", hid=" + hid +
                '}';
    }
}
