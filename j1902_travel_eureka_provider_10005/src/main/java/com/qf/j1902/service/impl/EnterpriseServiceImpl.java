package com.qf.j1902.service.impl;

import com.qf.j1902.mapper.EnterpriseMapper;
import com.qf.j1902.pojo.Enterprise;
import com.qf.j1902.service.EnterpriseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2019/7/30.
 */
@Service
public class EnterpriseServiceImpl implements EnterpriseService {

    @Resource
    private EnterpriseMapper enterpriseMapper;
    @Override
    public int addEnterprise(Enterprise enterprise) {
        boolean b = enterpriseMapper.addEnterprise(enterprise);
        return 1;
    }

    @Override
    public List<Enterprise> getEnterprises() {
        List<Enterprise> enterprises = enterpriseMapper.getEnterprises();
        return enterprises;
    }

    @Override
    public boolean updateEnter(String loginname, String realname, String email, String cardnum, String tel) {
        boolean b = enterpriseMapper.updateEnter(loginname, realname, email, cardnum, tel);
        return b;
    }
}
