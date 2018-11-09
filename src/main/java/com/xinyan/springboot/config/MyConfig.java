package com.xinyan.springboot.config;

import com.xinyan.springboot.bean.Address;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration 标注为一个配置类
 */
@Configuration
public class MyConfig {

    /**
     * @Bean
     *   作用：将一个 组件(Java对象)纳入到 Spring IOC 容器中管理
     *      默认方法名即为 bean 在 IOC 容器中 的名字
     *      通过 name 属性可以更改 bean 的名字
     * @return
     */
    @Bean
    public Address address(){
        return  new Address();
    }
}
