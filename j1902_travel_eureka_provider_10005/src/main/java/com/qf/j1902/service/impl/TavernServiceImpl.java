package com.qf.j1902.service.impl;

import com.qf.j1902.mapper.TavernMapper;
import com.qf.j1902.pojo.Tavern;
import com.qf.j1902.service.TavernService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2019/7/19.
 */
@Service
public class TavernServiceImpl implements TavernService {
    @Resource
    private TavernMapper tavernMapper;
    @Override
    public List<Tavern> findTaverns() {
        List<Tavern> taverns = tavernMapper.findTaverns();
        return taverns;
    }
}
