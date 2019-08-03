package com.qf.j1902.mapper;

import com.qf.j1902.pojo.Commemts;
import com.qf.j1902.service.CommentService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.Date;
import java.util.List;


/**
 * Created by Administrator on 2019/7/19.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@Configuration("com.qf.j1902.service")
public class TestMapper {
@Autowired
    private CommentService commentService;
@Autowired
private CommemtsAndUserMapper commemtsAndUserMapper;
@Autowired
    private CommemtsMapper commemtsMapper;
@Test
    public void trst1(){
    List<Commemts> comments = commemtsAndUserMapper.getComments(1);
    for (Commemts c:comments
         ) {
        System.out.println(c);
    }
}
@Test
    public void test2(){
    List<Commemts> commemtsList = commentService.getCommemts(1);
    for (Commemts c:commemtsList
         ) {
        System.out.println(c);
    }
}
@Test
public void test3(){
    int commentmo = commentService.getCommentmo(1);
    System.out.println(commentmo);
}
@Test
public void test4() {

}
}
