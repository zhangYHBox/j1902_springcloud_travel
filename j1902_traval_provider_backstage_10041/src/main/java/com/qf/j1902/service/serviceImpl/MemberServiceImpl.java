package com.qf.j1902.service.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.StringUtil;
import com.qf.j1902.mapper.MemberMapper;
import com.qf.j1902.pojo.Member;
import com.qf.j1902.pojo.MemberExample;
import com.qf.j1902.service.MemberServcie;
import com.qf.j1902.vo.ActivityResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2019/7/29.
 */
@Service
public class MemberServiceImpl implements MemberServcie{
@Autowired
private MemberMapper memberMapper;
    @Override
    public ActivityResult getAllMember(Integer page, Integer row, String title) {
        ActivityResult result = new ActivityResult();
        MemberExample example = new MemberExample();
        MemberExample.Criteria criteria = example.createCriteria();
        if (!StringUtil.isEmpty(title)){
            criteria.andUsernameLike("%"+title+"%");
        }
        PageHelper.startPage(page,row);
        List<Member> members = memberMapper.selectByExample(example);
        PageInfo<Member> memberPageInfo = new PageInfo<>(members);
        result.setRows(members);
        long total = memberPageInfo.getTotal();
        result.setTotal(total);
        return result;
    }

    @Override
    public int delMembersByIds(ArrayList<Object> list) {

        return memberMapper.delMembersByIds(list);
    }

}
