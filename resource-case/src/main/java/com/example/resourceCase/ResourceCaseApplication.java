package com.example.resourceCase;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author yongshuai
 */
@SpringBootApplication
@MapperScan("com.example.resourceCase.mapper")
public class ResourceCaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(ResourceCaseApplication.class, args);
    }

}
