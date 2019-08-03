package com.qf.j1902.controller;

import com.qf.j1902.pojo.Comment;
import com.qf.j1902.pojo.Tavern;
import com.qf.j1902.service.*;
import com.qf.j1902.vo.ActivityResult;
import com.qf.j1902.vo.MsgResult;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2019/7/29.
 */
@Controller
public class BackStageController {
    @Autowired
    private MemberServcie memberServcie;
    @Autowired
    private CommentService commentService;
    @Autowired
    private TavernService tavernService;
    @Autowired
    private TravelMsgService travelMsgService;
    @ApiOperation(value = "获取用户信息",notes = "获取用户信息")
    @ResponseBody
    @RequestMapping(value = "/getAllMember",method = RequestMethod.POST)//分页查询
    public ActivityResult getAllMember(@RequestParam(value = "page",defaultValue = "1")Integer page,
                                       @RequestParam(value = "pageSize",defaultValue = "10")Integer row,
                                       @RequestParam(value = "title",defaultValue = "")String title){
        System.out.println(page+"+"+row+"+"+title);
        ActivityResult members=memberServcie.getAllMember(page,row,title);
        return members;
    }
    @ApiOperation(value = "批量删除",notes = "批量删除")
    @ResponseBody
    @RequestMapping(value = "/deleteuser",method = RequestMethod.POST)//批量删除用户
    public MsgResult delMemberById(@RequestParam("ids")String ids){
        String[] split = ids.split(",");
        ArrayList<Object> list = new ArrayList<>();
        for (int i=0;i<split.length;i++){
            list.add(Integer.valueOf(split[i]));
        }
        System.out.println(list);
        int i = memberServcie.delMembersByIds(list);
        MsgResult result = new MsgResult();
        result.setStatus(200);
        result.setMessage("删除成功");
        return result;
    }
    @ApiOperation(value = "获取评论内容",notes = "包括评论人信息及评论对象信息  ")
    @ResponseBody
    @RequestMapping(value = "/getAllComments",method = RequestMethod.POST)// 评论表，用户表及景区表
    public ActivityResult getAllHotel(@RequestParam(value = "page",defaultValue = "1")Integer page,
                                   @RequestParam(value = "pageSize",defaultValue = "10")Integer row,
                                   @RequestParam(value = "title",defaultValue = "")String title){
        ActivityResult comments=commentService.findAllComment(page,row,title);
        return comments;
    }
    @ResponseBody
    @RequestMapping("/getAllTavern")
    public List<Tavern> getAllTavern(){
        List<Tavern> taverns=tavernService.getAllTavern();
        return taverns;
    }
    @ApiOperation(value = "评论批量删除",notes = "批量删除")
    @ResponseBody
    @RequestMapping(value = "/deleteComment",method = RequestMethod.POST)//批量删除用户评论
    public MsgResult delCommentsByIds(@RequestParam("ids")String ids){
        String[] split = ids.split(",");
        ArrayList<Object> list = new ArrayList<>();
        for (int i=0;i<split.length;i++){
            list.add(Integer.valueOf(split[i]));
            System.out.println(split[i]);
        }
        System.out.println(list);
        int i = commentService.delCommentsByIds(list);
        MsgResult result = new MsgResult();
        result.setStatus(200);
        result.setMessage("删除成功");
        return result;
    }
    @ResponseBody
    @RequestMapping(value = "/addreply",method = RequestMethod.POST)// 对用户评论进行回复
    public  MsgResult addreply(@RequestParam(value = "cid",defaultValue = "1")Integer cid,
                                   @RequestParam(value = "reply",defaultValue = "")String reply){
       int i= commentService.updateCommentById(cid,reply);
        MsgResult result = new MsgResult();
        result.setStatus(200);
        if (i==1){
            result.setMessage("添加成功");
        }else {
            result.setMessage("添加失败");
        }
        return result;
    }
    @ResponseBody
    @RequestMapping(value = "/reply",method = RequestMethod.GET)// 对用户评论进行回复
    public  Comment selectCommentById(@RequestParam(value = "cid",defaultValue = "1")Integer cid){
      Comment comment= commentService.selectCommentById(cid);
       return comment;
    }
    @ResponseBody
    @RequestMapping(value = "/audit",method = RequestMethod.POST)//批量审核通过
    public MsgResult audit(@RequestParam("idss")String idss){
        String[] split = idss.split(",");
        String state="审核通过";
        for (int i=0;i<split.length;i++){
           int cid=Integer.valueOf(split[i]);
            int s=commentService.updateCommentStateById(cid,state);
        }
        MsgResult result = new MsgResult();
        result.setStatus(200);
        result.setMessage("修改成功");
        return result;
    }
    @ResponseBody
    @RequestMapping(value = "/noAudit",method = RequestMethod.POST)//批量审核不通过
    public MsgResult noaudit(@RequestParam("idss")String idss){
        String[] split = idss.split(",");
        String state="审核不通过";
        for (int i=0;i<split.length;i++){
            int cid=Integer.valueOf(split[i]);
            System.out.println(cid);
            int s=commentService.updateCommentStateById(cid,state);
        }
        MsgResult result = new MsgResult();
        result.setStatus(200);
        result.setMessage("修改成功");
        return result;
    }
    @ResponseBody
    @RequestMapping(value = "/viewmanager",method = RequestMethod.POST)//景点信息分页查询
    public ActivityResult selectAllTravelMsg(@RequestParam(value = "page",defaultValue = "1")Integer page,
                                       @RequestParam(value = "pageSize",defaultValue = "10")Integer row,
                                       @RequestParam(value = "title",defaultValue = "")String title){
        System.out.println(page+"+"+row+"+"+title);
        ActivityResult travelMsgs=travelMsgService.selectAllTravelMsg(page,row,title);
        return travelMsgs;
    }
    @ResponseBody
    @RequestMapping(value = "/views",method = RequestMethod.POST)//景点信息批量审核通过
    public MsgResult views(@RequestParam("idss")String idss){
        String[] split = idss.split(",");
        String state="审核通过";
        for (int i=0;i<split.length;i++){
            int cid=Integer.valueOf(split[i]);
            int s=travelMsgService.updateTravalStateById(cid,state);
        }
        MsgResult result = new MsgResult();
        result.setStatus(200);
        result.setMessage("修改成功");
        return result;
    }
    @ResponseBody
    @RequestMapping(value = "/deleteview",method = RequestMethod.POST)//批量删除景点
    public MsgResult deleteview(@RequestParam("ids")String ids){
        String[] split = ids.split(",");
        ArrayList<Object> list = new ArrayList<>();
        for (int i=0;i<split.length;i++){
            list.add(Integer.valueOf(split[i]));
            System.out.println(split[i]);
        }
        System.out.println(list);
        int i = travelMsgService.delTravalMsgByIds(list);
        MsgResult result = new MsgResult();
        result.setStatus(200);
        result.setMessage("删除成功");
        return result;
    }
    @ResponseBody
    @RequestMapping(value = "/noviews",method = RequestMethod.POST)//景点信息批量审核通过
    public MsgResult noviews(@RequestParam("idss")String idss){
        String[] split = idss.split(",");
        String state="审核不通过";
        for (int i=0;i<split.length;i++){
            int cid=Integer.valueOf(split[i]);
            int s=travelMsgService.updateTravalStateById(cid,state);
        }
        MsgResult result = new MsgResult();
        result.setStatus(200);
        result.setMessage("修改成功");
        return result;
    }
}
