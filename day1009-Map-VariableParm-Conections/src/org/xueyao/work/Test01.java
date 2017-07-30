package org.xueyao.work;

import java.util.HashMap;
import java.util.Map;

/**
 * 练习Map集合的常用方法: put, get, remove
 * @author Yao Xue
 * @date Jul 29, 2017 10:55:11 PM
 */
public class Test01 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("小明",23);
        map.put("小芳",18);
        map.put("小华",20);
        map.put("小丽",21);
        System.out.println(map);
        map.put("小丽",100);
        System.out.println(map);
        
        Integer value = map.get("小丽");
        System.out.println(value);
        
        Integer remove = map.remove("小华");
        System.out.println(remove);
        
        System.out.println(map);
    }
}
