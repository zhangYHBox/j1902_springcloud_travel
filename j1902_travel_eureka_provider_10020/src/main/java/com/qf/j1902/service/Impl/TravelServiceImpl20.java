package com.qf.j1902.service.Impl;

import com.github.pagehelper.PageHelper;
import com.qf.j1902.mapper.TravelCartMapper;
import com.qf.j1902.mapper.TravelCollectionMapper;
import com.qf.j1902.mapper.TravelMsgMapper;
import com.qf.j1902.pojo.*;
import com.qf.j1902.service.TravelService20;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by F117 on 2019/7/19.
 */
@Service
public class TravelServiceImpl20 implements TravelService20 {
    @Autowired
    TravelMsgMapper travelMsgMapper;
    //@Autowired
   // TravelCartMapper travelCartMapper;
    @Autowired
    TravelCollectionMapper collectionMapper;
    @Override
    public List<TravelMsg> findAllMessage(Integer current) {
        TravelMsgExample example = new TravelMsgExample();
        Integer pageSize=3;
        PageHelper.startPage(current,pageSize);
        List<TravelMsg> allMessage = travelMsgMapper.selectByExample(example);
        System.out.println("~~~~~~~~~~~"+allMessage);
        return allMessage;
    }

    @Override
    public TravelMsg findOneById(Integer id) {
        TravelMsg travelMsg = travelMsgMapper.selectByPrimaryKey(id);
        return travelMsg;
    }

    @Override
    public int addToCollectionList(int tid) {
        System.out.println("怎么回事啊"+tid);
        int amount = 0;
        int insert = 0;
        TravelCollection collection = collectionMapper.selectCollectionByTid(tid);
        if(collection==null){
            System.out.println("++++++++++++++++++++"+tid);
            TravelCollection travelCollection = new TravelCollection();
            travelCollection.setTid(tid);
            travelCollection.setAmount(1);
            insert = collectionMapper.insert(travelCollection);
        }else {
            amount = collection.getAmount()+1;
            insert = collectionMapper.updateByTid(tid, amount);
        }
        System.out.println(insert);
        return insert;
    }

    @Override
    public List<CollectionList> findAllCollections() {
        List<CollectionList> allCollections = collectionMapper.findAllCollections();
        System.out.println("sssssssssssss"+allCollections);
        return allCollections;
    }
}




