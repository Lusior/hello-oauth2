package com.example.oauth2case;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author yongshuai
 */
@SpringBootApplication
@MapperScan(basePackages = "com.example.oauth2case.mapper")
public class Oauth2CaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(Oauth2CaseApplication.class, args);
    }

}
