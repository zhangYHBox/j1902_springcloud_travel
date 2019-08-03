package com.qf.j1902.service;

import com.qf.j1902.vo.ActivityResult;

import java.util.ArrayList;

/**
 * Created by Administrator on 2019/7/29.
 */
public interface MemberServcie {
    ActivityResult getAllMember(Integer page, Integer row, String title);

    int delMembersByIds(ArrayList<Object> list);
}
