package com.qf.j1902.service;

import com.qf.j1902.vo.OrderRelation;
import com.qf.j1902.vo.OrderSubmitVo;
import org.springframework.web.bind.annotation.RequestBody;

import java.text.ParseException;

/**
 * Created by funkh on 2019/7/24.
 */
public interface OrderService {
    public String addOrder(@RequestBody OrderSubmitVo inputs) throws ParseException;
    public OrderRelation findRelationId(int id);
}
