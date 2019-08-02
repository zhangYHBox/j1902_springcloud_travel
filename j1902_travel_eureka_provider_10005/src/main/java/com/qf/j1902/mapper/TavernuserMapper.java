package com.qf.j1902.mapper;

import com.qf.j1902.pojo.Tavernuser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2019/7/19.
 */
@Mapper
public interface TavernuserMapper {
    public List<Tavernuser> findAll();
    //添加订阅酒店的用户信息
    public boolean addTavernUser(Tavernuser tavernuser);
    //查询酒店订阅的信息
    public List<Tavernuser> findAllandprice();
    //根据id删除会员酒店订单信息
    public boolean deleteTavernUserById(@Param("uid") int uid);
}
