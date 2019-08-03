package com.qf.j1902.controller;

import com.qf.j1902.service.*;
import com.qf.j1902.vo.OrderRelation;
import com.qf.j1902.vo.OrderSubmitVo;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.apache.http.HttpEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.text.ParseException;

/**
 * Created by funkh on 2019/7/20.
 */
@RestController
@RequestMapping(value = "/cart")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/ordersubmit",method = RequestMethod.POST)
    public String order_submit(@RequestBody OrderSubmitVo inputs) throws ParseException {
        String s = orderService.addOrder(inputs);
        return s;
    }
    @RequestMapping(value = "/findrelation",method = RequestMethod.POST)
    public OrderRelation findRelation(@RequestParam("tripId") int tripId){
        OrderRelation relationId = orderService.findRelationId(tripId);
        System.out.println("TripContactUserinfo========="+relationId);
        return relationId;
    }
    //查询天气
    @PostMapping("/weather")
    @ResponseBody
    public String show(@RequestParam("city")String city,@RequestParam("key")String key) throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        String uri = "http://apis.juhe.cn/simpleWeather/query?app=weather.today&city=" + city + "&key=" + key;
        HttpGet httpGet = new HttpGet(uri);
        CloseableHttpResponse response = httpClient.execute(httpGet);
        HttpEntity entity = response.getEntity();
        String str = EntityUtils.toString(entity);
        return str;
    }
}
