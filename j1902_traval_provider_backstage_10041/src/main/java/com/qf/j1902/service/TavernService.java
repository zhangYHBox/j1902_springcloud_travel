package com.qf.j1902.service;

import com.qf.j1902.pojo.Tavern;
import com.qf.j1902.vo.ActivityResult;

import java.util.List;

/**
 * Created by Administrator on 2019/7/29.
 */
public interface TavernService {

    List<Tavern> getAllTavern();

    ActivityResult selectAllTravelMsg(Integer page, Integer row, String title);
}
