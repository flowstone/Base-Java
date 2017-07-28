package org.xueyao.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * 三. 集合Collection接口的子接口：Set集合
    1. Set集合特点
        1. 不包含重复元素,不保证集合中的元素顺序
        2. 无索引
        3. Set接口的方法和Collection父接口中一样
    2. HashSet实现类演示set特点
        1. 遍历集合：迭代器和增强for循环遍历，结果都是乱序的
        2. 添加元素：相同元素不能重复添加（add方法返回false）
 * @author Yao Xue
 * @date Jul 27, 2017 4:30:30 PM
 */
public class SetDemo {
    public static void main(String[] args) {
        method();
    }

    private static void method() {
        // TODO Auto-generated method stub
        Set<String> s =  new HashSet<String>();
        //treeSet是会自动会存入的元素进行排序
//        Set<String> s =  new TreeSet<String>();
        s.add("b");
        s.add("a");
        s.add("a");//相同元素不能重复添加 
        s.add("c");
        s.add("d");
        System.out.println(s);
        
        for (String string : s) {
            System.out.println(string);
        }
        Iterator<String> it = s.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
    
}
