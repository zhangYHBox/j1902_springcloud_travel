package com.qf.j1902.service.impl;

import com.qf.j1902.service.PotalService;
import com.qf.j1902.vo.OrderRelation;
import com.qf.j1902.vo.OrderSubmitVo;
import org.springframework.stereotype.Service;

/**
 * Created by funkh on 2019/7/20.
 */
@Service
public class PotalServiceImpl implements PotalService{
    @Override
    public String order_submit(OrderSubmitVo inputs) {
        return "1";
    }

    @Override
    public OrderRelation findRelation(int id) {
        OrderRelation orderRelation = new OrderRelation();
        return orderRelation;
    }

    @Override
    public String weather(String city, String key) {
        return null;
    }
}
