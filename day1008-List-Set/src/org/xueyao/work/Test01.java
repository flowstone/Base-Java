package org.xueyao.work;

import java.util.LinkedList;

/**
 * 1.   创建LinkedList
    2.  使用add方法添加元素
    3.  使用add方法在指定索引添加元素
    4.  使用set方法修改指定位置索引
    5.  使用get方法获取指定索引的元素
    6.  使用size方法获取集合大小
    7.  使用remove方法删除指定索引的元素
    8.  使用clear清空集合中的元素

 * @author Yao Xue
 * @date Jul 27, 2017 7:36:34 PM
 */
public class Test01 {
    public static void main(String[] args) {
        LinkedList<String> ls = new LinkedList<String>();
        ls.add("丽丽");
        ls.add("欣欣");
        ls.add("彬彬");
        ls.add(3, "小明");
        ls.set(3, "露露");
        String string = ls.get(0);
        System.out.println(string);
        ls.remove(3);
        System.out.println(ls);
    }
}
