package org.lixianyuan.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("org.lixianyuan.mapper")//@MapperScan("包名")  自动装配指定包下所有Mapper, 省得在每个Mappe接口上写 @Mapper。也叫开启Mapper扫描
@SpringBootApplication(scanBasePackages = "org.lixianyuan")
public class WebApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }

}
