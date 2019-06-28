package org.lixianyuan.service;

import org.lixianyuan.entity.LeaveMsg;

import java.util.List;
import java.util.Map;

/**
 * @Aauthor xianyuan_li@qq.com
 * @Date: Create in 15:06 2019/6/28
 * @Description:
 */
public interface LeaveMsgService {

    /**
     * 添加留言
     * @param leaveMsg
     * @return
     */
    public abstract int addLeaveMsg(LeaveMsg leaveMsg);

    /**
     * 分页查询留言
     * @param currentPage 当前页页号
     * @param currentSize 每页显示的记录数
     * @return
     */
    public abstract Map<String,Object> findLeaveMsg(String currentPage,String currentSize);
}
