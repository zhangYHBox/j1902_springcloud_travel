package com.qf.j1902.service.impl;

import com.qf.j1902.mapper.CityMapper;
import com.qf.j1902.pojo.City;
import com.qf.j1902.service.CityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2019/7/25.
 */
@Service
public class CityServiceImpl implements CityService {
    @Resource
    private CityMapper cityMapper;
    @Override
    public List<City> findCitys() {
        List<City> citys = cityMapper.findCitys();
        return citys;
    }

    @Override
    public List<City> findCnameByHid(int hid) {
        List<City> cnameByHid = cityMapper.findCnameByHid(hid);
        return cnameByHid;
    }
}
