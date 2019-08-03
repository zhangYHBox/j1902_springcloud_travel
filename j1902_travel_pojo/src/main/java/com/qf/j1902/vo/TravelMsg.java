package com.qf.j1902.vo;

/**
 * Created by funkh on 2019/7/23.
 */
public class TravelMsg {
    private Integer id;

    private String commodity;

    private String commodityInformation;

    private String images;

    private String businessmen;

    private String advisoryTelephone;

    private String address;

    private String country;

    private String local;

    private String miaoshu;

    private String tickets;

    private Double price;

    private Integer days;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCommodity() {
        return commodity;
    }

    public void setCommodity(String commodity) {
        this.commodity = commodity == null ? null : commodity.trim();
    }

    public String getCommodityInformation() {
        return commodityInformation;
    }

    public void setCommodityInformation(String commodityInformation) {
        this.commodityInformation = commodityInformation == null ? null : commodityInformation.trim();
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images == null ? null : images.trim();
    }

    public String getBusinessmen() {
        return businessmen;
    }

    public void setBusinessmen(String businessmen) {
        this.businessmen = businessmen == null ? null : businessmen.trim();
    }

    public String getAdvisoryTelephone() {
        return advisoryTelephone;
    }

    public void setAdvisoryTelephone(String advisoryTelephone) {
        this.advisoryTelephone = advisoryTelephone == null ? null : advisoryTelephone.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local == null ? null : local.trim();
    }

    public String getMiaoshu() {
        return miaoshu;
    }

    public void setMiaoshu(String miaoshu) {
        this.miaoshu = miaoshu == null ? null : miaoshu.trim();
    }

    public String getTickets() {
        return tickets;
    }

    public void setTickets(String tickets) {
        this.tickets = tickets == null ? null : tickets.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }
}