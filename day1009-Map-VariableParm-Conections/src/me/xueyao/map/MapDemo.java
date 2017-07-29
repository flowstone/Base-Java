package me.xueyao.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Yao Xue
 * @date Jul 29, 2017 3:06:50 PM
 */
public class MapDemo {
    public static void main(String[] args) {
        //put();
        //get();
        keySet();
    }

    private static void keySet() {
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        map.put("c",5);
        map.put("d",4);
        //keySet方法是将map集合中的键存到一个set集合中,并返回
        Set<String> keySet = map.keySet();
        
        Collection<Integer> values = map.values();
        System.out.println(keySet);
        System.out.println(values);
        
        int size = map.size();
        System.out.println(size);
    }

    private static void get() {
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        map.put("c",5);
        map.put("d",4);
        //通过键取值 键是唯一的,但是值不一定
        Integer integer = map.get("d");
        //通过键,移除键值
        Integer remove = map.remove("a");
        System.out.println(remove);
        System.out.println(integer);
        System.out.println(map);
        
    }

    private static void put() {
        // TODO Auto-generated method stub
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        map.put("c",5);
        map.put("d",4);
        
        System.out.println(map);
    }
}
