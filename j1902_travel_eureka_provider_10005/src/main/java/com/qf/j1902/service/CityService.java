package com.qf.j1902.service;

import com.qf.j1902.pojo.City;

import java.util.List;

/**
 * Created by Administrator on 2019/7/25.
 */
public interface CityService {
    //查询不同省份的酒店数量
    public List<City> findCitys();
    //根据hotelid查出该酒店所在的城市名/或者省份名
    public List<City> findCnameByHid(int hid);
}
