package com.qf.j1902.mapper;

import com.qf.j1902.pojo.Comment;
import com.qf.j1902.pojo.CommentExample;

import java.util.ArrayList;
import java.util.List;

import com.qf.j1902.vo.Commentvo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface CommentMapper {
    int countByExample(CommentExample example);

    int deleteByExample(CommentExample example);

    int deleteByPrimaryKey(Integer cid);

    int insert(Comment record);

    int insertSelective(Comment record);

    List<Comment> selectByExample(CommentExample example);

    Comment selectByPrimaryKey(Integer cid);

    int updateByExampleSelective(@Param("record") Comment record, @Param("example") CommentExample example);

    int updateByExample(@Param("record") Comment record, @Param("example") CommentExample example);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKey(Comment record);

    List<Commentvo> selectAllComment();

    int updateCommentById(@Param("cid") Integer cid, @Param("reply") String reply);

    int delCommentsByIds(ArrayList<Object> lists);

    int updateCommentStateById(@Param("cid") int cid, @Param("state") String state);
}