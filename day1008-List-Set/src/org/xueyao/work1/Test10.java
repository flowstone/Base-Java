package org.xueyao.work1;

import java.util.HashSet;
import java.util.Iterator;

/**
 * 定义一个Student类,包含名称,年龄,性别(姓名,年龄,性别完全相同视为同一学生)
创建10个Student对象,至少有两个学生姓名,年龄,性别完全相同. 把这10个学生添加到Set集合中,不可以重复,遍历Set集合打印学生信息,使用两种方式
1.  定义一个Student类,包含名称,年龄,性别重写hashCode()和equals()方法
2.  创建HashSet集合
3.  使用Student类创建10个学生,把这10个学生添加到Set集合中
4.  使用迭代器遍历HashSet
5.  使用增强for遍历集合

 * @author Yao Xue
 * @date Jul 27, 2017 8:51:04 PM
 */
public class Test10 {
    public static void main(String[] args) {
        HashSet<Student> hashSet = new HashSet<Student>();
        hashSet.add(new Student("景天",20,'男'));
        hashSet.add(new Student("唐雪见", 18, '女'));
        hashSet.add(new Student("龙葵", 17,'女'));
        hashSet.add(new Student("龙葵", 17,'女'));
        hashSet.add(new Student("重楼", 1000, '男'));
        hashSet.add(new Student("许长卿", 20, '男'));
        hashSet.add(new Student("紫萱", 500, '女'));
        hashSet.add(new Student("万玉枝", 800, '女'));
        hashSet.add(new Student("夕瑶", 1500, '女'));
        hashSet.add(new Student("夕瑶", 1500, '女'));
        
        Iterator<Student> it = hashSet.iterator();
        while (it.hasNext()) {
            Student next = it.next();
            System.out.println(next);
        }
        System.out.println("------------完美分割线------------");
        for (Student s : hashSet) {
            System.out.println(s);
        }
    }
}
