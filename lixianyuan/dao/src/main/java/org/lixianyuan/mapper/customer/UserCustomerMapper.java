package org.lixianyuan.mapper.customer;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.lixianyuan.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @Aauthor xianyuan_li@qq.com
 * @Date: Create in 12:01 2019/4/25
 * @Description:
 */
@Repository
public interface UserCustomerMapper {
    /**
     * 根据id查询
     * @param id 主键id
     * @return 返回查询的结果
     */
    User selectAllUser(@Param("id") String id);

    /**
     * 新增用户
     * @param user 新增的用户
     * @return 新增结果
     */
    Object insertUser(User user);
}
