package me.xueyao.concurrent;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 7. 并发修改异常
        0. 需求:假设一个集合中如果有java,就添加oracle元素
        1. java.util.ConcurrentModificationException
        2. 不能在迭代的过程中,使用集合的方法,修改长度
 * @author Yao Xue
 * @date Jul 26, 2017 11:37:40 PM
 */
public class ConcurrentDemo {
    public static void main(String[] args) {
        method();
    }

    private static void method() {
        Collection<String> coll = new ArrayList<String>();
        coll.add("java");
        coll.add("php");
        coll.add("ios");
        coll.add("android");
        
        Iterator<String> it = coll.iterator();
        //集合长度被记录起来,不能更改
        while(it.hasNext()) {
            String next = it.next();
            System.out.println(next);
            if ("java".equals(next)) {
                coll.add("oracle");
            }
        }
        //遍历开始,集合长度就已经被记录起来
        
    }
}
