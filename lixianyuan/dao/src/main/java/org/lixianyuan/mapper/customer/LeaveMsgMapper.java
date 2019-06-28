package org.lixianyuan.mapper.customer;


import org.lixianyuan.entity.LeaveMsg;

import java.util.List;
import java.util.Map;

/**
 * @Aauthor xianyuan_li@qq.com
 * @Date: Create in 14:34 2019/6/28
 * @Description: 留言的mapper
 */
public interface LeaveMsgMapper {
    /**
     * 添加留言
     * @param leaveMsg 留言的bean
     * @return
     */
    public abstract int addLeaveMsg(LeaveMsg leaveMsg);

    /**
     * 修改留言
     * @param leaveMsg
     * @return
     */
    public abstract int updLeaveMsg(LeaveMsg leaveMsg);

    /**
     * 删除留言
     * @param leaveMsg
     * @return
     */
    public abstract int delLeaveMsg(LeaveMsg leaveMsg);

    /**
     * 查看留言
     * @param map 封装参数的map currentPage:当前页页号,currentSize:每页显示的记录数
     * @return
     */
    public abstract List<LeaveMsg> findLeaveMsg(Map map);

    /**
     * 获取留言的总记录数
     * @param map
     * @return 留言总记录数
     */
    public abstract Integer findLeaveMsgCount(Map map);
}
