package com.qf.j1902.enterTest;

import com.qf.j1902.mapper.EnterpriseMapper;
import com.qf.j1902.pojo.Enterprise;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by Administrator on 2019/7/30.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@Configuration("com.qf.j1902.mapper")
public class EnterTest {
    @Autowired
    private EnterpriseMapper enterpriseMapper;
    @Test
    public void test1(){
        Enterprise enterprise = new Enterprise("wlllll","wulei","115252635@qq.com","12456","125256666566","156363255632","images/img1.jpg");
        boolean b = enterpriseMapper.addEnterprise(enterprise);
        System.out.println(b);
    }
    @Test
    public void test2(){
        List<Enterprise> enterprises = enterpriseMapper.getEnterprises();
        System.out.println(enterprises);
    }

    @Test
    public void test3(){
        boolean b = enterpriseMapper.updateEnter("lili", "liwang", "11525225@qq.com", "52555555", "12526355563");
        System.out.println(b);
    }
}
