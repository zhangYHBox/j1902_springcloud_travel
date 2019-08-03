package com.qf.j1902.mapper;

import com.qf.j1902.pojo.TravelCart;
import com.qf.j1902.pojo.TravelCartExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface TravelCartMapper {
    int countByExample(TravelCartExample example);

    int deleteByExample(TravelCartExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TravelCart record);

    int insertSelective(TravelCart record);

    List<TravelCart> selectByExample(TravelCartExample example);

    TravelCart selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TravelCart record, @Param("example") TravelCartExample example);

    int updateByExample(@Param("record") TravelCart record, @Param("example") TravelCartExample example);

    int updateByPrimaryKeySelective(TravelCart record);

    int updateByPrimaryKey(TravelCart record);
}