package com.qf.j1902.vo;

import lombok.Data;

import java.util.Date;

/**
 * Created by funkh on 2019/7/24.
 */
@Data
public class OrderRelation {
    private Integer gid; //id信息

    private String origin; //出发地

    private String destination;//目的地

    private Date startDate;//出行日期

    private Date endDate;//返回日期

    private Date startTime;//开始时间

    private Date endTime;//结束时间

    private Integer contactId;//联系人Id

    private String contactName;//联系人名字

    private String contactTell;//联系人电话

    private Integer userinfoId;//用户信息id

    private Integer uid;//id

    private String userinfoName;//买票人姓名

    private String userinfoIdcard;//买票人身份证

    private String userinfoTell;//电话

    private String userinfoGender;//性别

    private Integer userinfoAge;//年龄
}
