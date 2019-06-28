package org.lixianyuan.dao;

import org.lixianyuan.entity.LeaveMsg;
import org.lixianyuan.mapper.customer.LeaveMsgMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @Aauthor xianyuan_li@qq.com
 * @Date: Create in 14:31 2019/6/28
 * @Description:
 */
@Repository
public class LeaveMsgMapperDao implements LeaveMsgMapper {

    @Autowired
    private LeaveMsgMapper leaveMsgMapper;

    @Override
    public int addLeaveMsg(LeaveMsg leaveMsg) {
        int result = leaveMsgMapper.addLeaveMsg(leaveMsg);
        return result;
    }

    @Override
    public int updLeaveMsg(LeaveMsg leaveMsg) {
        return 0;
    }

    @Override
    public int delLeaveMsg(LeaveMsg leaveMsg) {
        return 0;
    }

    @Override
    public List<LeaveMsg> findLeaveMsg(Map map) {
        List<LeaveMsg> leaveMsgList = leaveMsgMapper.findLeaveMsg(map);
        return leaveMsgList;
    }

    @Override
    public Integer findLeaveMsgCount(Map map) {
        return leaveMsgMapper.findLeaveMsgCount(map);
    }
}
