package com.qf.j1902.mapper;

import com.qf.j1902.pojo.Tavern;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by Administrator on 2019/7/19.
 */
@Mapper
public interface TavernMapper {
    public List<Tavern> findTaverns();
}
