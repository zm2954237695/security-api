package com.guo.security;


import com.guo.security.config.RsaKeyProperties;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
@MapperScan("com.guo.security.mapper")
@EnableConfigurationProperties(RsaKeyProperties.class)  //将配置类放入Spring容器中
public class ExcelApplication {


    public static void main(String[] args) {
        SpringApplication.run(ExcelApplication.class, args);
    }

}
