package org.lixianyuan.web.controller;

import org.lixianyuan.entity.User;
import org.lixianyuan.mapper.customer.UserCustomerMapper;
import org.lixianyuan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Aauthor xianyuan_li@qq.com
 * @Date: Create in 14:38 2019/4/25
 * @Description:
 */
@RestController
@RequestMapping("/hello")
public class CallBackController {
//    @Autowired
//    private UserCustomerMapper userMapper;

    @Autowired
    private UserService userService;
    @RequestMapping(value = "/hello")
    public User getUser() {
        User user = userService.selectUserByCustomer("1");
        System.out.println("通过自定义的mapper查询数据:" + user);

        User user2 = userService.getUserById("1");
        System.out.println("通过自带的mapper查询数据：" + user);
        return user;
    }

    @RequestMapping(value = "/test")
    public String test() {
        return "这是测试";
    }


}
