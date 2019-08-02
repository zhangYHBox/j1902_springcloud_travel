package com.qf.j1902.service;

import com.qf.j1902.pojo.Tavernuser;

import java.util.List;

/**
 * Created by Administrator on 2019/7/19.
 */
public interface TavernuserService {
    //添加订阅酒店的用户信息
    public int addTavernUser(Tavernuser tavernuser);
    //查询酒店订阅的信息
    public List<Tavernuser> findAllandprice();
    //根据id删除会员酒店订单信息
    public int deleteTavernUserById(int uid);
}
