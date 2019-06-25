package org.lixianyuan.web.util;

import java.util.UUID;

/**
 * @Aauthor xianyuan_li@qq.com
 * @Date: Create in 15:36 2019/5/8
 * @Description:
 */
public class UUIDUtil {
    /**
     * 返回uuid，长度为36
     * @return  字符串类型的UUID
     */
    public static String getUUID() {
        return UUID.randomUUID().toString();
    }
}
