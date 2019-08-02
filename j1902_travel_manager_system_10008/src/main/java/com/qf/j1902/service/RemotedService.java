package com.qf.j1902.service;

import com.qf.j1902.pojo.Enterprise;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Administrator on 2019/7/30.
 */
@FeignClient(value = "eureka-provicer")
public interface RemotedService {

    @RequestMapping(value = "/addEnterprise",method = RequestMethod.POST)
    public Integer addenterprise(@RequestBody Enterprise enterprise);

    @RequestMapping("/getEnterprises")
    public List<Enterprise> getenterprises();

    @RequestMapping("/updateEnterprise")
    public Integer updateenter(@RequestParam("loginname") String loginname,
                               @RequestParam("realname") String realname,
                               @RequestParam("email") String email,
                               @RequestParam("cardnum") String cardnum,
                               @RequestParam("tel") String tel);
}
