package org.xueyao.code;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import me.xueyao.bean.Person;

/**
 *  1. HashMap特点
        1. Map接口实现类HashMap,底层数据结构,哈希表(数组和链表)
        2. 无序的集合,存储到HashMap集合中的键对象(不重复),自定义类型必须重写方法hashCode,equals
        3. 线程不安全集合,运行速度快
        4. 允许存储null值,null键
          
        5. 案例:HashMap存储自定义对象
            1. HashMap存储自定义对象,作为值使用
            2. HashMap存储自定义对象,作为键使用
 * @author Yao Xue
 * @date Jul 29, 2017 9:11:17 PM
 */
public class HashMapDemo {
    public static void main(String[] args) {
        //method2();
        method();
    }
    //HashMap存储自定义对象 ,作为键使用
    private static void method2() {
        HashMap<Person, String> hm = new HashMap<Person, String>();
        hm.put(new Person("a",18),"星期一");
        hm.put(new Person("b",19),"星期二");
        hm.put(new Person("c",20),"星期三");
        
        System.out.println(hm);
        Set<Person> keySet = hm.keySet();
        Iterator<Person> it = keySet.iterator();
        while (it.hasNext()) {
            Person key = it.next();
            String value = hm.get(key); 
            System.out.println(key+":"+value);
        }
    }
    
    //HashMap存储自定义对象 ,作为值使用
    public static void method() {
        HashMap<String,Person> hm = new HashMap<String, Person>();
        hm.put("123",new Person("小明",5));
        hm.put("345",new Person("大明",7));
        hm.put("567",new Person("中明",8));
        System.out.println(hm);
        
        Set<Entry<String,Person>> entrySet = hm.entrySet();
        /*Iterator<Entry<String, Person>> it = entrySet.iterator();
        while (it.hasNext()) {
            Entry<String,Person> Person = it.next();
            System.out.println(Person.getKey()+":"+Person.getValue());
        }*/
        
        for (Entry<String, Person> entry : entrySet) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
