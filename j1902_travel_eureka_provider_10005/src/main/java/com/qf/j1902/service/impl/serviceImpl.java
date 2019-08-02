package com.qf.j1902.service.impl;

import com.qf.j1902.mapper.ImgurlMapper;
import com.qf.j1902.pojo.Imgurl;
import com.qf.j1902.service.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 杜碧天 on 2019/7/24.
 */
@Service
public class serviceImpl implements service {
    @Autowired
    ImgurlMapper imgurlMapper;
    @Override
    public int add(Imgurl imgurl) {
        int insert = imgurlMapper.insertSelective(imgurl);
        return insert;
    }
}
