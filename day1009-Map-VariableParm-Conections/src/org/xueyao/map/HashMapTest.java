package org.xueyao.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Yao Xue
 * @date Jul 29, 2017 10:22:01 AM
 */
public class HashMapTest {
    public static void main(String[] args) {
        
        //1.创建hashmap集合对象 
        
        Map<Student,String> map = new HashMap<Student, String>();
        
        //2.添加元素
        map.put(new Student("lisi",28),"上海");
        map.put(new Student("wangwu",22),"北京");
        map.put(new Student("zhaoliu",24),"成都");
        map.put(new Student("zhouqi",25),"广州");
        map.put(new Student("wangwu",22),"南京");
        
        //3.取出元素.键找值方式 
        Set<Student> keySet = map.keySet();
        
        for (Student key : keySet) {
            String value = map.get(key);
            System.out.println(key.toString()+"...."+value);
        }
        
        //取出元素.键值对方式
        Set<Map.Entry<Student,String>> entrySet = map.entrySet();
        
        for (Map.Entry<Student, String> entry: entrySet) {
            Student key = entry.getKey();
            
            String value = entry.getValue();
            
            System.out.println(key.toString()+"..."+value);
        }
    }
}
