package com.fauchard.ssmexperimentsmybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.fauchard.ssmexperimentsmybatisplus.dao")
public class SsmExperimentsMybatisPlusApplication {

    public static void main(String[] args) {
        SpringApplication.run(SsmExperimentsMybatisPlusApplication.class, args);
    }

}
