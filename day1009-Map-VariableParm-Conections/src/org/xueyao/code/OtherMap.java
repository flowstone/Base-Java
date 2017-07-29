package org.xueyao.code;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 2. LinkedHashMap
        1.  底层结构哈希表,双向链表
        2.  元素有序
        3. LRU(least recently ) 算法  最近最少使用原则
    3. HashTable   table(制表符 TAB)
         1. 开始于JDK1.0,从1.2开始实现Map接口 
         2. 底层数据结构哈希表
         3. 线程安全的集合,不允许存储null值,null键
         4. 效率低,被更先进的HashMap取代
         
         5. 但是Hashtable有个子类 Properties(重要),Properties可以和IO流对象(内存中)结合使用,实现数据的持久存储
            1. 数据持久化->本地化(存储到硬盘)
            2. 数据 : 缓存(小图 - 点击变大图(下载)->保存->持久化)
 * @author Yao Xue
 * @date Jul 29, 2017 9:30:33 PM
 */
public class OtherMap {
    public static void main(String[] args) {
        //method2();
        method();
    }

    private static void method() {
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<String,Integer>();
        lhm.put("a",1);
        lhm.put("b",2);
        lhm.put("c",3);
        lhm.put("d",4);
        /*
        Set<String> keySet = lhm.keySet();
        for (String key : keySet) {
            Integer value = lhm.get(key);
            System.out.println(key+":"+value);
        }*/
        
        Set<Entry<String,Integer>> entrySet =lhm.entrySet();
        Iterator<Entry<String,Integer>> it = entrySet.iterator();
        while (it.hasNext()) {
            Entry<String,Integer> next = it.next();
            System.out.println(next.getKey()+":"+next.getValue());
        }
    }

    private static void method2() {
        Hashtable<String, Integer> ht = new Hashtable<String, Integer>();
        //java.lang.NullPointerException 不允许null值null键
        ht.put("",null);
        System.out.println(ht);
        ht.put(null,1);
        System.out.println(ht);
    }
}
