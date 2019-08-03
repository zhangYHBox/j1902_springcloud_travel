package com.qf.j1902.mapper;

import com.qf.j1902.entity.ContactUser;
import com.qf.j1902.entity.ContactUserExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ContactUserMapper {
    int countByExample(ContactUserExample example);

    int deleteByExample(ContactUserExample example);

    int deleteByPrimaryKey(Integer contactId);

    int insert(ContactUser record);

    int insertSelective(ContactUser record);

    List<ContactUser> selectByExample(ContactUserExample example);

    ContactUser selectByPrimaryKey(Integer contactId);

    int updateByExampleSelective(@Param("record") ContactUser record, @Param("example") ContactUserExample example);

    int updateByExample(@Param("record") ContactUser record, @Param("example") ContactUserExample example);

    int updateByPrimaryKeySelective(ContactUser record);

    int updateByPrimaryKey(ContactUser record);
}