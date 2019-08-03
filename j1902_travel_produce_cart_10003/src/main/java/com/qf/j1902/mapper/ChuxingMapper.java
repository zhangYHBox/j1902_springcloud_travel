package com.qf.j1902.mapper;

import com.qf.j1902.entity.Chuxing;
import com.qf.j1902.entity.ChuxingExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ChuxingMapper {
    int countByExample(ChuxingExample example);

    int deleteByExample(ChuxingExample example);

    int deleteByPrimaryKey(Integer gid);

    int insert(Chuxing record);

    int insertSelective(Chuxing record);

    List<Chuxing> selectByExample(ChuxingExample example);

    Chuxing selectByPrimaryKey(Integer gid);

    int updateByExampleSelective(@Param("record") Chuxing record, @Param("example") ChuxingExample example);

    int updateByExample(@Param("record") Chuxing record, @Param("example") ChuxingExample example);

    int updateByPrimaryKeySelective(Chuxing record);

    int updateByPrimaryKey(Chuxing record);
}