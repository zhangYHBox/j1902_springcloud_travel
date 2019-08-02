package com.qf.j1902.controller;

import com.qf.j1902.pojo.City;
import com.qf.j1902.pojo.Hotel;
import com.qf.j1902.service.CityService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Administrator on 2019/7/25.
 */
@Controller
public class CityController {
    @Autowired
    private CityService cityService;


    @RequestMapping("/findCity")
    @ResponseBody
    public List<City> findCitys(){
        List<City> citys = cityService.findCitys();

        return citys;
    }

    @RequestMapping("/findCityByhid")
    @ResponseBody
    public List<City> findCityByhid(@RequestParam("hid") Integer hid){
        List<City> cnameByHid = cityService.findCnameByHid(hid);

        return cnameByHid;
    }

}
