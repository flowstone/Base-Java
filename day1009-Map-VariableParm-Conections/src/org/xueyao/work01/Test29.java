package org.xueyao.work01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 传智博客包含2个班级:Java基础班,Java就业班
Java基础班:
001 李晨
002 范冰冰
Java就业班:
001 马云
002 马化腾
使用HashMap嵌套HashMap方式完成,1使用keySet和增强for遍历出里面的元素,2使用entrySet和迭代器遍历出里面的元素

 * @author Yao Xue
 * @date Jul 30, 2017 3:32:55 AM
 */
public class Test29 {
    public static void main(String[] args) {
        HashMap<String,HashMap<String,String>> school = new HashMap<String,HashMap<String,String>>();
        HashMap<String,String> javaBase = new HashMap<String,String>();
        HashMap<String,String> javaHeight = new HashMap<String,String>();
        
        javaBase.put("001","李晨");
        javaBase.put("002","范冰冰");
        
        javaHeight.put("001","马云");
        javaHeight.put("002","马化腾");
        
        school.put("Java基础班",javaBase);
        school.put("Java就业班",javaHeight);
        
        Set<Entry<String,HashMap<String,String>>> schoolEntrySet = school.entrySet();
        Iterator<Entry<String,HashMap<String,String>>> schoolIt = schoolEntrySet.iterator();
        
        while (schoolIt.hasNext()) {
            Entry<String,HashMap<String,String>> schoolEntry = schoolIt.next();
            String className = schoolEntry.getKey();
            System.out.println("你所在班级是:"+className);
            HashMap<String,String> classMap = schoolEntry.getValue();
            Set<Entry<String,String>> classEntrySet = classMap.entrySet();
            Iterator<Entry<String,String>> classIt = classEntrySet.iterator();
            while (classIt.hasNext()) {
                Entry<String,String> classStudent = classIt.next();
                String studentKey = classStudent.getKey();
                String studentValue = classStudent.getValue();
                System.out.println(studentKey+" = "+studentValue);
            }
        }
        
        /*keySet() 不推荐使用,效率低
        Set<String> schoolkeySet = school.keySet();
        Iterator<String> schoolIt = schoolkeySet.iterator();
        
        while (schoolIt.hasNext()) {
            String classKey = schoolIt.next();
            HashMap<String,String> className = school.get(classKey);
            System.out.println("你所在的班级是:"+classKey);
            Set<String> classKeySet = className.keySet();
            Iterator<String> classIt = classKeySet.iterator();
            
            while (classIt.hasNext()) {
                String key = classIt.next();
                String value = className.get(key);
                System.out.println(key+" = "+value);
            }
        }*/
        
    }
}
