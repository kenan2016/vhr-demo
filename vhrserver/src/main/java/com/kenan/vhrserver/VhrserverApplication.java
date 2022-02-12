package com.kenan.vhrserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages="com.kenan.vhrserver.mapper")
public class VhrserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(VhrserverApplication.class, args);
    }

}
