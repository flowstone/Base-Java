package org.xueyao.code;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 一. Map集合
    1. Map的特点(不是Collection的子类)
        1. Collection是单列集合
        2. Map是 双列集合
            1. Key，Value 键值对，每个键映射一个值
            2. Map中，Key不能重复,要保证唯一性
            3. Entry接口对象：键值对的对应关系
            4. 遍历方式
                1. 通过Key找Value
                2. 通过Entry键值对
    2. Map中的方法
        1. Map<K,V> <泛型>： K 表示作为键的类型,V表示值的类型
        2. put: 存储键值对
            1. 键值对存储到集合中 V put (K,V)
            2. 如果存储了相同的键,覆盖原有的值
            3. 返回值：一般返回null,如果存储了重复的键,返回被覆盖之前的值
        3. get：通过键，取出键对应的值
            1. V get(K),传递键,返回对应的值
            2. 如果集合中没有这个键,返回null    
         4. remove：移除键值对
            1. V remove(K),传递键,移除这个键值对
            2. 返回值:移除之前的值（无此键，则返回null）
         5. keySet: 将集合中所有的键,存储到Set集合中
         6. values: 将集合中的所有的值,存储到Collection集合中
         7. size:获取map集合的大小
 * @author Yao Xue
 * @date Jul 29, 2017 8:10:04 PM
 */
public class MapDemo {
    public static void main(String[] args) {
        //put();
        //get();
        
        //remove();
        keySet();
    }
    /**
     * keySet: 将集合中所有的键,存储到Set集合中
     * values: 将集合中的所有的值,存储到Collection集合中
     */
    public static void keySet() {
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("小明",5);
        map.put("大明",6);
        //keySet方法是将map集合中的键存到一个set集合中(键值不重复),返回
        Set<String> keySet = map.keySet();
        System.out.println(keySet);
        //将集合中的所有值,存储到Collection集合中(允许重复)
        Collection<Integer> values = map.values();
        System.out.println(values);
        
        int size = map.size();
        System.out.println(size);
    }
    /**
     * remove : 移除键值对
     *      V remove(K),传递键,移除这个键值对
     *      返回值:移除之前的值(无此键,则返回null)
     */
    public static void remove() {
        Map<String,Integer> map = new HashMap<String, Integer>();
        map.put("小明",2);
        map.put("李明",3);
        map.put("李刚",4);
        
        System.out.println(map);
        //返回值是被移除的值
        Integer remove = map.remove("李刚");
        System.out.println(remove);
        
        Integer remove2 = map.remove("大明");
        System.out.println(remove2);
        
        System.out.println(map);
    }
    /**
     * get :通过键,取出键对应的值
     *      1.V get(K),传递键,返回对应的值
     *      2.如果集合中没有这个键,返回null
     *      
     */
    public static void get() {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("小明",14);
        map.put("小李",15);
        map.put("小陆",16);
        map.put("小七",17);
        System.out.println(map);
        //通过键取值  键是唯一的,但是值不一定
        Integer name  = map.get("小明");
        System.out.println(name);
        Integer name2 = map.get("小七");
        System.out.println(name2);
    }
    /**
     * put: 存储键值对
     *      1.键值对存储到集合中V put(K,V);
     *      2.如果存储了相同的键,覆盖原有的值
     *      3.返回值: 一般返回null,如果存储了重复的键,返回覆盖之前的值
     */
    public static void put() {
        //Map<K,V> 泛型<键的类型,值的类型>
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("a", 1);
        map.put("b", 2);
        //put返回值是上一个被覆盖掉的值,如果没有键,则返回null
        Integer put = map.put("c", 3);
        System.out.println(put);
        //put2的返回值 是上一个被覆盖掉的值
        Integer put2 = map.put("c", 5);
        System.out.println(put2);
        System.out.println(map);
    }
}
