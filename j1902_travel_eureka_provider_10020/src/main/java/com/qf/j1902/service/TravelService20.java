package com.qf.j1902.service;

import com.qf.j1902.pojo.CollectionList;
import com.qf.j1902.pojo.TravelCart;
import com.qf.j1902.pojo.TravelMsg;
import io.swagger.models.auth.In;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by F117 on 2019/7/19.
 */
public interface TravelService20 {
    //查询所有的旅游景区信息
    public List<TravelMsg> findAllMessage(Integer current);
    //根据id查询旅游景区的具体信息
    public TravelMsg findOneById(Integer id);
    /**
    //根据id将获取到的旅游景区信息添加到购物车中
    public Integer insertOneById(Integer id);
    //查询购物车中的所有信息
    public List<TravelCart> findAllCartMsg();
     */
    //通过景区tid获取挡墙景区并且添加到收藏表中
    public int addToCollectionList(int tid);
    //按照收藏的人数排序查找出收藏夹中的旅游咨询
    public List<CollectionList> findAllCollections();
}
