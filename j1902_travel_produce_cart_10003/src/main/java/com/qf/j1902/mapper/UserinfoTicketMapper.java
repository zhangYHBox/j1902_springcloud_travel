package com.qf.j1902.mapper;

import com.qf.j1902.entity.UserinfoTicket;
import com.qf.j1902.entity.UserinfoTicketExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface UserinfoTicketMapper {
    int countByExample(UserinfoTicketExample example);

    int deleteByExample(UserinfoTicketExample example);

    int deleteByPrimaryKey(Integer userinfoId);

    int insert(UserinfoTicket record);

    int insertSelective(UserinfoTicket record);

    List<UserinfoTicket> selectByExample(UserinfoTicketExample example);

    UserinfoTicket selectByPrimaryKey(Integer userinfoId);

    int updateByExampleSelective(@Param("record") UserinfoTicket record, @Param("example") UserinfoTicketExample example);

    int updateByExample(@Param("record") UserinfoTicket record, @Param("example") UserinfoTicketExample example);

    int updateByPrimaryKeySelective(UserinfoTicket record);

    int updateByPrimaryKey(UserinfoTicket record);
}