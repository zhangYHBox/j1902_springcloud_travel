package com.qf.j1902.service.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.StringUtil;
import com.qf.j1902.mapper.TravelMsgMapper;
import com.qf.j1902.pojo.TravelMsg;
import com.qf.j1902.pojo.TravelMsgExample;
import com.qf.j1902.service.TravelMsgService;
import com.qf.j1902.vo.ActivityResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2019/7/30.
 */
@Service
public class TravelMsgServiceImpl implements TravelMsgService {
    @Autowired
    private TravelMsgMapper travelMsgMapper;
    @Override
    public ActivityResult selectAllTravelMsg(Integer page, Integer row, String title) {
        ActivityResult result = new ActivityResult();
        TravelMsgExample example = new TravelMsgExample();
        TravelMsgExample.Criteria criteria = example.createCriteria();
        if (!StringUtil.isEmpty(title)){
            criteria.andCommodityLike("%"+title+"%");
        }
        PageHelper.startPage(page,row);
        List<TravelMsg> travelMsgs = travelMsgMapper.selectByExample(example);
        PageInfo<TravelMsg> travelMsgPageInfo = new PageInfo<TravelMsg>(travelMsgs);
        result.setRows(travelMsgs);
        long total = travelMsgPageInfo.getTotal();
        result.setTotal(total);
        return result;
    }

    @Override
    public int updateTravalStateById(int cid, String state) {
        return travelMsgMapper.updateTravalStateById(cid,state);
    }

    @Override
    public int delTravalMsgByIds(ArrayList<Object> list) {
        return travelMsgMapper.delTravalMsgByIds(list);
    }

}
