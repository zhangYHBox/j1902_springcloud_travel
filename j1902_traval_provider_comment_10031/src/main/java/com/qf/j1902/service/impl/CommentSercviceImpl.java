package com.qf.j1902.service.impl;

import com.qf.j1902.mapper.CommemtsAndUserMapper;
import com.qf.j1902.mapper.CommemtsMapper;
import com.qf.j1902.pojo.Commemts;
import com.qf.j1902.pojo.Comment;
import com.qf.j1902.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2019/7/19.
 */
@Service
public class CommentSercviceImpl implements CommentService{
    @Autowired
    private CommemtsAndUserMapper commemtsAndUserMapper;
    @Autowired
    private CommemtsMapper commemtsMapper;
    @Override
    public List<Commemts> getCommemts(int satisfydegree) {
        System.out.println(satisfydegree);
        return commemtsAndUserMapper.getComments(satisfydegree);
    }

    @Override
    public int getCommentmo(Integer satisfydegree) {

        return commemtsAndUserMapper.getCommentmo(satisfydegree);
    }

    @Override
    public int getCommentmoall() {
        return commemtsAndUserMapper.getCommentmoall();
    }

    @Override
    public List<Commemts> getCommemts() {
        return commemtsAndUserMapper.getCommemtsall();
    }

    @Override
    public boolean addCommemts(Comment comment) {
        return commemtsMapper.addCommemts(comment);
    }

    @Override
    public boolean delComment(Integer cid) {
        return commemtsMapper.delComment(cid);
    }

}