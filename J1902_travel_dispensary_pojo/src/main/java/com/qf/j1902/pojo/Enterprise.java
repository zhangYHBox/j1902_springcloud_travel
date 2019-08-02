package com.qf.j1902.pojo;

/**
 *   `id` int(11) NOT NULL AUTO_INCREMENT,
 `loginname` varchar(64) DEFAULT NULL,
 `realname` varchar(64) DEFAULT NULL,
 `email` varchar(64) DEFAULT NULL,
 `password` varchar(32) DEFAULT NULL,
 `idcard` varchar(64) DEFAULT NULL,
 `tel` varchar(64) DEFAULT NULL,
 `file` varchar(64) DEFAULT NULL,
 `pid` int(11) DEFAULT NULL,
 PRIMARY KEY (`id`)
 *
 */
public class Enterprise {
    private int id;
    private String loginname;
    private String realname;
    private String email;
    private String password;
    private String idcard;
    private String tel;
    private String file;
    private  int pid;

    public Enterprise() {
    }

    public Enterprise(String loginname, String realname, String email, String password, String idcard, String tel, String file) {
        this.loginname = loginname;
        this.realname = realname;
        this.email = email;
        this.password = password;
        this.idcard = idcard;
        this.tel = tel;
        this.file = file;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }


    @Override
    public String toString() {
        return "Enterprise{" +
                "id=" + id +
                ", loginname='" + loginname + '\'' +
                ", realname='" + realname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", idcard='" + idcard + '\'' +
                ", tel='" + tel + '\'' +
                ", file='" + file + '\'' +
                '}';
    }
}
