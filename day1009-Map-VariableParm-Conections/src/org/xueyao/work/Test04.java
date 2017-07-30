package org.xueyao.work;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Map集合中包含5对元素: "邓超"->"孙俪", "李晨"->"范冰冰", "刘德华"->"柳岩", “黄晓明”->” Baby”, “谢霆锋”->”张柏芝”.
 * 使用Entry方式迭代出Map集合中的元素
 * @author Yao Xue
 * @date Jul 30, 2017 12:40:56 AM
 */
public class Test04 {
     public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();
        map.put("邓超","孙俪");
        map.put("李晨","范冰冰");
        map.put("刘德华","柳岩");
        map.put("黄晓明","Baby");
        map.put("谢霆锋","张柏芝");
        
        Set<Entry<String,String>> entrySet = map.entrySet();
        Iterator<Entry<String,String>> it = entrySet.iterator();
        
        while (it.hasNext()) {
            Entry<String,String> next = it.next();
            String key = next.getKey();
            String value = next.getValue();
            System.out.println(key+"->"+value);
        }
        
        Set<String> keySet = map.keySet();
        Iterator<String> it2 = keySet.iterator();
        while (it2.hasNext()) {
            String key = it2.next();
            String value = map.get(key);
            System.out.println(key+"->"+value);
        }
    }
}
