package com.qf.j1902.service;

import com.qf.j1902.pojo.Enterprise;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2019/7/30.
 */
public interface EnterpriseService {
    //添加申请商户审批的商户信息
    public int addEnterprise(Enterprise enterprise);
    //查询所有的商家信息，以便防止重复的loginname
    public List<Enterprise> getEnterprises();

    //根据loginname更改用户信息
    public boolean updateEnter( String loginname,
                                String realname,
                                String email,
                                String cardnum,
                                String tel);
}
