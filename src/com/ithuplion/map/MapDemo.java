package com.ithuplion.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * map接口中的常用方法使用
 * put方法：将指定的键与值对应起来，并添加到集合中
 * 方法返回值为键所对应的值
 * 使用put方法时，若指定的键(key)在集合中没有，则没有这个键对应的值，返回null，并把指定的键值添加到集合中；
 * 使用put方法时，若指定的键(key)在集合中存在，则返回值为集合中键对应的值（该值为替换前的值），
 * 并把指定键所对应的值，替换成指定的新值。
 * get方法：获取指定键(key)所对应的值(value)
 * remove方法：根据指定的键(key)删除元素，返回被删除元素的值(value)。
 * 注意：Map集合不能直接使用迭代器或者foreach进行遍历。但是转成Set之后就可以使用了。
 */
public class MapDemo {
    public static void main(String args[]) {
        //创建map对象
        Map<String, String> map = new HashMap<String, String>();
        //向map中添加元素
//        map.put("一", "one");
//        map.put("二", "two");
//        map.put("三", "three");
        map.put("邓超", "孙俪");
        map.put("李晨", "范冰冰");
        map.put("刘德华", "柳岩");
//        System.out.println(map);
//        //根据key来取值
//        System.out.println(map.get("一"));
//        //返回此映射中的键-值映射关系数。
//        System.out.println(map.size());
        System.out.println("-------------------------------------------");
        //map集合的遍历
        /*
            1.获取Map集合中所有的键，由于键是唯一的，所以返回一个Set集合存储所有的键
            2.遍历键的Set集合，得到每一个键
            3.根据键，获取键所对应的值
         */
        //1.获取Map集合中所有的键，由于键是唯一的，所以返回一个Set集合存储所有的键
        Set<String> key = map.keySet();//set集合是一个无序元素唯一的集合
        //2.遍历键的Set集合，得到每一个键
//        for (String keys:key) {
//            //System.out.println(keys);
//            //3.根据键，获取键所对应的值
//            String values = map.get(keys);
//            //System.out.println(values);
//            System.out.println(keys+":"+values);
//        }
//        Iterator<String> iterator = key.iterator();
//        while (iterator.hasNext()){
//            //得到每一个key
//           // System.out.println(iterator.next());
//            //根据key获取对应的value
//            String keys=iterator.next();
//            System.out.println(keys+":"+map.get(keys));
//        }
        //Entry键值对对象
        //1.获取Map集合中，所有的键值对(Entry)对象，以Set集合形式返回。
        Set<Map.Entry<String, String>> entries = map.entrySet();
        //2.遍历包含键值对(Entry)对象的Set集合，得到每一个键值对(Entry)对象
//        for(Map.Entry<String,String> entry:entries){
//            //3.通过键值对(Entry)对象，获取Entry对象中的键与值。
//            String key1 = entry.getKey();
//            String value = entry.getValue();
//            System.out.println(key1+":"+value);
//        }
        //迭代器处理
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> entry = iterator.next();
            String key1 = entry.getKey();
            String value = entry.getValue();
            System.out.println(key1+":"+value);
        }
    }
}
