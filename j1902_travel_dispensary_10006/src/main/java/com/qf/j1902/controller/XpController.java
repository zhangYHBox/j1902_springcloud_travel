package com.qf.j1902.controller;

import com.alipay.api.AlipayApiException;
import com.qf.j1902.alipay.AlipayBean;
import com.qf.j1902.pojo.TravelMsg;
import com.qf.j1902.service.PayService;
import com.qf.j1902.service.PotalService;
import com.qf.j1902.service.TravelService;
import com.qf.j1902.vo.Alpay;
import com.qf.j1902.vo.OrderRelation;
import com.qf.j1902.vo.OrderSubmitVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.text.ParseException;
import java.util.Random;

/**
 * Created by funkh on 2019/7/31.
 */
@Controller
public class XpController {
    @Autowired
    PotalService potalService;
    @Autowired
    private TravelService beyondService;
    @Autowired
    private PayService payService;

    /*@RequestMapping("/register.html")
    public String register(){
        return "register";
    }*/

    @RequestMapping("/myfavorite.html")
    public String myfavorite(){
        return "myfavorite";
    }

    @RequestMapping("/travel_order.html")
    public String travelorder2(){
        return "travel_order.html";
    }

    @RequestMapping(value = "/travelorder",method = RequestMethod.POST)
    @ResponseBody
    public String travelorder(@RequestParam("id") int id,HttpSession session){
        session.setAttribute("jinId",id);
        return "success";
    }

    @RequestMapping(value = "/cart/order_submit",method = RequestMethod.POST)
    @ResponseBody
    public int order_submit(@RequestBody OrderSubmitVo inputs , HttpSession session) throws ParseException {
        System.out.println(inputs);
        String s = potalService.order_submit(inputs);
        int a = Integer.parseInt(s);
        session.setAttribute("tripId",a);
        return a;
    }
    @RequestMapping("/traveldetail")
    public ModelAndView traveldetail(HttpSession session){
        ModelAndView mv = new ModelAndView();
        Integer id =(Integer) session.getAttribute("jinId");
        Integer tripId = (Integer)session.getAttribute("tripId");
        OrderRelation relation = potalService.findRelation(tripId);
        System.out.println("relation==="+relation.getUserinfoName());
        TravelMsg oneById = beyondService.findOneById(id);
        System.out.println(id+"00000");
        System.out.println(tripId+"0440");
        mv.addObject("view",oneById);
        mv.addObject("orderRelation",relation);
        mv.setViewName("travel_detail.html");
        return mv;
    }
    @PostMapping (value = "/alipay")
    public String zhifu(@RequestParam("totalAmount")String totalAmount,@RequestParam("subject")String subject,@RequestParam("body")String body,HttpSession session) {
        Alpay alpay = new Alpay();
        alpay.setSubject(subject);
        alpay.setTotalAmount(totalAmount);
        alpay.setBody(body);
        session.setAttribute("alpay",alpay);
        return "success";
    }
    //支付宝支付
    @GetMapping (value = "/order/alipay")
    @ResponseBody
    public String alipay(HttpSession session) throws AlipayApiException {
        Alpay alpay =(Alpay) session.getAttribute("alpay");
        AlipayBean alipayBean = new AlipayBean();
        int i = new Random().nextInt();
        alipayBean.setOut_trade_no(""+i);
        alipayBean.setSubject("飞利浦 HR1897/30破壁微榨原汁机");
        alipayBean.setTotal_amount("0.1");
        alipayBean.setBody("飞利浦 HR1897/30破壁微榨原汁机aaa");
        return payService.aliPay(alipayBean);
    }

    @RequestMapping("/successe")
    public String success(){
        return "success.html";
    }
    @RequestMapping("/fails")
    public String error(){
        return "error.html";
    }

//    @GetMapping (value = "/weather")
//    public String weather() {
//        return "Weather";
//    }

    //查询天气
    @PostMapping("/weather")
    @ResponseBody
    public String show(@RequestParam("city")String city,@RequestParam(value = "key",defaultValue = "")String key) throws IOException {
        String str = potalService.weather(city, key);
        return str;
    }
}
