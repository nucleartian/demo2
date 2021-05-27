package com.example.demo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 * Created by xitian on 2019/4/8.
 */
@Configuration
@MapperScan("com.example.demo.mbg.mapper")
public class MyBatisConfig {
}