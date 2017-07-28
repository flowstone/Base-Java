package org.xueyao.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * 1. List的特点
        1. 有序的集合：元素存储的顺序和取出的顺序相同
        2. 具有整数索引,就是下标
        3. 允许重复元素
    2. List的方法（带索引）
        1. add(int index, E element) ：往索引位置添加一个元素
            2. Java中的 三个越界异常
                1. IndexOutOfBoundsException  集合
                2. ArrayIndexOutOfBoundsException  数组
                3. StringIndexOutOfBoundsException 字符串越界
            3. Java常见的四个异常:空指针异常  \  类转换异常   \ 数组越界  \ 非法参数异常 IllegalArgumentException
            
        2. get(int index)：获取指定索引的元素
        3. remove(int index):移除指定索引的元素
        4. set(int index, E element) ：修改指定索引的元素值
        5. subList(int fromIndex, int toIndex) ：返回集合的一部分(左包右不包)
 *  3. List实现类:ArrayList特点
        1. 底层数据结构是数组(默认长度为10)，自动复制扩容
        2. 查询快，增删慢
        3. 不是同步的，线程不安全，运行速度快(StringBuilder不安全,快    StringBuffer安全)
    4. List实现类:Vector特点
        1. List属于集合框架中的接口,开始于JDK1.2版本.Vector开始于JDK1.0版本,从1.2开始改为实现接口List
        2. 底层数据结构也是数组,和ArrayList相同
        3. Vector是线程安全的集合,运行速度慢,在开发中被ArrayList取代
 * @author Yao Xue
 * @date Jul 27, 2017 3:50:26 PM
 */
public class ListDemo {
    public static void main(String[] args) {
       // add();
        //set();
        sublist();
        ArrayList<String> list = new ArrayList<String>();
    }

    private static void sublist() {
        // TODO Auto-generated method stub
        List<String> list = new ArrayList<String>();
        
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        List<String> subList = list.subList(1, 3);
        System.out.println(subList);
    }

    private static void set() {
        // TODO Auto-generated method stub
List<String> list = new ArrayList<String>();
        
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        //该索引没有值就无法修改
        list.set(4, "e");
        System.out.println(list);
    }

    private static void add() {
        // TODO Auto-generated method stub
        List<String> list = new ArrayList<String>();
        
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        
        //list.add(1, "e");
        list.add(4, "e");
        //java.lang.IndexOutOfBoundsException 集合下标越界
        //list.add(5,"e");
        String s2 = list.get(3);
        String remove = list.remove(2);
        System.out.println(remove);
        System.out.println(s2);
        System.out.println(list);
    }
}
