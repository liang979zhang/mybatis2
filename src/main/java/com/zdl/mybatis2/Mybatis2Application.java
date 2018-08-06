package com.zdl.mybatis2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.zdl.mybatis2.mapper")
@SpringBootApplication
public class Mybatis2Application {

    public static void main(String[] args) {
        SpringApplication.run(Mybatis2Application.class, args);
    }
}
