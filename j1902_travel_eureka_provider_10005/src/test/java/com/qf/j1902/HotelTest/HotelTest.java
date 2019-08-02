package com.qf.j1902.HotelTest;

import com.qf.j1902.mapper.HotelMapper;
import com.qf.j1902.pojo.Hotel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2019/7/23.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@Configuration("com.qf.j1902.mapper")
public class HotelTest {
    @Resource
    private HotelMapper hotelMapper;

    @Test
    public void test1(){
        List<Hotel> allHotels = hotelMapper.findAllHotels();
        System.out.println(allHotels);
    }
    @Test
    public void test2(){
        List<Hotel> allHotelsByPage = hotelMapper.findAllHotelsByPage(1, 4);
        System.out.println(allHotelsByPage);
    }
    @Test
    public void test3(){
        Hotel hotelById = hotelMapper.findHotelById(1);
        System.out.println(hotelById);
    }
}
