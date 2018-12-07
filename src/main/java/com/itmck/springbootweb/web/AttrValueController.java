package com.itmck.springbootweb.web;

import com.itmck.springbootweb.configcommon.TestBean;
import com.itmck.springbootweb.pojo.Person;
import com.itmck.springbootweb.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Create by it_mck 2018/12/7 9:29
 *
 * @Description:
 * @Version: 1.0
 */
@Controller
@RequestMapping("attr")
public class AttrValueController {

    @Autowired
    private Student student;
    @Autowired
    private Person person;
    @Autowired
    private TestBean testBean;

    @ResponseBody
    @RequestMapping("v")
    public Map<String,Object> getAttr(){
        Map<String,Object> map = new HashMap<>();
        map.put("name",student.getName());
        map.put("age",student.getAge());
        return map;

    }
    @ResponseBody
    @RequestMapping("a")
    public Map<String,Object> getAttr2(){
        Map<String,Object> map = new HashMap<>();
        map.put("name",person.getName());
        map.put("age",person.getAge());
        return map;

    }

    /**
     * 测试 使用@Configuration与 @Bean进行注入 =====xml方式
     */
    @RequestMapping("c")
    public void run(){
        testBean.sayHello();
    }

}
