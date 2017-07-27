package me.xueyao.iterator;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * ##二. 迭代器
    1. 问题：不同集合由于底层数据结构不同（数组、链表），存储方式各不相同。迭代器就是一种通用的遍历方式。
    2. 迭代器iterator(接口)
        1. 是不同容器Collection的通用遍历方式。
        2. 遍历方式：先判断是否有元素，如果有就取出，循环这个过程，直到所有元素取出。
        3. 迭代：每次对同一过程的重复。
    3. 迭代器方法
        1. 实例化：Collection的iterator()方法
        2. hasNext：是否有下一个元素，有则返回true
        3. next：向下移动一个位置，并返回下一个元素
        
    5. 代码实现步骤
        1. 集合的方法iterator获取到迭代器接口Iterator实现类对象
        2. 迭代器接口实现类对象,调用方法hasNext()判断有没有下一个元素
        3. 迭代器接口实现类对象,调用方法next()取出下一个元素

    6. for循环写法:节省内存,因为Iterator对象在循环时创建用完就回收(不要求掌握)
 * @author Yao Xue
 * @date Jul 26, 2017 11:29:48 PM
 */
public class IteratorDemo {
    public static void main(String[] args) {
        method();
    }

    private static void method() {
        //Collection<String> coll = new ArrayList<String>();
        //Collection<String> coll = new HashSet<String>(); //set是无序的
        Collection<String> coll = new LinkedList<String>();
        coll.add("java");
        coll.add("php");
        coll.add("python");
        coll.add("android");
        
        Iterator<String> it = coll.iterator();
        while (it.hasNext()) {
            String string = (String) it.next();
            System.out.println(string);
        }
        
        for (Iterator<String> it2 = coll.iterator(); it2.hasNext();) {
            String next = it2.next();
            System.out.println("for:"+next);
        }
    }
}
