package org.xueyao.work;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 往一个Map集合中添加若干元素.获取Map中的所有value, 
 * 并使用增强for和迭代器遍历输出每个value
 * @author Yao Xue
 * @date Jul 29, 2017 11:35:22 PM
 */
public class Test02 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        
        map.put("小明",24);
        map.put("大明",25);
        map.put("中明",23);
        
        Integer value1 = map.get("小明");
        Integer value2 = map.get("大明");
        Integer value3 = map.get("中明");
        
        System.out.println(value1+"---"+value2+"----"+value3);
        
        Set<String> keySet = map.keySet();
        Iterator<String> it = keySet.iterator();
        while (it.hasNext()) {
            String key = it.next();
            Integer value = map.get(key);
            System.out.println(key+":"+value);
        }
        
        Set<Entry<String,Integer>> entrySet = map.entrySet();
        Iterator<Entry<String, Integer>> it2 = entrySet.iterator();
        while (it2.hasNext()) {
            Entry<String,Integer> next = it2.next();
            String key = next.getKey();
            Integer value = next.getValue();
            System.out.println(key+":"+value);
            
        }
        
    }
}
