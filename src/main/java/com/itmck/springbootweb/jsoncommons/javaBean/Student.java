package com.itmck.springbootweb.jsoncommons.javaBean;

import java.util.List;

/**
 * Create by it_mck 2018/12/6 19:56
 *
 * @Description:
 * @Version: 1.0
 */
public class Student {

    private String name;
    private int age;
    private List<Teacher> teachers;

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", teachers=" + teachers +
                '}';
    }
}
