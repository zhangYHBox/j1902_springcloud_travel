package com.qf.j1902.controller;

import com.alibaba.fastjson.JSONObject;
import com.qf.j1902.pojo.Member;
import com.qf.j1902.service.RemoteService;
import com.qf.j1902.utils.CookieUtils;
import com.qf.j1902.utils.ImgCode;
import com.qf.j1902.utils.RedisUtils;
import org.bouncycastle.asn1.x500.style.RFC4519Style;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.logging.SimpleFormatter;

import static org.bouncycastle.asn1.x500.style.RFC4519Style.member;

/**
 * Created by Administrator on 2019/7/24.
 */
@Controller
public class LoginController {
    @Autowired
    private RemoteService remoteService;

    @RequestMapping("/gologinss")
    public String gologin(@RequestParam("username") String loginname,
                          Model model,HttpSession session,
                        @RequestParam("password") String password){

        Member member = remoteService.getMember(loginname);
        if(member !=null&&password.equals(member.getPassword())){
            session.setAttribute("member",member.getLoginname());
            return "index";
        }
        String jg="账号类型错误或密码错误";
        model.addAttribute("jg",jg);
        return "login";
    }

    //验证码
    @RequestMapping(value = "/getImage",method = RequestMethod.GET)
    public void getVerify(HttpServletRequest request,HttpServletResponse response){
        ImgCode imgCode = new ImgCode();
        imgCode.getRandcode(request,response);
    }

    @RequestMapping("login.html")
    public String login(){

        return "login";
    }

    @RequestMapping("register.html")
    public String register(){
        return "register";
    }



    //注册用户信息的业务
    @RequestMapping("/registuser")
    @ResponseBody
    public void goregistUser(@RequestParam("username") String username,
                             @RequestParam("password") String password,
                             @RequestParam("email") String email,
                             @RequestParam("name") String name,
                             @RequestParam("sex") String sex,
                             @RequestParam("birthday") String birthday,
                             @RequestParam("telephone") String telephone,
                             @RequestParam("check") String check, HttpSession session,
                             HttpServletResponse response) throws IOException, ParseException {

        //JSONObject userCode = (JSONObject)session.getAttribute("code");  手机验证码获取的代码
        String checkCode = (String) session.getAttribute("checkCode");
        // 验证码
        //String code = String.valueOf(userCode.get("code"));
        // 手机号 暂时不需要 以后再说
        //userCode.get("memPhone");
       // String code="2352";  实验，写死的验证码
        if(!checkCode.equals(check)){
            PrintWriter out = response.getWriter();
            out.write(""+0);

        }else { //添加验证码信息
            //System.out.println(username);
            //System.out.println(password);
           // System.out.println(email);
           // System.out.println(name);
           // System.out.println(sex);
           // System.out.println(birthday);
           // System.out.println(telephone);

            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            Date parse = df.parse(birthday);

            Member member = new Member(username,password,email,name,sex,parse,telephone);

            Integer i = remoteService.addmember(member);
            System.out.println(i);
            PrintWriter out = response.getWriter();
            out.write(""+1);
        }
    }

    @RequestMapping("/register_ok")
    public String registerOk(){
        return "register_ok";
    }

   /* @RequestMapping("gologin")
    public String gologin(HttpServletRequest request,HttpServletResponse response){
        String ck= CookieUtils.getCookieValue(request,"p2ptoken");
        if(ck!=null && ck.length()>0){
            RedisUtils.setTime("p2ptoken:"+ck,300);
        }else {
            String name=request.getParameter("username");
            String token= UUID.randomUUID().toString();
            RedisUtils.set("p2ptoken:"+ token,name,300);
            CookieUtils.setCookie(request,response,"p2ptoken",token,300);
        }
        return "index";
    }*/

}
