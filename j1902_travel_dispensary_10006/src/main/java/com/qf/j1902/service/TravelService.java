package com.qf.j1902.service;


import com.qf.j1902.pojo.CollectionList;
import com.qf.j1902.pojo.TravelCart;
import com.qf.j1902.pojo.TravelMsg;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by F117 on 2019/7/18.
 */
@FeignClient(value = "beyond-server-provider")
public interface TravelService {
    //主页点击景点之后展示的景点列表
    @RequestMapping(value="/route_list" ,method = RequestMethod.POST)
    public List<TravelMsg> findAllMessage(@RequestParam("current") Integer current);

    @RequestMapping(value="/route_list_page",method = RequestMethod.POST)
    public List<TravelMsg> findAllMessagePage(@RequestParam("current") Integer current);

    //选择景区点击之后跳转到该景区的详情页面
    @RequestMapping(value = "/route_detail",method = RequestMethod.POST)
    public TravelMsg findOneById(@RequestParam(value = "id",defaultValue = "1") Integer id);
    //将通过id获得到的旅游信息添加到购物车中
    @RequestMapping(value = "/GoodCart",method = RequestMethod.POST)
    public int insertOneById(@RequestParam("id") Integer tid);
    //按照收藏的人数排序查找出收藏夹中的旅游咨询
    @RequestMapping(value = "/favoriterank",method = RequestMethod.POST)
    public List<CollectionList> findAllCollections();

}
