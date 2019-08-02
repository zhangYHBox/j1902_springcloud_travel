package com.qf.j1902.controller;

import com.qf.j1902.pojo.Enterprise;
import com.qf.j1902.service.EnterpriseService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Administrator on 2019/7/30.
 */
@Controller
public class EnterpriseController {
    @Autowired
    private EnterpriseService enterpriseService;

    @RequestMapping(value = "/addEnterprise",method = RequestMethod.POST)
    @ResponseBody
    public Integer addenterprise(@RequestBody Enterprise enterprise){
        int i = enterpriseService.addEnterprise(enterprise);
        return i;

    }
    @RequestMapping("/getEnterprises")
    @ResponseBody
    public List<Enterprise> getenterprises(){
        List<Enterprise> enterprises = enterpriseService.getEnterprises();
        return enterprises;
    }

    //修改enterprise
    @RequestMapping("/updateEnterprise")
    @ResponseBody
    @ApiOperation(value="根据账户修改商家信息")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query", name = "loginname", value = "账号", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "realname", value = "姓名", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "email", value = "邮箱", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "cardnum", value = "idcard", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "tel", value = "电话", required = true, dataType = "String")


    })
    public Integer updateenter(@RequestParam("loginname") String loginname,
                               @RequestParam("realname") String realname,
                               @RequestParam("email") String email,
                               @RequestParam("cardnum") String cardnum,
                               @RequestParam("tel") String tel){
        boolean b = enterpriseService.updateEnter(loginname, realname, email, cardnum, tel);
        return 1;
    }
}
