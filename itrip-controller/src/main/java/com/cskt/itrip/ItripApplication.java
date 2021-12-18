package com.cskt.itrip;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Lenovo
 * @version 1.0
 * @date 2021/12/3 15:04
 */
@SpringBootApplication
@MapperScan("com.cskt.itrip.mapper")
public class ItripApplication {

    public static void main(String[] args) {
        SpringApplication.run(ItripApplication.class,args);
    }
}
