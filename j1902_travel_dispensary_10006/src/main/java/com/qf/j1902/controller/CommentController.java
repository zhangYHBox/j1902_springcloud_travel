package com.qf.j1902.controller;

import com.qf.j1902.pojo.Commemts;
import com.qf.j1902.pojo.Comment;
import com.qf.j1902.service.RemoteCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2019/7/19.
 */
@Controller
public class CommentController {
    @Autowired
    private RemoteCommentService remoteService;

    @RequestMapping(value = "/gocomment")
    @ResponseBody
    public List<Commemts> getComment(@RequestParam("type")Integer type){//获取评论区数据
        System.out.println("type==========="+type);
        if(type==4){
            List<Commemts> allCommemts = remoteService.getAllCommemts();
            return allCommemts;
        }else {
            List<Commemts> allCommemts =  remoteService.getAllCommemts(type);
            return allCommemts;
        }
    }
    @ResponseBody
    @RequestMapping(value = "/goSaveComment")
    public boolean goSaveComment(@RequestParam("uid")Integer uid,
                                @RequestParam("sid")Integer sid,
                                @RequestParam("type")Double type,
                                @RequestParam("content")String content){
        int value = type.intValue();
        if (value>=4){
            value=1;
        }else if (value>=2){
            value=2;
        }else {
            value=3;
        }

        Date date = new Date();
        Comment comment = new Comment();
        comment.setUid(uid);
        comment.setSid(sid);
        comment.setState("已发布");
        comment.setCommittime(date);
        comment.setSatisfydegree(value);
        comment.setContent(content);
        comment.setPic("");
        System.out.println("-----------------"+comment);
       Boolean b= remoteService.addCommemts(comment);
        return b;
    }

    /*@RequestMapping(value = "/goregister")
    public String goregister(){//到注册页面
        return "register";
    }*/
    @RequestMapping(value = "comments.html")
    public String comments(Model model){//页面进入评论区
        int mo1=remoteService.getCommentsMo(1);
        int mo2 = remoteService.getCommentsMo(2);
        int mo3 = remoteService.getCommentsMo(3);
        int mo4=remoteService.getCommentsMo();
        model.addAttribute("no1",mo1);
        model.addAttribute("no2",mo2);
        model.addAttribute("no3",mo3);
        model.addAttribute("no4",mo4);
        System.out.println(mo1+"===="+mo2+"===="+mo3);
        return "comments.html";
    }
    @RequestMapping(value = "comment.html")
    public String comment(){//页面进入评论区
        return "comment.html";
    }

//    @RequestMapping(value = "route_detail.html")
//    public String getrouteDdetail(){//线路详情
//        return "route_detail.html";
//    }

    @RequestMapping(value = "lvyouxuzhi.html")
    public String lvyouxuzhi(){//线路详情
        return "lvyouxuzhi.html";
    }
}
