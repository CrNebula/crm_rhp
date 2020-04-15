package com.rhp.crm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.rhp.crm.mapper")
@SpringBootApplication
public class CrmRhpApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrmRhpApplication.class, args);
    }

}
