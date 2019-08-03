package com.qf.j1902.service.impl;

import com.qf.j1902.mapper.ChuxingMapper;
import com.qf.j1902.mapper.ContactUserMapper;
import com.qf.j1902.mapper.TripContactUserinfoMapper;
import com.qf.j1902.mapper.UserinfoTicketMapper;
import com.qf.j1902.entity.Chuxing;
import com.qf.j1902.entity.ContactUser;
import com.qf.j1902.entity.TripContactUserinfo;
import com.qf.j1902.entity.UserinfoTicket;
import com.qf.j1902.service.OrderService;
import com.qf.j1902.vo.OrderRelation;
import com.qf.j1902.vo.OrderSubmitVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by funkh on 2019/7/24.
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Resource
    private ChuxingMapper chuxingMapper;
    @Resource
    private ContactUserMapper contactUserMapper;
    @Resource
    private TripContactUserinfoMapper tripContactUserinfoMapper;
    @Resource
    private UserinfoTicketMapper userinfoTicketMapper;
    @Override
    public String addOrder(OrderSubmitVo inputs) throws ParseException {
        String[] split = inputs.getStart_date().split(" - ");
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date date1= formatter.parse(split[0]);
        Date date2= formatter.parse(split[1]);

        String[] times = inputs.getTime().split(" - ");
        SimpleDateFormat formatter2 = new SimpleDateFormat("HH:mm:ss");
        Date time1 = formatter2.parse(times[0]);
        Date time2 = formatter2.parse(times[1]);

        //添加购票人的信息并返回id
        UserinfoTicket userinfoTicket = new UserinfoTicket();
        userinfoTicket.setUserinfoName(inputs.getLoginname());
        userinfoTicket.setUserinfoIdcard(inputs.getIdcard());
        userinfoTicket.setUserinfoTell(inputs.getLogin_tell());
        userinfoTicket.setUserinfoGender(inputs.getGender());
        userinfoTicket.setUserinfoAge(Integer.parseInt(inputs.getAge()));
        int i = userinfoTicketMapper.insertSelective(userinfoTicket);
        System.out.println("id="+userinfoTicket.getUserinfoId());

        //添加联系人信息并返回id
        ContactUser contactUser = new ContactUser();
        contactUser.setContactName(inputs.getContact());
        contactUser.setContactTell(inputs.getContact_tell());
        int i1 = contactUserMapper.insertSelective(contactUser);
        System.out.println("id="+contactUser.getContactId());

        //添加出行信息并返回id
        Chuxing chuxing = new Chuxing();
        chuxing.setOrigin(inputs.getOrigin());
        chuxing.setDestination("青海湖");
        chuxing.setStartDate(date1);
        chuxing.setEndDate(date2);
        chuxing.setStartTime(time1);
        chuxing.setEndTime(time2);
        int i2 = chuxingMapper.insertSelective(chuxing);
        System.out.println("id="+chuxing.getGid());

        //添加关系表
        TripContactUserinfo tripContactUserinfo = new TripContactUserinfo();
        tripContactUserinfo.setGid(chuxing.getGid());
        tripContactUserinfo.setContactId(contactUser.getContactId());
        tripContactUserinfo.setUserinfoId(userinfoTicket.getUserinfoId());
        int num = tripContactUserinfoMapper.insertSelective(tripContactUserinfo);
        System.out.println("num="+tripContactUserinfo.getTripId());
        return ""+tripContactUserinfo.getTripId();
    }

    @Override
    public OrderRelation findRelationId(int id) {
        TripContactUserinfo tripContactUserinfo = tripContactUserinfoMapper.selectByPrimaryKey(id);
        Chuxing chuxing = chuxingMapper.selectByPrimaryKey(tripContactUserinfo.getGid());
        UserinfoTicket userinfoTicket = userinfoTicketMapper.selectByPrimaryKey(tripContactUserinfo.getUserinfoId());
        ContactUser contactUser = contactUserMapper.selectByPrimaryKey(tripContactUserinfo.getContactId());
        OrderRelation orderRelation = new OrderRelation();
        orderRelation.setGid(chuxing.getGid());
        orderRelation.setOrigin(chuxing.getOrigin());
        orderRelation.setDestination(chuxing.getDestination());
        orderRelation.setStartDate(chuxing.getStartDate());
        orderRelation.setEndDate(chuxing.getEndDate());
        orderRelation.setStartTime(chuxing.getStartTime());
        orderRelation.setEndTime(chuxing.getEndTime());
        orderRelation.setContactId(contactUser.getContactId());
        orderRelation.setContactName(contactUser.getContactName());
        orderRelation.setContactTell(contactUser.getContactTell());
        orderRelation.setUserinfoId(userinfoTicket.getUserinfoId());
        orderRelation.setUid(userinfoTicket.getUid());
        orderRelation.setUserinfoName(userinfoTicket.getUserinfoName());
        orderRelation.setUserinfoIdcard(userinfoTicket.getUserinfoIdcard());
        orderRelation.setUserinfoTell(userinfoTicket.getUserinfoTell());
        orderRelation.setUserinfoGender(userinfoTicket.getUserinfoGender());
        orderRelation.setUserinfoAge(userinfoTicket.getUserinfoAge());
        return orderRelation;
    }
}
