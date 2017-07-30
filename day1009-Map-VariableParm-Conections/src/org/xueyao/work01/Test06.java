package org.xueyao.work01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 每位学生（姓名，年龄）都有自己的家庭住址。
 * 那么，既然有对应关系，则将学生对象和家庭住址存储到map集合中。学生作为键, 家庭住址作为值, 并使用keySet和entrySet方式遍历Map集合.
 * 注意，学生姓名相同并且年龄相同视为同一名学生
 * @author Yao Xue
 * @date Jul 30, 2017 1:08:08 AM
 */
public class Test06 {
    public static void main(String[] args) {
        Map<Student,String> map = new HashMap<Student,String>();
        map.put(new Student("李逍遥",20),"余杭镇");
        map.put(new Student("赵灵儿",18),"仙灵岛");
        map.put(new Student("林月如",19),"苏州");
        map.put(new Student("林月如",19),"浪迹天涯");
        
        Set<Student> keySet = map.keySet();
        Iterator<Student> it = keySet.iterator();
        while (it.hasNext()) {
            Student key = it.next();
            String value = map.get(key);
            System.out.println("姓名:"+key.getName()+",年龄:"+key.getAge()+"家庭地址:"+value);
        }
        System.out.println("----------------------");
        
        Set<Entry<Student,String>> entrySet = map.entrySet();
        Iterator<Entry<Student,String>> it2 = entrySet.iterator();
        while (it2.hasNext()) {
            Entry<Student,String> next = it2.next();
            Student key = next.getKey();
            String value = next.getValue();
            System.out.println("姓名:"+key.getName()+",年龄:"+key.getAge()+",家庭地址:"+value);
        }
        
    }
}
