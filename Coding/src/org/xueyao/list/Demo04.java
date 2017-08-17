package org.xueyao.list;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author Yao Xue
 * @date Aug 14, 2017 8:32:36 PM
 */
public class Demo04 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("小明", 21);
        map.put("小华", 22);
        map.put("小丽", 23);
        map.put("小欣", 24);
        map.put("小芳", 25);
        
        System.out.println(map);
       /* Set<String> keySet = map.keySet();
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            Object key = it.next();
            Integer value = map.get(key);
            System.out.println(key+"---"+value);
        }*/
        
        /*
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            Object key = it.next();
            Integer value = map.get(key);
            System.out.println(key+"-----"+value);
        }
        */
        /*
        Set<Entry<String,Integer>> entry = map.entrySet();
        Iterator<Entry<String,Integer>> it = entry.iterator();
        while (it.hasNext()) {
            Entry<String,Integer> next = it.next();
            String key = next.getKey();
            Integer value = next.getValue();
            System.out.println(key+"----"+value);
        }
        */
        
        Iterator<Entry<String,Integer>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Entry<String,Integer> entry = it.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+"---"+value);
        }
    }
}
