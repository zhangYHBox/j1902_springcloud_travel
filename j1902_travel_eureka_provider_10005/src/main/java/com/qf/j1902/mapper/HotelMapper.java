package com.qf.j1902.mapper;

import com.qf.j1902.pojo.Hotel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2019/7/23.
 */
@Mapper
public interface HotelMapper {
    public List<Hotel> findAllHotels();
    //分页获取酒店的信息
    public List<Hotel> findAllHotelsByPage(@Param("start") int start, @Param("pageSize") int pageSize);
    //根据id查酒店信息
    public Hotel findHotelById(int hid);
}
