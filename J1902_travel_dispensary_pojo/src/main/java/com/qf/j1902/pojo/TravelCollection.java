package com.qf.j1902.pojo;

import lombok.Data;

@Data
public class TravelCollection {
    private Integer id;

    private Integer tid;

    private int amount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "TravelCollection{" +
                "id=" + id +
                ", tid=" + tid +
                ", amount=" + amount +
                '}';
    }
}