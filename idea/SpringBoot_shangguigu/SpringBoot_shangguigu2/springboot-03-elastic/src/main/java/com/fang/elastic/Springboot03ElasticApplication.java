package com.fang.elastic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * springboot使用两种技术与ES交互
 * 1、Jest（默认不生效） 需要导入jest包
 * 2、springdata 里elasticsearch模块【有可能版本不合适】
 * 1）、升级springboot版本
 * 2）、安装对应的版本ES
 * spring data elasticsearch      elasticsearch
 * 3.0.0.RC2                       5.5.0
 * 3.0.0.M4                        5.4.0
 * 2.0.4.RELEASE                    2.4.0
 * 2.0.0.RELEASE                   2.2.0
 * 1.4.0.M1                        1.7.3
 * 1.3.0.RELEASE                   1.5.2
 * 1.2.0.RELEASE                   1.4.4
 * 1.1.0.RELEASE                   1.3.2
 * 1.0.0.RELEASE                   1.1.1
 * 两种用法：
 */
@SpringBootApplication
public class Springboot03ElasticApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot03ElasticApplication.class, args);
    }

}
