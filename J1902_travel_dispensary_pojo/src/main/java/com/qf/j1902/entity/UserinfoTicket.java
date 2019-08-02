package com.qf.j1902.entity;

public class UserinfoTicket {
    private Integer userinfoId;

    private Integer uid;

    private String userinfoName;

    private String userinfoIdcard;

    private String userinfoTell;

    private String userinfoGender;

    private Integer userinfoAge;

    public Integer getUserinfoId() {
        return userinfoId;
    }

    public void setUserinfoId(Integer userinfoId) {
        this.userinfoId = userinfoId;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUserinfoName() {
        return userinfoName;
    }

    public void setUserinfoName(String userinfoName) {
        this.userinfoName = userinfoName == null ? null : userinfoName.trim();
    }

    public String getUserinfoIdcard() {
        return userinfoIdcard;
    }

    public void setUserinfoIdcard(String userinfoIdcard) {
        this.userinfoIdcard = userinfoIdcard == null ? null : userinfoIdcard.trim();
    }

    public String getUserinfoTell() {
        return userinfoTell;
    }

    public void setUserinfoTell(String userinfoTell) {
        this.userinfoTell = userinfoTell == null ? null : userinfoTell.trim();
    }

    public String getUserinfoGender() {
        return userinfoGender;
    }

    public void setUserinfoGender(String userinfoGender) {
        this.userinfoGender = userinfoGender == null ? null : userinfoGender.trim();
    }

    public Integer getUserinfoAge() {
        return userinfoAge;
    }

    public void setUserinfoAge(Integer userinfoAge) {
        this.userinfoAge = userinfoAge;
    }
}