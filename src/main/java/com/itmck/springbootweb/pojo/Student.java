package com.itmck.springbootweb.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Create by it_mck 2018/12/7 9:30
 *
 * @Description: 测试 @value()
 * @Version: 1.0
 */
@Component //将bean交给spring管理
public class Student {

    @Value("${student.name}")
    private String name;
    @Value("${student.age}")
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
