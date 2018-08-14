package com.auth.jwt.security.ajs.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.auth.jwt.security.ajs.server.mapper")
public class AjsServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AjsServerApplication.class, args);
    }
}
