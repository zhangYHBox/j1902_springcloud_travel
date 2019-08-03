package com.qf.j1902.mapper;

import com.qf.j1902.pojo.Hotel;
import com.qf.j1902.pojo.Member;
import com.qf.j1902.pojo.Tavern;
import com.qf.j1902.vo.Commentvo;
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
@Configuration
public class MapperTest {
    @Autowired
    private MemberMapper memberMapper;
    @Autowired
    private HotelMapper hotelMapper;
    @Autowired
    private TavernMapper tavernMapper;
    @Autowired
    private CommentMapper commentMapper;

/*@Test
    public void getAllMember(){
    List<Member> allMember = memberMapper.findAllMember();
    for (Member m:allMember
         ) {
        System.out.println(m);
    }
}*/
    @Test
    public void selectAllComment(){
        List<Commentvo> commentvos = commentMapper.selectAllComment();
        for (Commentvo c:commentvos
             ) {
            System.out.println(c);
        }
    }
    @Test
    public void getAllHotel(){
        List<Hotel> allHotel = hotelMapper.findAllHotel();
        for (Hotel h:allHotel
             ) {
            System.out.println(h);
        }
    }
    @Test
    public void getAllTavern(){
        List<Tavern> allTavern = tavernMapper.findAllTavern();
        for (Tavern t:allTavern
             ) {
            System.out.println(t);
        }
    }
    @Test
    public void updateCommentById(){
        int hehe = commentMapper.updateCommentById(1, "hehe");
        System.out.println(hehe);
    }
}
