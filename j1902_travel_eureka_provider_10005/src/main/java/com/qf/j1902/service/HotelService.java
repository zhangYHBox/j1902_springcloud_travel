package com.qf.j1902.service;

import com.qf.j1902.pojo.Hotel;

import java.util.List;

/**
 * Created by Administrator on 2019/7/23.
 */
public interface HotelService {
    //获取所有的酒店信息
    public List<Hotel> findAllHotels();
    //分页获取酒店的信息
    public List<Hotel> findAllHotelsByPage(int start, int pageSize);
    //根据id查酒店信息
    public Hotel findHotelById(int hid);

}
