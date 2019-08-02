package com.qf.j1902.service.impl;

import com.qf.j1902.mapper.MemberMapper;
import com.qf.j1902.pojo.Member;
import com.qf.j1902.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2019/7/26.
 */
@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberMapper memberMapper;
    @Override
    public int addMember(Member member) {
        boolean b = memberMapper.addMember(member);
        return 1;
    }

    @Override
    public Member getMemberByLoginname(String loginname) {
        Member memberByLoginname = memberMapper.getMemberByLoginname(loginname);
        return memberByLoginname;
    }
}
