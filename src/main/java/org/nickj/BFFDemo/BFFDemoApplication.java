package org.nickj.BFFDemo;

import org.mybatis.spring.annotation.MapperScan;
import org.nickj.BFFDemo.plugins.IaaSCreateValidatePlugin;
import org.nickj.BFFDemo.plugins.IaaSCreateValidatePluginImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.plugin.core.config.EnablePluginRegistries;

@SpringBootApplication
@MapperScan("org.nickj.BFFDemo.mapper")
public class BFFDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(BFFDemoApplication.class, args);
    }
}
