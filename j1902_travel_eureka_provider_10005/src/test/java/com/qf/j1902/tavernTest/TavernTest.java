package com.qf.j1902.tavernTest;

import com.qf.j1902.mapper.TavernuserMapper;
import com.qf.j1902.pojo.Tavernuser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import javax.xml.bind.SchemaOutputResolver;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2019/7/19.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@Configuration("com.qf.j1902.mapper")
public class TavernTest {
    @Resource
    private TavernuserMapper tavernuserMapper;
    @Test
    public void test1() throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String fortime = df.format(new Date());
        Date parse = df.parse(fortime);

        Tavernuser tavernuser = new Tavernuser();
        tavernuser.setUname("wl2");
        tavernuser.setEmail("1170980441@qq.com");
        tavernuser.setStay_date(parse);
        tavernuser.setDeparture_date(parse);
        tavernuser.setNumbers(2);
        tavernuser.setId(4);
        boolean b = tavernuserMapper.addTavernUser(tavernuser);

    }
    @Test
    public void Test2(){
        List<Tavernuser> allandprice = tavernuserMapper.findAllandprice();
        for (Tavernuser user:allandprice) {
            Date startime = user.getStay_date();
            Date endtime = user.getDeparture_date();
            int i = (int) (endtime.getTime() - startime.getTime()) / (1000 * 3600 * 24);

        }
       System.out.println(allandprice);
    }
}
