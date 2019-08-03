package com.qf.j1902.mapper;

import com.qf.j1902.pojo.Comment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface CommemtsMapper {
    boolean addCommemts(Comment comment);

    boolean delComment(@Param("cid")Integer cid);
}
