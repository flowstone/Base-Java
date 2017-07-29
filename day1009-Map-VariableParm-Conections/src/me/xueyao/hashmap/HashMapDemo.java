package me.xueyao.hashmap;

import java.util.HashMap;

import me.xueyao.bean.Person;

/**
 * @author Yao Xue
 * @date Jul 29, 2017 4:05:56 PM
 */
public class HashMapDemo {
    public static void main(String[] args) {
        //method();
        method2();
    }

    private static void method2() {
        HashMap<Person, String> hm = new HashMap<Person, String>();
        hm.put(new Person("a",18),"1");
        hm.put(new Person("a",18),"2");
        hm.put(new Person("a",18),"3");
        hm.put(new Person("a",18),"4");
        
        System.out.println(hm);
    }

    private static void method() {
        HashMap<String, Person> hashMap = new HashMap<String,Person>();
        hashMap.put("usa", new Person("老贾",45));
        hashMap.put("hk", new Person("鹏鹏",18));
        hashMap.put("japan",new Person("苍老师",20));
        hashMap.put("north korea",new Person("老锁",38));
        
        hashMap.put(null,null);
        System.out.println(hashMap);
        
        
        
    }
}
