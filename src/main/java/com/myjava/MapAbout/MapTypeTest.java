package com.myjava.MapAbout;

import java.util.*;

public class MapTypeTest {
    public static void main(String...args){
        Map<String, String> map = new HashMap<String, String>();
        map.put("key1", "value1");
        map.put("key2", "value2");

        for (String key : map.keySet()) {
            System.out.println(key + " ：" + map.get(key));
        }//四种迭代方式

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " ：" + entry.getValue());
        }

        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key + "　：" + map.get(key));
        }


        Iterator<Map.Entry<String, String>> iterator1 = map.entrySet().iterator();
        while (iterator1.hasNext()) {
            Map.Entry<String, String> entry = iterator1.next();
            System.out.println(entry.getKey() + "　：" + entry.getValue());
        }


        //Hashmap hashtable LinkedMap排序方法
        Map<String, String> map1 = new HashMap<String, String>();
        map1.put("a", "c");
        map1.put("b", "b");
        map1.put("c", "a");

// 通过ArrayList构造函数把map.entrySet()转换成list
        List<Map.Entry<String, String>> list = new ArrayList<Map.Entry<String, String>>(map1.entrySet());
// 通过比较器实现比较排序
        Collections.sort(list, new Comparator<Map.Entry<String, String>>() {//Comparator比较器，重写compare方法
            public int compare(Map.Entry<String, String> mapping1, Map.Entry<String, String> mapping2) {
                return mapping1.getValue().compareTo(mapping2.getValue());//升续就1比2，降序就2比1
            }
        });

        for (Map.Entry<String, String> mapping : list) {
            System.out.println(mapping.getKey() + " ：" + mapping.getValue());
        }

        //Tree自动排序从升改成降
        Map<String, String> map3 = new TreeMap<String, String>(new Comparator<String>() {
            public int compare(String obj1, String obj2) {
                return obj2.compareTo(obj1);// 降序排序
            }
        });
        map3.put("a", "c");
        map3.put("b", "b");
        map3.put("c", "a");

        for (String key : map3.keySet()) {
            System.out.println(key + " ：" + map3.get(key));


    }
}}
