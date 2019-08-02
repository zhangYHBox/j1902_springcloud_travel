package com.qf.j1902.mapper;

import com.qf.j1902.pojo.Member;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by Administrator on 2019/7/26.
 */
@Mapper
public interface MemberMapper {
    //注册用户添加信息
    public boolean addMember(Member member);

    //根据账户查询用户信息
    public Member getMemberByLoginname(String loginname);
}
