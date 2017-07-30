package org.xueyao.work;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 每位学生（姓名，年龄）都有自己的家庭住址。
 * 那么，既然有对应关系，则将学生对象和家庭住址存储到Map集合中。
 * 家庭住址作为键, 学生作为值。并使用keySet和entrySet方式遍历Map集合
 * @author Yao Xue
 * @date Jul 30, 2017 12:49:06 AM
 */
public class Test05 {
    public static void main(String[] args) {
        Map<String,Student> map = new HashMap<String,Student>();
        map.put("江苏",new Student("小明",20));
        map.put("上海",new Student("小丽",18));
        map.put("安徽",new Student("小马",21));
        
        Set<String> keySet = map.keySet();
        Iterator<String> it = keySet.iterator();
        while (it.hasNext()) {
            String key = it.next();
            Student value = map.get(key);
            System.out.println("姓名："+value.getName()+",年龄是"+value.getAge()+",家庭住址："+key);
        }
        
        System.out.println("------------");
        Set<Entry<String,Student>> entrySet = map.entrySet();
        Iterator<Entry<String,Student>> it2 = entrySet.iterator();
        
        while (it2.hasNext()) {
            Entry<String,Student> next = it2.next();
            String key = next.getKey();
            Student value = next.getValue();
            System.out.println("姓名："+value.getName()+",年龄是"+value.getAge()+",家庭住址："+key);
            
        }
            
    }
}
