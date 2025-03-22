package org.nickj.BFFDemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.nickj.BFFDemo.mapper")
public class BFFDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(BFFDemoApplication.class, args);
    }
}
