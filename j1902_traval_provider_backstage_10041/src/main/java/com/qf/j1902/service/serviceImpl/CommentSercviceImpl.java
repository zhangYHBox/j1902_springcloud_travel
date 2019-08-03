package com.qf.j1902.service.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.j1902.mapper.CommentMapper;
import com.qf.j1902.pojo.Comment;
import com.qf.j1902.pojo.CommentExample;
import com.qf.j1902.service.CommentService;
import com.qf.j1902.vo.ActivityResult;
import com.qf.j1902.vo.Commentvo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2019/7/19.
 */
@Service
public class CommentSercviceImpl implements CommentService{
    @Autowired
    private CommentMapper commentMapper;
    @Override
    public ActivityResult findAllComment(Integer page, Integer row, String title) {
        ActivityResult result = new ActivityResult();
        CommentExample example = new CommentExample();
        CommentExample.Criteria criteria = example.createCriteria();
        /*if (!StringUtil.isEmpty(title)){
            criteria.and("%"+title+"%");
        }*/
        PageHelper.startPage(page,row);
        List<Commentvo> comments = commentMapper.selectAllComment();
        PageInfo<Commentvo> commentPageInfo = new PageInfo<>(comments);
        result.setRows(comments);
        long total = commentPageInfo.getTotal();
        result.setTotal(total);
        return result;
    }

    @Override
    public int updateCommentById(Integer cid, String reply) {
        return commentMapper.updateCommentById(cid,reply);
    }

    @Override
    public int delCommentsByIds(ArrayList<Object> list) {
        return commentMapper.delCommentsByIds(list);
    }

    @Override
    public Comment selectCommentById(Integer cid) {
        return commentMapper.selectByPrimaryKey(cid);
    }

    @Override
    public int updateCommentStateById(int cid, String state) {
        return commentMapper.updateCommentStateById(cid,state);
    }
}