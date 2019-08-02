package com.qf.j1902.controller;

import com.alibaba.fastjson.JSONObject;
import com.zhenzi.sms.ZhenziSmsClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Random;

/**
 * Created by Administrator on 2019/7/24.
 */
@Controller
public class CodeController {
    private static final long serialVersionUID = 1L;
    //短信平台相关参数
//这个不用改
    private String apiUrl = "https://sms_developer.zhenzikj.com";
    //榛子云系统上获取,需更改
    private String appId = "102153";
    private String appSecret = "28178436-33b4-4f8e-869a-f56aea5f39cf";

    @RequestMapping("/fitness/code")
    @ResponseBody
    public boolean getCode(@RequestParam("telephone") String telephone, HttpSession session){
        System.out.println(telephone);

        return true;

/*        try {
            JSONObject json=null;
            // 随机生成验证码
            String code = String.valueOf(new Random().nextInt(999999));
            // 将验证码通过榛子云接口发送到手机
            ZhenziSmsClient client = new ZhenziSmsClient(apiUrl, appId, appSecret);
            // 返回结果是json格式的字符串, code: 发送状态，0为成功。非0为发送失败，可从data中查看错误信息
            *//*
            {
			    "code":0,
			    "data":"发送成功"
			}
             *//*
            String result = client.send(telephone, "您的验证码为：" + code + ", 该码有限期为5分钟，该码只能使用一次!");
            json = JSONObject.parseObject(result);
            if(json.getIntValue("code")!=0){ // 发送短信失败
                return false;

            }
            // 将验证码存到session中,同时存入创建时间
            // 以json存放，这里使用的是阿里的fastjson
            json = new JSONObject();
            json.put("memPhone",telephone);
            json.put("code",code);
            json.put("createTime",System.currentTimeMillis());
            // 将认证码存入SESSION
            session.setAttribute("code",json);
            return true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
        */
    }

}
