package com.zy.reverseengineering;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.zy.reverseengineering.dao")
public class ReverseEngineeringApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReverseEngineeringApplication.class, args);
    }

}
