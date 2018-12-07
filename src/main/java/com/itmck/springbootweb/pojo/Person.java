package com.itmck.springbootweb.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Create by it_mck 2018/12/7 14:03
 *
 * @Description:
 * @Version: 1.0
 */
@Component
//@PropertySource(value = "classpath:application.yml")//指定要读取配置文件位置
@ConfigurationProperties(prefix = "person")
public class Person {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
