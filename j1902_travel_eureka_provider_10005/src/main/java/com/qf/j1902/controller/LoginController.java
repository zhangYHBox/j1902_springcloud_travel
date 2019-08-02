package com.qf.j1902.controller;

import com.qf.j1902.pojo.Member;
import com.qf.j1902.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Administrator on 2019/7/26.
 */
@Controller
public class LoginController {

    @Autowired
    private MemberService memberService;

    @RequestMapping(value = "/addMember",method = RequestMethod.POST)
    @ResponseBody
    public Integer addmember(@RequestBody Member member){
        System.out.println("provider;;"+member);
        int i = memberService.addMember(member);
        return i;
    }

    @RequestMapping("/getMemberByLoginname")
    @ResponseBody
    public Member getMember(@RequestParam("loginname") String loginname){
        Member memberByLoginname = memberService.getMemberByLoginname(loginname);
        return memberByLoginname;
    }
}
