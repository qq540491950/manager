package com.lirt.manager;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@MapperScan(value = "com.lirt.manager.mapper")
@SpringBootApplication
@EnableSwagger2
//@EnableCaching
public class MangerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MangerApplication.class, args);
    }

}
