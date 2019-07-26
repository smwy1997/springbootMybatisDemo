package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@MapperScan("com.sm.mapper") //扫描的mapper
public class Application {



    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

    }
}
