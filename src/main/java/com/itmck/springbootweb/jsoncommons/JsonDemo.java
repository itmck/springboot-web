package com.itmck.springbootweb.jsoncommons;

import com.alibaba.fastjson.JSON;
import com.itmck.springbootweb.jsoncommons.javaBean.Student;
import com.itmck.springbootweb.jsoncommons.javaBean.Teacher;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by it_mck 2018/12/6 19:54
 *
 * fastjson使用
 *
 * @Description: json转javaBean  javaBean转json
 * @Version: 1.0
 * <p>
 * <p>
 * fastJson常用方法:
 * <p>
 * 1 public static final Object parse(String text); // 把JSON文本parse为JSONObject或者JSONArray
 * 2 public static final JSONObject parseObject(String text)； // 把JSON文本parse成JSONObject
 * 3 public static final T parseObject(String text, Class clazz); // 把JSON文本parse为JavaBean
 * 4 public static final JSONArray parseArray(String text); // 把JSON文本parse成JSONArray
 * 5 public static final List parseArray(String text, Class clazz); //把JSON文本parse成JavaBean集合
 * 6 public static final String toJSONString(Object object); // 将JavaBean序列化为JSON文本
 * 7 public static final String toJSONString(Object object, boolean prettyFormat); // 将JavaBean序列化为带格式的JSON文本
 * 8 public static final Object toJSON(Object javaObject); 将JavaBean转换为JSONObject或者JSONArray。
 */
public class JsonDemo {


    @Test
    public void run() {

        Student student1 = new Student();
        student1.setName("wxp");
        student1.setAge(20);
        ArrayList<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("xm", 30));
        teachers.add(new Teacher("zx", 40));
        student1.setTeachers(teachers);
        Object o = JSON.toJSON(student1);//
        System.out.println(o);

    }

    @Test
    public void run2() {

        String str = "{\"teachers\":[{\"name\":\"xm\",\"age\":30},{\"name\":\"zx\",\"age\":40}],\"name\":\"wxp\",\"age\":20}";
        Student student = JSON.parseObject(str, Student.class);
        System.out.println(student);
        List<Teacher> teachers = student.getTeachers();
        System.out.println(teachers);

    }

}
