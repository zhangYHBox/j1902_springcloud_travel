package com.qf.j1902.service;


import com.qf.j1902.pojo.*;
import com.qf.j1902.service.impl.FeignHystrixServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Administrator on 2019/7/19.
 */
@FeignClient(value = "eureka-provicer",fallback = FeignHystrixServiceImpl.class)
public interface RemoteService {
    @RequestMapping("/list")
    public List<Tavern> findAll();
    @RequestMapping("/gwc")
    @ResponseBody
    public List<Tavernuser> getAllandPrice();

    @RequestMapping(value = "/addTavernuser")
    public Integer addTavernuser(@RequestParam("uname") String uname,
                                 @RequestParam("email") String email,
                                 @RequestParam("stay_date") String stay_date,
                                 @RequestParam("departure_date") String departure_date,
                                 @RequestParam("room") String room,
                                 @RequestParam("numbers") String numbers);
    @RequestMapping("/deleteuser")
    public Integer deleteUserByid(@RequestParam("uid") Integer uid);

    @RequestMapping("/findHotels")
    public List<Hotel> findHotels();

    @RequestMapping("/findAllHotelsByPage")
    public List<Hotel> findAllHotelsByPage(@RequestParam("start") Integer start,
                                           @RequestParam("pageSize") Integer pageSize);

    @RequestMapping("/findHotelById")
    public Hotel findHotelById(@RequestParam("hid") String hid);

    @RequestMapping("/findCity")
    public List<City> findCitys();

    @RequestMapping(value = "/addMember",method = RequestMethod.POST)
    public Integer addmember(@RequestBody Member member);

    @RequestMapping("/findCityByhid")
    public List<City> findCityByhid(@RequestParam("hid") String hid);

    @RequestMapping("/getMemberByLoginname")
    public Member getMember(@RequestParam("loginname") String loginname);

}
