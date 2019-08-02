package com.qf.j1902.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2019/7/27.
 */
@Controller
public class ViewController {

    @RequestMapping("/kefu")
    public String kefu(){
        return "kefu";
    }
    @RequestMapping("/room")
    public String h(Model model, String uname, String roomid){
        model.addAttribute("uname",uname);
        model.addAttribute("roomid", roomid);
        return "kefuindex";
    }
}
