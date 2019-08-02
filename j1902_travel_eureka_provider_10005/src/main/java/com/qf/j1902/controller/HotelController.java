package com.qf.j1902.controller;

import com.qf.j1902.pojo.Hotel;
import com.qf.j1902.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Administrator on 2019/7/23.
 */
@Controller
public class HotelController {
    @Autowired
    private HotelService hotelService;

    @RequestMapping("/findHotels")
    @ResponseBody
    public List<Hotel> findHotels(){
        List<Hotel> hotelList = hotelService.findAllHotels();
        return hotelList;
    }

    @RequestMapping("/findAllHotelsByPage")
    @ResponseBody
    public List<Hotel> findAllHotelsByPage(@RequestParam("start") Integer start,
                                           @RequestParam("pageSize") Integer pageSize){
        List<Hotel> hotelsByPage = hotelService.findAllHotelsByPage(start, pageSize);
        return hotelsByPage;
    }


    /*@RequestMapping("/findHotelsByPages")
    @ResponseBody
    public PagesResult findHotelsByPaegs(@RequestParam(value = "page",defaultValue = "1") Integer page,
                                         @RequestParam(value = "rows",defaultValue = "10") Integer rows){
        PagesResult hotelsByPage = hotelService.findAllHotelsByPage(page, rows);

        return hotelsByPage;
    }*/

    @RequestMapping("/findHotelById")
    @ResponseBody
    public Hotel findHotelById(@RequestParam("hid") Integer hid){
        Hotel hotelById = hotelService.findHotelById(hid);
        System.out.println("===="+hotelById);
        return hotelById;
    }



}
