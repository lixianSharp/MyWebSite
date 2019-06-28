package org.lixianyuan.service.impl;

import org.lixianyuan.entity.LeaveMsg;
import org.lixianyuan.mapper.customer.LeaveMsgMapper;
import org.lixianyuan.service.LeaveMsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @Aauthor xianyuan_li@qq.com
 * @Date: Create in 15:07 2019/6/28
 * @Description:
 */
@Service //加入到Spring的IOC容器中
public class LeaveMsgServiceImpl implements LeaveMsgService {

    //注入LeaveMsgMapper
    @Autowired
    private LeaveMsgMapper leaveMsgMapper;

    @Override
    public int addLeaveMsg(LeaveMsg leaveMsg) {
        int result = leaveMsgMapper.addLeaveMsg(leaveMsg);
        return result;
    }

    @Override
    public Map<String,Object> findLeaveMsg(String currentPage, String currentSize) {
        int curPage = Integer.parseInt(currentPage);
        int curSize = Integer.parseInt(currentSize);
        Map map = new LinkedHashMap();
        map.put("currentPage",(curPage-1)*curSize);
        map.put("currentSize",curSize);
        //获取数据
        List<LeaveMsg> leaveMsgList = leaveMsgMapper.findLeaveMsg(map);
        //获取留言的总记录数
        Integer totalRecords = leaveMsgMapper.findLeaveMsgCount(map);
        Map<String,Object> resultMap = new LinkedHashMap<>();
        resultMap.put("leaveMsgList",leaveMsgList);
        resultMap.put("totalRecords",totalRecords);
        return resultMap;
    }


}
