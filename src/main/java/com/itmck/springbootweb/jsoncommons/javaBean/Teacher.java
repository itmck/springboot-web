package com.itmck.springbootweb.jsoncommons.javaBean;

/**
 * Create by it_mck 2018/12/6 20:36
 *
 * @Description:
 * @Version: 1.0
 */
public class Teacher {

    private String name;

    private int age;

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
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
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
