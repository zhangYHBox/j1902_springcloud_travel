package com.qf.j1902.mapper;

import com.qf.j1902.pojo.Commemts;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2019/7/25.
 */
@Mapper
public interface CommemtsAndUserMapper {

    List<Commemts> getComments(@Param("satisfydegree")Integer satisfydegree);

    int getCommentmo(@Param("satisfydegree")Integer satisfydegree);

    int getCommentmoall();

    List<Commemts> getCommemtsall();
}
