package org.lixianyuan.service;

import org.lixianyuan.entity.User;

/**
 * @Aauthor xianyuan_li@qq.com
 * @Date: Create in 17:38 2019/4/25
 * @Description:
 */
public interface UserService {
    /**
     * 通过自定义的mapper查询数据
     * @param id
     * @return
     */
    public User selectUserByCustomer(String id);

    /**
     * 通过自带的mapper查询数据
     * @param id
     * @return
     */
    public User getUserById(String id);
}
