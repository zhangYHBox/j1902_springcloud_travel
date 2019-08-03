package com.qf.j1902.service;

import com.qf.j1902.pojo.Commemts;
import com.qf.j1902.pojo.Comment;

import java.util.List;

/**
 * Created by Administrator on 2019/7/19.
 */
public interface CommentService {

    List<Commemts> getCommemts(int satisfydegree);

    int getCommentmo(Integer satisfydegree);

    int getCommentmoall();

    List<Commemts> getCommemts();

    boolean addCommemts(Comment comment);

    boolean delComment(Integer cid);
}
