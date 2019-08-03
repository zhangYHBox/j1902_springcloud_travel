package com.qf.j1902.controller;

import com.qf.j1902.pojo.Commemts;
import com.qf.j1902.pojo.Comment;
import com.qf.j1902.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Administrator on 2019/7/20.
 */
@Controller
public class ProviderController {
    @Autowired
    private CommentService commentService;
    @ResponseBody
    @RequestMapping(value = "/getcomments")
    public List<Commemts> getComments(@RequestParam("type")Integer satisfydegree){
        List<Commemts> commemtsList=commentService.getCommemts(satisfydegree);
        return commemtsList;
    }
    @ResponseBody
    @RequestMapping(value = "/getallcomments")
    public List<Commemts> getallcomments(){
        List<Commemts> commemtsList=commentService.getCommemts();
        return commemtsList;
    }
    @ResponseBody
    @RequestMapping(value = "/getCommentmo")
    public Integer getCommentmo(@RequestParam("type")Integer satisfydegree){
        int nom=commentService.getCommentmo(satisfydegree);
        return nom;
    }
    @ResponseBody
    @RequestMapping(value = "/getCommentmoall")
    public Integer getCommentmoall(){
        int nom=commentService.getCommentmoall();
        return nom;
    }
    @ResponseBody
    @RequestMapping(value = "addCommemts",method = RequestMethod.POST)
    public boolean addCommemts(@RequestBody Comment comment){
       boolean b= commentService.addCommemts(comment);
        System.out.println(comment);
        return b;
    }
    @ResponseBody
    @RequestMapping(value = "/delComment")
    public boolean delComment(@RequestParam("cid")Integer cid){
        boolean b=commentService.delComment(cid);
        return b;
    }
}
