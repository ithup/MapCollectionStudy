package com.ithuplion.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import static java.util.Map.Entry;

/**
 * HashMap存储自定义类型键值
 * 当给HashMap中存放自定义对象时，如果自定义对象作为key存在，这时要保证对象唯一，
 * 必须复写对象的hashCode和equals方法(如果忘记，请回顾HashSet存放自定义对象)。
 * 如果要保证map中存放的key和取出的顺序一致，可以使用LinkedHashMap集合来存放。
 */
public class MapDemo01 {
    public static void main(String[] args){
        //创建一个HashMap集合对象
        Map<Student,String> map=new HashMap<>();
        //添加元素
        map.put(new Student("郭靖",22),"牛家村");
        map.put(new Student("黄蓉",18),"桃花岛");
        map.put(new Student("杨过",12),"古墓");
        map.put(new Student("小龙女",20),"古墓");
        //取出元素，根据键取值
        // Set<Student> students = map.keySet();
        //使用迭代器遍历数据
        /*Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()){
            //取出键学生对象
            Student student = iterator.next();
            //根据学生对象键取值
            String value = map.get(student);
            System.out.println(student+"家庭住址："+value);
        }*/
        //使用增强for循环遍历数据
        /*for(Student student:students){
            //System.out.println(student);
            String value = map.get(student);
            System.out.println(student+" 家庭住址："+value);
        }*/
        //静态导入:import static java.util.Map.Entry;
        Set<Entry<Student, String>> entries = map.entrySet();
        for(Entry<Student,String> entry:entries){
            System.out.println(entry.getKey()+"家庭住址："+entry.getValue());
        }
    }
}
