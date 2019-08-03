package com.qf.j1902.service;

import com.qf.j1902.pojo.Commemts;
import com.qf.j1902.pojo.Comment;
import com.qf.j1902.vo.ActivityResult;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2019/7/19.
 */
public interface CommentService {

    ActivityResult findAllComment(Integer page, Integer row, String title);

    int updateCommentById(Integer cid, String reply);

    int delCommentsByIds(ArrayList<Object> list);

    Comment selectCommentById(Integer cid);

    int updateCommentStateById(int cid, String state);
}
