package com.qf.j1902.service;

import com.qf.j1902.vo.ActivityResult;

import java.util.ArrayList;

/**
 * Created by Administrator on 2019/7/30.
 */
public interface TravelMsgService {
    ActivityResult selectAllTravelMsg(Integer page, Integer row, String title);

    int updateTravalStateById(int cid, String state);

    int delTravalMsgByIds(ArrayList<Object> list);
}
