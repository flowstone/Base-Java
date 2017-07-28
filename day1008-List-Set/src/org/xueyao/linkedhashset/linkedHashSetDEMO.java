package org.xueyao.linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * 9. LinkedHashSet特点
        1. LinkedHashSet 继承 HashSet(单向链表),实现Set接口
        2. LinkedHashSet集合的自身特点:
            1. 底层数据结构 哈希表(数组和链表),双向链表
            2. 有序的Set集合,存储和取出的顺序一致
            3. 线程不安全的集合,运行速度快
 * @author Yao Xue
 * @date Jul 27, 2017 6:13:29 PM
 */
public class linkedHashSetDEMO {
    public static void main(String[] args) {
        LinkedHashSet<String> ls = new LinkedHashSet<String>();
        ls.add("e");
        ls.add("c");
        ls.add("b");
        ls.add("a");
        System.out.println(ls);
        
        Iterator<String> it = ls.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        
        for (String s : ls) {
            System.out.println(s);
        }
    }
}
