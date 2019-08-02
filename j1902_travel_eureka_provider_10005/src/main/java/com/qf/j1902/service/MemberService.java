package com.qf.j1902.service;

import com.qf.j1902.pojo.Member;

import java.util.List;

/**
 * Created by Administrator on 2019/7/26.
 */
public interface MemberService {
    //注册用户添加信息
    public int addMember(Member member);

    //根据账户查询用户信息
    public Member getMemberByLoginname(String loginname);
}
