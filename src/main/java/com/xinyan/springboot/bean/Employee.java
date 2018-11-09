package com.xinyan.springboot.bean;

import org.hibernate.validator.constraints.Range;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @ConfigurationProperties
 *   作用：读取全局配置文件中的属性，绑定到java对象中
 *
 * @Value 读取全局配置文件中的单个属性值来进行绑定
 *   使用 spEL （spring 表达式语言） 来取值
 *
 * @Validated
 *   作用：为属性赋值时，进行校验（JSR303）
 */
@ConfigurationProperties(prefix = "employee")
//@PropertySource(value = {"classpath:config/employee.properties"})
@Component
//@Validated
public class Employee {


//    @Value("${employee.last-name}")
    private String lastName;

//    @Range(min = 18, max = 30)
    private Integer age;
    private boolean boss;
    private Date birthday;

    private Address address;

    private Map<String, Object> map;
    private List<String> list;

    @Override
    public String toString() {
        return "Employee{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", birthday=" + birthday +
                ", address=" + address +
                ", map=" + map +
                ", list=" + list +
                '}';
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public boolean isBoss() {
        return boss;
    }

    public void setBoss(boolean boss) {
        this.boss = boss;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
}
