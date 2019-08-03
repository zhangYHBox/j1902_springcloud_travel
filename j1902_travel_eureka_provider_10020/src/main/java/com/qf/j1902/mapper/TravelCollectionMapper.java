package com.qf.j1902.mapper;

import com.qf.j1902.pojo.CollectionList;
import com.qf.j1902.pojo.TravelCollection;
import com.qf.j1902.pojo.TravelCollectionExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import javax.websocket.server.PathParam;

@Mapper
public interface TravelCollectionMapper {
    int countByExample(TravelCollectionExample example);

    int deleteByExample(TravelCollectionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TravelCollection record);

    int insertSelective(TravelCollection record);

    List<TravelCollection> selectByExample(TravelCollectionExample example);

    TravelCollection selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TravelCollection record, @Param("example") TravelCollectionExample example);

    int updateByExample(@Param("record") TravelCollection record, @Param("example") TravelCollectionExample example);

    int updateByPrimaryKeySelective(TravelCollection record);

    int updateByPrimaryKey(TravelCollection record);

    int updateByTid(@Param("tid")Integer tid,@Param("amount")Integer amount);

    TravelCollection selectCollectionByTid(Integer tid);

    List<CollectionList> findAllCollections();
}