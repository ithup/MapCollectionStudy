package com.ithuplion.map;

/**
 * Created by acer on 2017/7/18.
 */
public class Student {
    private String name;//学生姓名
    private int age;//学生年龄
    public Student(){}
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "姓名:"+name+"年龄："+age;
    }
}
