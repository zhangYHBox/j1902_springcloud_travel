package com.qf.j1902.mapper;

import com.qf.j1902.pojo.TravelMsg;
import com.qf.j1902.pojo.TravelMsgExample;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface TravelMsgMapper {
    int countByExample(TravelMsgExample example);

    int deleteByExample(TravelMsgExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(TravelMsg record);

    int insertSelective(TravelMsg record);

    List<TravelMsg> selectByExample(TravelMsgExample example);

    TravelMsg selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") TravelMsg record, @Param("example") TravelMsgExample example);

    int updateByExample(@Param("record") TravelMsg record, @Param("example") TravelMsgExample example);

    int updateByPrimaryKeySelective(TravelMsg record);

    int updateByPrimaryKey(TravelMsg record);

    int updateTravalStateById(@Param("sid") int cid, @Param("state") String state);

    int delTravalMsgByIds(ArrayList<Object> lists);
}