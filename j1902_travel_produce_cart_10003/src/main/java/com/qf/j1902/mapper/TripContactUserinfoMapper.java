package com.qf.j1902.mapper;

import com.qf.j1902.entity.TripContactUserinfo;
import com.qf.j1902.entity.TripContactUserinfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface TripContactUserinfoMapper {
    int countByExample(TripContactUserinfoExample example);

    int deleteByExample(TripContactUserinfoExample example);

    int deleteByPrimaryKey(Integer tripId);

    int insert(TripContactUserinfo record);

    int insertSelective(TripContactUserinfo record);

    List<TripContactUserinfo> selectByExample(TripContactUserinfoExample example);

    TripContactUserinfo selectByPrimaryKey(Integer tripId);

    int updateByExampleSelective(@Param("record") TripContactUserinfo record, @Param("example") TripContactUserinfoExample example);

    int updateByExample(@Param("record") TripContactUserinfo record, @Param("example") TripContactUserinfoExample example);

    int updateByPrimaryKeySelective(TripContactUserinfo record);

    int updateByPrimaryKey(TripContactUserinfo record);
}