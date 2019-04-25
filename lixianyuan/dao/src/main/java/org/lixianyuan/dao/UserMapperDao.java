package org.lixianyuan.dao;

import org.lixianyuan.entity.User;
import org.lixianyuan.mapper.UserMapper;
import org.lixianyuan.mapper.customer.UserCustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @Aauthor xianyuan_li@qq.com
 * @Date: Create in 14:33 2019/4/25
 * @Description:
 */
@Repository
public class UserMapperDao {

    @Autowired
    UserCustomerMapper userCustomerMapper;

    @Autowired
    UserMapper userMapper;

    /**
     * 通过自定义的mapper查询数据
     * @param id
     * @return
     */
    public User selectUserByCustomer(String id){
        return userCustomerMapper.selectAllUser(id);
    }

    /**
     * 通过自带的mapper查询数据
     * @param id
     * @return
     */
    public User getUserById(String id){
        return userMapper.selectByPrimaryKey(id);
    }

}
