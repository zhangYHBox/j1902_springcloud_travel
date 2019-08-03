package com.qf.j1902.service.serviceImpl;

import com.qf.j1902.mapper.HotelMapper;
import com.qf.j1902.pojo.Hotel;
import com.qf.j1902.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2019/7/29.
 */
@Service
public class HotelServiceImpl implements HotelService{
    @Autowired
    private HotelMapper hotelMapper;
    @Override
    public List<Hotel> getAllHotel() {
        return hotelMapper.findAllHotel();
    }
}
