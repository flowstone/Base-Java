package org.xueyao.code;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 7. size:获取map集合的大小
    3. Map遍历方式
        1. 第一种：键找值, keySet方式(纵向,单列集合,从一个单列取另一个单列)
            1. Map集合的方法keySet,所有的键存储到Set集合中
            2. 迭代器遍历Set集合
            3. 遍历过程中取出Set集合的元素,就是Map中的键
            4. Map集合的方法get,通过键获取到值
        2. 第二种：通过键值对，entrySet方式
            1. 内部接口
                1. 定义在接口内部的接口
                2. 实现类,可以直接实现外部接口,无需同时实现内部接口
                3. 实现类,可以直接实现内部接口(外接口名.内接口)
                4. 实现类也可同时实现外部和内部接口

        2. entrySet遍历(横向,对应关系)
            1. Map集合方法entrySet(),取出键值对的对应关系对象 (Entry接口实现类对象)存储到Set集合
            2. 迭代器遍历Set集合
            3. 遍历Set中,取出的是Entry接口实现类的对象
            4. 通过实现类对象,调用方法 getKey,getValue获取键值对
        3. 增强for循环遍历
            1. 不能直接遍历，但是可以间接遍历
 * @author Yao Xue
 * @date Jul 29, 2017 8:21:39 PM
 */
public class LoopDemo {
    public static void main(String[] args) {
       // entrySet();
        keySet();
    }
    
    public static void keySet() {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("大明",5);
        map.put("小明",6);
        map.put("中明",7);
        
        Set<String> keySet = map.keySet();
        Iterator<String> it = keySet.iterator();
        /*while (it.hasNext()) {
            String key = it.next();
            Integer value = map.get(key);
            System.out.println(key+":"+value);
        }*/
        for (String key : keySet) {
            Integer value = map.get(key);
            System.out.println(key+":"+value);
        }
    }
    public static void entrySet() {
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("小明", 18);
        map.put("大明", 20);
        map.put("老明", 21);
        //取出map中的对应关系entry集合
        //Entry<String, Integer>本身是set的泛型
        Set<Entry<String,Integer>> entrySet = map.entrySet();
        //遍历entrySet集合取出key和value
        Iterator<Entry<String,Integer>> it = entrySet.iterator();
        
        
        while (it.hasNext()) {
            //遍历获取entry
            Entry<String, Integer> entry = it.next();
            //通过对应关系,就可以获取key和value
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+":"+value);
        }
    }
}
