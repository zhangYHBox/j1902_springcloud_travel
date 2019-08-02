package com.qf.j1902.cityTest;

import com.qf.j1902.mapper.CityMapper;
import com.qf.j1902.pojo.City;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2019/7/25.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@Configuration("com.qf.j1902.mapper")
public class CityTest {
    @Resource
    private CityMapper cityMapper;

    @Test
    public void test1(){
        List<City> citys = cityMapper.findCitys();
        System.out.println(citys);

    }
    @Test
    public void test4(){
        List<City> cnameByHid = cityMapper.findCnameByHid(2);
        System.out.println(cnameByHid);
    }
}
