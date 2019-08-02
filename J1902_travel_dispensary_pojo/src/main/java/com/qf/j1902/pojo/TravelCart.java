package com.qf.j1902.pojo;

import lombok.Data;

@Data
public class TravelCart {
    private Integer id;

    private String businessmen;

    private String img;

    private String commodity;

    private Double price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBusinessmen() {
        return businessmen;
    }

    public void setBusinessmen(String businessmen) {
        this.businessmen = businessmen == null ? null : businessmen.trim();
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public String getCommodity() {
        return commodity;
    }


    public void setCommodity(String commodity) {
        this.commodity = commodity == null ? null : commodity.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}