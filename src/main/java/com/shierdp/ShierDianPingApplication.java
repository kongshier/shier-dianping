package com.shierdp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.shierdp.mapper")
@SpringBootApplication
public class ShierDianPingApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShierDianPingApplication.class, args);
    }

}
