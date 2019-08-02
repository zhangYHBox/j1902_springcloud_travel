package com.qf.j1902.controller;

import com.qf.j1902.pojo.Enterprise;
import com.qf.j1902.service.RemotedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.rmi.server.RemoteServer;
import java.util.List;

/**
 * Created by Administrator on 2019/7/26.
 */
@Controller
public class LoginController {
    @Autowired
    private RemotedService remotedService;


    //登录功能
    @RequestMapping("main")
    public String main(@RequestParam("loginname") String loginname,
                       @RequestParam("password") String password,
                       HttpSession session){




        //System.out.println(loginname);
        session.setAttribute("loginname",loginname);

        return "main";
    }


    @RequestMapping("register.html")
    public String register(){

        return "register";
    }

    //注册商家信息
    @RequestMapping("/goregister")
    public String goregister(@RequestParam("loginname") String loginname,
                             @RequestParam("password") String password){

        System.out.println("=="+loginname);
        System.out.println("=="+password);


        List<Enterprise> getenterprises = remotedService.getenterprises();
        for (Enterprise enterprise:getenterprises) {
            if(enterprise.getLoginname().equals(loginname)){

                return "register";

            }
        }
        Enterprise enterprise = new Enterprise();
        enterprise.setLoginname(loginname);
        enterprise.setPassword(password);
        Integer addenterprise = remotedService.addenterprise(enterprise);

        return "index";
    }
}
