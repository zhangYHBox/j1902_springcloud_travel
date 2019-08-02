package com.qf.j1902.vo;

import lombok.Data;

/**
 * Created by Administrator on 2019/7/25.
 */
@Data
public class HotelNum {
    private String name;
    private int value;

    public HotelNum() {
    }

    public HotelNum(String name, int value) {
        this.name = name;
        this.value = value;
    }
}
