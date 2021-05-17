package com.example.mybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//扫描mapper
@MapperScan("com.example.mybatisplus.mapper")
@SpringBootApplication

/**
 * 官方文档
 * https://mp.baomidou.com/guide/
 * */
public class MybatisplusApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisplusApplication.class, args);
    }

}
