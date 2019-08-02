package com.qf.j1902.controller;

import com.qf.j1902.pojo.Hotel;
import com.qf.j1902.pojo.Tavern;
import com.qf.j1902.pojo.Tavernuser;
import com.qf.j1902.service.TavernService;
import com.qf.j1902.service.TavernuserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2019/7/19.
 */
@Controller
public class DispensaryController {
    @Autowired
    private TavernService tavernService;
    @Autowired
    private TavernuserService userService;

    @RequestMapping("/list")
    @ResponseBody
    public List<Tavern> list(){
            List<Tavern> taverns = tavernService.findTaverns();
            return taverns;
    }
    @RequestMapping("/gwc")
    @ResponseBody
    public List<Tavernuser> gogwc(){
        List<Tavernuser> allandprice = userService.findAllandprice();
        return allandprice;
    }

    @RequestMapping(value = "/addTavernuser")
    @ResponseBody
    @ApiOperation(value="添加会员订阅信息")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query", name = "uname", value = "用户名称", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "email", value = "邮箱", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "stay_date", value = "住店时间", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "departure_date", value = "离店时间", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "room", value = "房间名称", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "numbers", value = "入住人数", required = true, dataType = "String")


    })
    public Integer addTavernuser(@RequestParam("uname") String uname,
                                 @RequestParam("email") String email,
                                 @RequestParam("stay_date") String stay_date,
                                 @RequestParam("departure_date") String departure_date,
                                 @RequestParam("room") Integer id,
                                 @RequestParam("numbers") String numbers) throws ParseException {
        Tavernuser tavernuser = new Tavernuser();
        tavernuser.setUname(uname);
        tavernuser.setEmail(email);

        //string类型转Date类型
        SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        Date staydate = df.parse(stay_date.toString());
        Date departuredate = df.parse(departure_date.toString());
        tavernuser.setStay_date(staydate);
        tavernuser.setDeparture_date(departuredate);

        tavernuser.setId(id);
        tavernuser.setNumbers((Integer.parseInt(numbers)));
        int i = userService.addTavernUser(tavernuser);

        return i;
    }

    @RequestMapping("/deleteuser")
    @ResponseBody
    @ApiOperation(value="根据id删除会员订阅信息")
    @ApiImplicitParam(paramType="query", name = "uid", value = "用户id", required = true, dataType = "Integer")
    public Integer deleteUserByid(@RequestParam("uid") Integer uid){
        int i = userService.deleteTavernUserById(uid);
        //System.out.println(i);
        return i;
    }
}
