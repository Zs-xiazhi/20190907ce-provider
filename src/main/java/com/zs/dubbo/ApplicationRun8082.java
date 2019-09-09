package com.zs.dubbo;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Company
 * @Author Zs
 * @Date Create in 2019/9/7
 **/
@SpringBootApplication
@MapperScan("com.zs.dubbo.mapper")
@EnableDubbo
public class ApplicationRun8082 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun8082.class, args);
    }
}
