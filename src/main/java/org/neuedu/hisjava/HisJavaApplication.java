package org.neuedu.hisjava;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "org.neuedu.hisjava.mapper")
public class HisJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(HisJavaApplication.class, args);
    }

}
