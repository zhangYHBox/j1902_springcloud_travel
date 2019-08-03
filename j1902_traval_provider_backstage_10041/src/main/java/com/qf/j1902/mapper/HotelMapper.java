package com.qf.j1902.mapper;

import com.qf.j1902.pojo.Hotel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by Administrator on 2019/7/29.
 */
@Mapper
public interface HotelMapper {
    List<Hotel> findAllHotel();

}
