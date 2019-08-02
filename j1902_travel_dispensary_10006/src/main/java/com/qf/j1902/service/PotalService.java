package com.qf.j1902.service;

import com.qf.j1902.service.impl.PotalServiceImpl;
import com.qf.j1902.vo.OrderRelation;
import com.qf.j1902.vo.OrderSubmitVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * Created by funkh on 2019/7/20.
 */
@FeignClient(value ="produce-cart",fallback = PotalServiceImpl.class)
public interface PotalService {
    @RequestMapping(value = "/cart/ordersubmit",method = RequestMethod.POST)
    public String order_submit(@RequestBody OrderSubmitVo inputs);
    @RequestMapping(value = "/cart/findrelation",method = RequestMethod.POST)
    public OrderRelation findRelation(@RequestParam("tripId") int tripId);
    @RequestMapping(value = "/cart/weather",method = RequestMethod.POST)
    public String weather(@RequestParam("city") String city, @RequestParam("key") String key);
}
