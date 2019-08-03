package com.qf.j1902.controller;

import com.qf.j1902.pojo.CollectionList;
import com.qf.j1902.pojo.TravelCart;
import com.qf.j1902.pojo.TravelMsg;
import com.qf.j1902.service.TravelService20;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by F117 on 2019/7/19.
 */
@Controller
public class TravelController20 {
    @Autowired
    TravelService20 travelService20;
    //跳转页面之后显示
    @RequestMapping(value = "/route_list",method = RequestMethod.POST)
    @ResponseBody
    public List<TravelMsg> findAllMessage(@RequestParam("current") Integer current){
        System.out.println("lucy=================lulu");
        List<TravelMsg> allMessage = travelService20.findAllMessage(current);
        return allMessage;
    }
    //分页查询之后显示页面
    @RequestMapping(value = "/route_list_page",method = RequestMethod.POST)
    @ResponseBody
    public List<TravelMsg> findAllMessagePage(@RequestParam("current") Integer current){
        List<TravelMsg> allMessage = travelService20.findAllMessage(current);
        return allMessage;
    }
    @ResponseBody
    @RequestMapping(value = "/route_detail",method = RequestMethod.POST)
    @ApiOperation(value="根据景区id来获取景区的信息", notes="test: 在一定的方位内，1,2,3等有效值有正确返回")
    @ApiImplicitParam(paramType="query", name = "id", value = "景区的id", required = true, dataType = "Int")
    public TravelMsg findOneById(@RequestParam("id")Integer id){
        System.out.println("++++++++++++++"+id);
        TravelMsg travelMsg = travelService20.findOneById(id);
        return travelMsg;
    }
    //将选择的物品添加到购物车中
    @RequestMapping(value = "/GoodCart",method = RequestMethod.POST)
    @ResponseBody
    public Integer insertOneById(@RequestParam("id") Integer tid){
        //通过商品id来查找处该货物的所有信息
        Integer integer = travelService20.addToCollectionList(tid);
        return integer;
    }
    /*@RequestMapping(value = "favoriterank")
    public List<CollectionList> findAllCollections(){
        List<CollectionList> allCollections = travelService20.findAllCollections();
        return allCollections;
    }*/
    @RequestMapping(value = "/favoriterank",method = RequestMethod.POST)
    @ResponseBody
    public List<CollectionList> findAllCollections(){
        List<CollectionList> allCollections = travelService20.findAllCollections();
        System.out.println("***((((----------------)))))____"+allCollections);
        return allCollections;
    }
}
