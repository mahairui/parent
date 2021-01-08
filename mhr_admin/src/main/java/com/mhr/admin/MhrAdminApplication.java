package com.mhr.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName MhrAdminApplication
 * Description TODO
 * @Author MaHaiRui
 * @Date 2020-06-06-13:54
 * Version 1.0
 */
@SpringBootApplication
@MapperScan("com.mhr.mapper.*")
public class MhrAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(MhrAdminApplication.class, args);
    }

}
