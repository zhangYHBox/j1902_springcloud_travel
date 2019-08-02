package com.qf.j1902.service.impl;

import com.qf.j1902.mapper.TavernuserMapper;
import com.qf.j1902.pojo.Tavernuser;
import com.qf.j1902.service.TavernuserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2019/7/19.
 */
@Service
public class TavernuserServiceImpl implements TavernuserService {
    @Resource
    private TavernuserMapper tavernuserMapper;

    @Override
    public int addTavernUser(Tavernuser tavernuser) {
        boolean b = tavernuserMapper.addTavernUser(tavernuser);
        return 1;
    }

    @Override
    public List<Tavernuser> findAllandprice() {
        List<Tavernuser> allandprice = tavernuserMapper.findAllandprice();

        return allandprice;
    }

    @Override
    public int deleteTavernUserById(int uid) {
        boolean b = tavernuserMapper.deleteTavernUserById(uid);
        return 1;
    }
}
