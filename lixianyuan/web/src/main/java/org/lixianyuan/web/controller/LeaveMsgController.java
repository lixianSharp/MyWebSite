package org.lixianyuan.web.controller;

import lombok.extern.slf4j.Slf4j;

import org.lixianyuan.entity.LeaveMsg;
import org.lixianyuan.service.LeaveMsgService;
import org.lixianyuan.web.util.UUIDUtil;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/**
 * @Aauthor xianyuan_li@qq.com
 * @Date: Create in 12:59 2019/5/8
 * @Description:
 */
@Slf4j
@Controller
public class LeaveMsgController {

    @Autowired
    private LeaveMsgService leaveMsgService;
    /**
     * 添加留言
     * @param leavemsg 添加的留言信息
     * @param request
     * @return 返回的添加结果
     */
    @RequestMapping(method = RequestMethod.POST, value = "/addLeaveMsg")
    public @ResponseBody String addLeaveMsg(LeaveMsg leavemsg, HttpServletRequest request) {
        String ip = getIPAddress(request);
        leavemsg.setLeaveMsgId(UUIDUtil.getUUID());

        leavemsg.setLeaveTime(new Date());
        if(ip!=null){
            leavemsg.setIpAddress(ip);
        }else{
            ip = "127.0.0.1";
        }

        System.out.println("接受到的数据=》"+leavemsg);
        //数据入库
        int result = leaveMsgService.addLeaveMsg(leavemsg);
        return "ok"+result;
    }

    /**
     * 查询留言
     * @param currentPage 当前页页号
     * @param currentSize 每页显示的记录数
     * @return
     */
    @RequestMapping("/findLeaveMsg")
    public @ResponseBody Map<String,Object> findLeaveMsg(String currentPage,String currentSize){
        Map<String,Object> leaveMsgList = leaveMsgService.findLeaveMsg(currentPage,currentSize);
        return leaveMsgList;
    }

    /**
     * 获取ip地址
     * @param request
     * @return ip地址
     */
    public static String getIPAddress(HttpServletRequest request) {
        String ip = null;

        //X-Forwarded-For：Squid 服务代理
        String ipAddresses = request.getHeader("X-Forwarded-For");

        if (ipAddresses == null || ipAddresses.length() == 0 || "unknown".equalsIgnoreCase(ipAddresses)) {
            //Proxy-Client-IP：apache 服务代理
            ipAddresses = request.getHeader("Proxy-Client-IP");
        }

        if (ipAddresses == null || ipAddresses.length() == 0 || "unknown".equalsIgnoreCase(ipAddresses)) {
            //WL-Proxy-Client-IP：weblogic 服务代理
            ipAddresses = request.getHeader("WL-Proxy-Client-IP");
        }

        if (ipAddresses == null || ipAddresses.length() == 0 || "unknown".equalsIgnoreCase(ipAddresses)) {
            //HTTP_CLIENT_IP：有些代理服务器
            ipAddresses = request.getHeader("HTTP_CLIENT_IP");
        }

        if (ipAddresses == null || ipAddresses.length() == 0 || "unknown".equalsIgnoreCase(ipAddresses)) {
            //X-Real-IP：nginx服务代理
            ipAddresses = request.getHeader("X-Real-IP");
        }

        //有些网络通过多层代理，那么获取到的ip就会有多个，一般都是通过逗号（,）分割开来，并且第一个ip为客户端的真实IP
        if (ipAddresses != null && ipAddresses.length() != 0) {
            ip = ipAddresses.split(",")[0];
        }

        //还是不能获取到，最后再通过request.getRemoteAddr();获取
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ipAddresses)) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }


}
