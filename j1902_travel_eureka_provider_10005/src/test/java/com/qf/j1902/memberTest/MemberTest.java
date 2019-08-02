package com.qf.j1902.memberTest;

import com.qf.j1902.mapper.MemberMapper;
import com.qf.j1902.pojo.Member;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2019/7/26.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@Configuration("com.qf.j1902.mapper")
public class MemberTest {
    @Resource
    private MemberMapper memberMapper;
    @Test
    public void test1() throws ParseException {
        Member member = new Member();
        member.setUsername("wanglu");
        member.setLoginname("wwlluu");
        member.setPassword("152522525");
        member.setEmail("1170980440@qq.com");
        member.setGender("男");

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String fortime = "1989-07-02";
        Date parse = df.parse(fortime);

        member.setBirth(parse);
        member.setTel("13456852564");
        boolean b = memberMapper.addMember(member);
        System.out.println(b);
    }
    @Test
    public void test2(){
        Member wanglu1 = memberMapper.getMemberByLoginname("wanglu1");
        System.out.println(wanglu1);
    }
}
