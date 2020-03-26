package com.ivan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author Ivan
 * @Date 2020/3/26 11:14
 */
@SpringBootApplication
@MapperScan({"com.ivan.mapper","com.ivan.auto.mapper"})
public class MybatisPlusApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisPlusApplication.class, args);
    }

}
