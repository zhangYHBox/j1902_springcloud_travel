package com.qf.j1902.pojo;

import java.util.Date;

public class Comment {
    private Integer cid;

    private Integer sid;

    private Integer uid;

    private Integer satisfydegree;

    private String state;

    private String content;

    private Date committime;

    private String pic;

    private String reply;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getSatisfydegree() {
        return satisfydegree;
    }

    public void setSatisfydegree(Integer satisfydegree) {
        this.satisfydegree = satisfydegree;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getCommittime() {
        return committime;
    }

    public void setCommittime(Date committime) {
        this.committime = committime;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply == null ? null : reply.trim();
    }
}