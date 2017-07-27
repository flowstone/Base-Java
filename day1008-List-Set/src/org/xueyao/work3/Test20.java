package org.xueyao.work3;

import java.util.HashSet;
import java.util.Iterator;

/**
 * 
 * 1.   HashSet
    2.  增强for

 * 一个学科中有若干班级，每一个班级又有若干学生。整个学科一个大集合，若干个班级分为每一个小集合(集合嵌套之HashSet嵌套HashSet)。要求如下
    1、 学生类有两个属性，姓名和年龄，并定义有参构造、无参构造和getter/setter方法.姓名和年龄相同的视为同一学生
    2、向班级集合中添加若干个学生（至少两个学生）。
    2、向学科集合中添加所有班级(至少创建两个班级)。
    3、使用两种方法遍历学科集合，并打印出所有学生。

 * @author Yao Xue
 * @date Jul 27, 2017 10:55:09 PM
 */
public class Test20 {
    public static void main(String[] args) {
        HashSet<Student> array1 = new HashSet<Student>();
        array1.add(new Student("小明", 18));
        array1.add(new Student("小李", 18));
        array1.add(new Student("小季", 18));
        array1.add(new Student("小高", 18));
        
        HashSet<Student> array2 = new HashSet<Student>();
        array1.add(new Student("小明", 18));
        array1.add(new Student("小李", 18));
        array1.add(new Student("小季", 18));
        array1.add(new Student("小高", 18));

        HashSet<HashSet<Student>> hashSet = new HashSet<HashSet<Student>>();
        hashSet.add(array1);
        hashSet.add(array2);
        
        Iterator<HashSet<Student>> it = hashSet.iterator();
        while (it.hasNext()) {
            Iterator<Student> its = it.next().iterator();
            while (its.hasNext()) {
                Student next = its.next();
                System.out.println(next.getName()+"----"+next.getAge());
                
            }
        }
        
        
        for (HashSet<Student> s : hashSet) {
            for (Student st : s) {
                Student st2 = st;
                System.out.println(st2.getName()+"---------"+st2.getAge());
            }
        }
    }
}
