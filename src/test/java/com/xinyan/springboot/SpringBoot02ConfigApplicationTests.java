package com.xinyan.springboot;

import com.xinyan.springboot.bean.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Spring Boot 单元测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot02ConfigApplicationTests {

    @Autowired
    private Employee employee;

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void contextLoads() {
        System.out.println(employee);
    }

    @Test
    public void testBean(){
        boolean f = applicationContext.containsBean("address");
        System.out.println(f);
    }

}
