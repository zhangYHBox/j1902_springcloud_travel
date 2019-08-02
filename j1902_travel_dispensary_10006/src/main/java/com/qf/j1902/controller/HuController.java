package com.qf.j1902.controller;

import com.qf.j1902.pojo.CollectionList;
import com.qf.j1902.pojo.TravelMsg;
import com.qf.j1902.service.TravelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by F117 on 2019/7/31.
 */
@Controller
public class HuController {
    @Autowired
    TravelService travelService;
   /* @Autowired
    SolrService solrService;*/

    //主页点击景点之后展示的景点列表
    @RequestMapping("route_listsss")
    public String route_list(@RequestParam(value = "current",defaultValue = "1") Integer current
            ,Model model){
       // System.out.println("------------------"+current);
        List<TravelMsg> allMessage = travelService.findAllMessage(current);
        model.addAttribute("allMessage",allMessage);
        return "jingdian_list";
    }

    @RequestMapping("route_list_page")
    public String route_list1(@RequestParam(value = "current") Integer current
            ,Model model){
        //System.out.println("=================="+current);
        List<TravelMsg> allMessage = travelService.findAllMessage(current);
        model.addAttribute("allMessage",allMessage);
        return "jingdian_list";
    }
    @RequestMapping("socketChart")
    public ModelAndView chat_room(){
        return new ModelAndView("socketChart", "username", "Beyond");
    }

    @RequestMapping("/GoodCart")
    @ResponseBody
    public int GwCart(@RequestParam("id") Integer tid){
        System.out.println("---zz----===================---"+tid);
        //添加到收藏表中
        int result = travelService.insertOneById(tid);
       // System.out.println("咋地啦:"+result);
        return result;
    }
    @RequestMapping(value = "jingdian_detail")
    //选择景区点击之后跳转到该景区的详情页面
    public String route_detail(@RequestParam("id") Integer id,Model model){
        TravelMsg travelMsg = travelService.findOneById(id);
        model.addAttribute("travelMsg",travelMsg);
        return "jingdian_detail";
    }

    @RequestMapping("/favoriterank")
    public ModelAndView favoriterank(){
        List<CollectionList> allCollections = travelService.findAllCollections();
        return new ModelAndView("favoriterank","allCollections",allCollections);
    }

}
