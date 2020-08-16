package com.lsl.gmall;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 *  1、导入依赖
 *    1）、导入dubbo-starter
 *    2）、导入dubbo其他依赖
 */
@SpringBootApplication
@EnableDubbo
public class BootUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootUserServiceApplication.class, args);
    }
}
