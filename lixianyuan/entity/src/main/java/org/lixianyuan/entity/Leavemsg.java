package org.lixianyuan.entity;

import java.util.Date;

/**
 * @Aauthor xianyuan_li@qq.com
 * @Date: Create in 14:28 2019/5/8
 * @Description: 留言的javabean
 */
public class Leavemsg {
    private String leavemsgid;

    private String name;

    private String email;

    private String content;

    private Date leavetime;

    private String ipaddress;

    public String getLeavemsgid() {
        return leavemsgid;
    }

    public void setLeavemsgid(String leavemsgid) {
        this.leavemsgid = leavemsgid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getLeavetime() {
        return leavetime;
    }

    public void setLeavetime(Date leavetime) {
        this.leavetime = leavetime;
    }

    public String getIpaddress() {
        return ipaddress;
    }

    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress;
    }

    @Override
    public String toString() {
        return "Leavemsg{" +
                "leavemsgid='" + leavemsgid + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", content='" + content + '\'' +
                ", leavetime=" + leavetime +
                ", ipaddress='" + ipaddress + '\'' +
                '}';
    }
}
