package com.qf.j1902.service.impl;

import com.qf.j1902.pojo.*;
import com.qf.j1902.service.RemoteService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2019/7/23.
 */
@Service
public class FeignHystrixServiceImpl implements RemoteService {
    @Override
    public List<Tavern> findAll() {
        return null;
    }

    @Override
    public List<Tavernuser> getAllandPrice() {
        return null;
    }

    @Override
    public Integer addTavernuser(String uname, String email, String stay_date, String departure_date, String room, String numbers) {
        return 1;
    }

    @Override
    public Integer deleteUserByid(Integer uid) {
        return 1;
    }

    @Override
    public List<Hotel> findHotels() {
        return null;
    }

    @Override
    public List<Hotel> findAllHotelsByPage(Integer start, Integer pageSize) {
        return null;
    }

    @Override
    public Hotel findHotelById(String hid) {
        return null;
    }

    @Override
    public List<City> findCitys() {
        return null;
    }

    @Override
    public Integer addmember(Member member) {
        return 1;
    }

    @Override
    public List<City> findCityByhid(String hid) {
        return null;
    }

    @Override
    public Member getMember(String loginname) {

        return new Member();
    }
}
