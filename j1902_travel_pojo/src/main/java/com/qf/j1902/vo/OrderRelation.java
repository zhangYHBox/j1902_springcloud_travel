package com.qf.j1902.vo;

import lombok.Data;

import java.util.Date;

/**
 * Created by funkh on 2019/7/24.
 */
@Data
public class OrderRelation {
    private Integer gid;

    private String origin;

    private String destination;

    private Date startDate;

    private Date endDate;

    private Date startTime;

    private Date endTime;

    private Integer contactId;

    private String contactName;

    private String contactTell;

    private Integer userinfoId;

    private Integer uid;

    private String userinfoName;

    private String userinfoIdcard;

    private String userinfoTell;

    private String userinfoGender;

    private Integer userinfoAge;
}
