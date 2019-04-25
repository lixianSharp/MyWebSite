package org.lixianyuan.config;

import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Aauthor xianyuan_li@qq.com
 * @Date: Create in 17:50 2019/4/25
 * @Description: MyBatis的注解 版本相关配置类
 */
@Configuration //这个注解表示当前类是一个配置类。类似于xml配置文件
public class MyBatisConfig {

    @Bean
    public ConfigurationCustomizer configurationCustomizer(){
//        ConfigurationCustomizer configurationCustomizer = new ConfigurationCustomizer() {
//            @Override
//            public void customize(org.apache.ibatis.session.Configuration configuration) {
//                //开启驼峰命名方式
//                configuration.setMapUnderscoreToCamelCase(true);
//            }
//        };

        // 将注释掉的代码用Lambda表达式替换
        ConfigurationCustomizer configurationCustomizer = configuration -> configuration.setMapUnderscoreToCamelCase(true);
        return configurationCustomizer;
    }
}
