package com.qf.j1902.service.impl;

import com.qf.j1902.mapper.HotelMapper;
import com.qf.j1902.pojo.Hotel;
import com.qf.j1902.service.HotelService;
import com.qf.j1902.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import springfox.documentation.spring.web.json.Json;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2019/7/23.
 */
@Service
public class HotelServiceImpl implements HotelService {
    @Autowired
    private RedisTemplate redisTemplate;

    @Resource
    private HotelMapper hotelMapper;
    @Override
    public List<Hotel> findAllHotels() {
        List<Hotel> hotelList = hotelMapper.findAllHotels();
        return hotelList;
    }

    @Override
    public List<Hotel> findAllHotelsByPage(int start, int pageSize) {
        List<Hotel> hotelsByPage = hotelMapper.findAllHotelsByPage(start, pageSize);
        return hotelsByPage;
    }


    @Override
    public Hotel findHotelById(int hid) {
       /* String key="content"+hid;  //定义一个redis的key值
        //首先，查询redis,如果数据存在，则返回数据，如果数据不存在，则继续查询数据库
        Object o = redisTemplate.opsForValue().get(key);
        if(o!=null){

            Hotel hotel = JsonUtils.jsonToPojo((String) o, Hotel.class);
            //List<Hotel> hotelList = JsonUtils.jsonToList((String) o, Hotel.class);
            return hotel;
        }else { //从redis无法获取数据时，查数据库
            Hotel hotel = hotelMapper.findHotelById(hid);

            // 从数据库中查出数据，先写入redis中，再返回数据；
            //  将对象转为json字符串
            String json= JsonUtils.objectToJson(hotel);

            redisTemplate.opsForValue().set(key,json); //写入redis
            return hotel;
        }*/
        Hotel hotelById = hotelMapper.findHotelById(hid);
        //System.out.println(hotelById);
        return hotelById;
    }

}
