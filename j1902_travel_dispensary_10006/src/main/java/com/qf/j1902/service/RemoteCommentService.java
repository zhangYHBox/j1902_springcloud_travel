package com.qf.j1902.service;

import com.qf.j1902.pojo.Commemts;
import com.qf.j1902.pojo.Comment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by Administrator on 2019/7/19.
 */
@FeignClient(value =  "comment-server-provider")
public interface RemoteCommentService {
    @RequestMapping(value = "/getcomments")
    List<Commemts> getAllCommemts(@RequestParam("type") Integer type);
    @RequestMapping(value = "/getCommentmo")
    int getCommentsMo(@RequestParam("type") Integer type);
    @RequestMapping(value = "/getCommentmoall")
    int getCommentsMo();
    @RequestMapping(value = "/getallcomments")
    List<Commemts> getAllCommemts();
    @RequestMapping(value = "/addCommemts")
    Boolean addCommemts(@RequestBody Comment comment);
}
