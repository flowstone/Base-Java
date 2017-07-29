package org.xueyao.code;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 四. 集合的嵌套
 * 1. List<E> : List<List<String>>
 * 2. List<Map<K,V>> : 传智看做班级的集合(list)   班级(Map<Integer,String> 学号:姓名)
 * 3. Map<String,List<E>> : map 里面放list
 * 4. Map<String,Map<String,String>> 
 * 
 * 5. 传智播客
      1. java基础班  javase(key)
        1. 学号: 姓名(map)
 *    2. java就业班  javaee(key)
 *      1. 学号:姓名(map)
 *    3. CEO班级
 * @author Yao Xue
 * @date Jul 29, 2017 9:47:01 PM
 */
public class MapMap {
    public static void main(String[] args) {
        HashMap<String,HashMap<String,String>> czbk = new HashMap<String,HashMap<String,String>>();
        
        HashMap<String,String> javase = new HashMap<String,String>();
        HashMap<String,String> javaee = new HashMap<String,String>();
        
        javase.put("001","丽丽");
        javase.put("002","露露");
        
        javaee.put("003","鹏鹏");
        javaee.put("004","小明");
        
        czbk.put("基础班",javase);
        czbk.put("就业班",javaee);
        
        //entrySet(czbk);
        keySet(czbk);
    }

    private static void entrySet(HashMap<String,HashMap<String,String>> czbk) {
        Set<Entry<String,HashMap<String,String>>> entrySet = czbk.entrySet();
        for (Entry<String,HashMap<String,String>> entry : entrySet) {
            String className = entry.getKey();
            System.out.println("所在班级:"+className);
            
            HashMap<String,String> classMap = entry.getValue();
            
            Set<Entry<String,String>> studentSet = classMap.entrySet();
            for(Entry<String,String> entry2 : studentSet) {
                String num = entry2.getKey();
                String name = entry2.getValue();
                System.out.println(num+":"+name);
            }
        }
        
        
    }
    
    public static void keySet(HashMap<String,HashMap<String,String>> czbk) {
        Set<String> classSet = czbk.keySet();
        Iterator<String> it = classSet.iterator();
        while(it.hasNext()) {
            String className = it.next();
            System.out.println("当前班级:"+className);
            
            HashMap<String,String> classMap = czbk.get(className);
            
            Set<String> numSet = classMap.keySet();
            Iterator<String> it2 = numSet.iterator();
            while(it2.hasNext()) {
                String num = it2.next();
                String name = classMap.get(num);
                System.out.println(num+":"+name);
            }
        }
    }
}
