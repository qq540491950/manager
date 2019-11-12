package com.lirt.manager;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@MapperScan(value = "com.lirt.manager.mapper")
@SpringBootApplication
@EnableSwagger2
public class MangerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MangerApplication.class, args);
    }

}
