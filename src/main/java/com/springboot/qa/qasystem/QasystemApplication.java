package com.springboot.qa.qasystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

@MapperScan("com.springboot.qa.qasystem.dao")
public class QasystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(QasystemApplication.class, args);
    }

}
