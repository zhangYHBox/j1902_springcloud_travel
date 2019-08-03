package com.qf.j1902.service;

import com.qf.j1902.pojo.Hotel;
import com.qf.j1902.pojo.Member;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by Administrator on 2019/7/29.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@Configuration("com.qf.j1902.service")
public class ServiceTest {
    @Autowired
    private MemberServcie memberServcie;
    @Autowired
    private HotelService hotelService;
    @Autowired
    private CommentService  commentService;
  /*  @Test
    public void getAllMember(){
        List<Member> allMember = memberServcie.getAllMember();
        for (Member m:allMember
             ) {
            System.out.println(m);
        }
    }*/
    @Test
    public void getAllHotel(){
        List<Hotel> hotel = hotelService.getAllHotel();
        for (Hotel h:hotel
             ) {
            System.out.println(h);
        }
    }
    @Test
    public void updateCommentById(){
        int hehe = commentService.updateCommentById(1, "哈哈");
        System.out.println(hehe);
    }
}
