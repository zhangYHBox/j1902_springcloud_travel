package com.qf.j1902.controller;

import com.alibaba.fastjson.JSONObject;
import com.qf.j1902.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Random;

/**
 * Created by Administrator on 2019/7/26.
 */
@Controller
public class MailController {
    @Autowired
    private MailService mailService;

    @RequestMapping("getCheckCode")
    @ResponseBody
    public String getCheckCode(String email, HttpSession session){
        String checkCode = String.valueOf(new Random().nextInt(899999) + 100000);
        String message = "您的注册验证码为："+checkCode;
        try {

            session.setAttribute("checkCode",checkCode);
            mailService.sendSimpleMail(email, "注册验证码", message);
        }catch (Exception e){
            return "";
        }


        return checkCode;
    }
}
