package com.qf.j1902.service.serviceImpl;

import com.qf.j1902.mapper.TavernMapper;
import com.qf.j1902.pojo.Tavern;
import com.qf.j1902.service.TavernService;
import com.qf.j1902.vo.ActivityResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2019/7/29.
 */
@Service
public class TavernServiceImpl implements TavernService{
    @Autowired
    private TavernMapper tavernMapper;
    @Override
    public List<Tavern> getAllTavern() {
        return tavernMapper.findAllTavern();
    }

    @Override
    public ActivityResult selectAllTravelMsg(Integer page, Integer row, String title) {
        return null;
    }
}
