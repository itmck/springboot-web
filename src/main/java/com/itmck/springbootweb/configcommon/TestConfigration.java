package com.itmck.springbootweb.configcommon;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Create by it_mck 2018/12/7 14:37
 *
 * @Description: 使用注解的方式注册bean,将创建对象权利对象交给spring管理 类似于xml方式
 * @Version: 1.0
 */
@Configuration //相当于<beans></beans>
public class TestConfigration {

    public TestConfigration(){

        System.out.println("初始化configration");
    }

    @Bean //相当于 <bean></bean>
    public TestBean getBean(){
        return new TestBean();
    }
}
