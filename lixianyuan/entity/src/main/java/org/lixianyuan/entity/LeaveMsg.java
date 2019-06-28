package org.lixianyuan.entity;

import java.util.Date;

/**
 * @Aauthor xianyuan_li@qq.com
 * @Date: Create in 14:28 2019/5/8
 * @Description: 留言的javabean
 */
public class LeaveMsg {
    private String leaveMsgId;

    private String name;

    private String email;

    private String content;

    private Date leaveTime;

    private String ipAddress;

    public String getLeaveMsgId() {
        return leaveMsgId;
    }

    public void setLeaveMsgId(String leaveMsgId) {
        this.leaveMsgId = leaveMsgId;
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

    public Date getLeaveTime() {
        return leaveTime;
    }

    public void setLeaveTime(Date leaveTime) {
        this.leaveTime = leaveTime;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    @Override
    public String toString() {
        return "Leavemsg{" +
                "leaveMsgId='" + leaveMsgId + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", content='" + content + '\'' +
                ", leaveTime=" + leaveTime +
                ", ipAddress='" + ipAddress + '\'' +
                '}';
    }
}
