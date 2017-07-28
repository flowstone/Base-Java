package org.xueyao.linkedlist;

import java.util.LinkedList;

/**
 *  List实现类:LinkedList特点
        1. 底层数据结构链表,双向链表
        2. 查询速度慢,增删快
        3. 线程不安全集合,运行速度快
        4. 特有方法（不能使用多态）
            1. addFirst 元素添加在链表开头 *
            2. addLast（add相同） 元素添加在链表结尾
            
            3. getFirst 获取链表开头
            4. getLast  获取链表结尾
            
            5. removeFirst 移除并返回链表开头*
            6. removeLast 移除并返回链表结尾
            
            7. push 将元素推入此列表所表示的堆栈（元素存储到集合顶部,addFirst） 
            8. pop 从此列表所表示的堆栈处弹出一个元素（最顶部元素弹出,removeFirstt）
 * @author Yao Xue
 * @date Jul 27, 2017 4:14:12 PM
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        //method();
        //method1();
        method2();
    }
//  5. removeFirst 移除并返回链表开头
//  6. removeLast 移除并返回链表结尾
    private static void method2() {
        // TODO Auto-generated method stub
        LinkedList<String> list = new LinkedList<String>();
        list.add("a");
        list.add("b");
        list.removeFirst();
        list.add("c");
        list.add("d");
        //返回的是被移除的元素
        String removeFirst = list.removeFirst();
        System.out.println(removeFirst);
        String removeLast = list.removeLast();
        System.out.println(removeLast);
        //System.out.println(list);
    }
    //   3. getFirst 获取链表开头
//  4. getLast  获取链表结尾
    private static void method1() {
        // TODO Auto-generated method stub
        LinkedList<String> list = new LinkedList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        String first = list.getFirst();
        System.out.println(first);
        String last = list.getLast();
        System.out.println(last);
    }
    
//  1. addFirst 元素添加在链表开头
//  2. addLast（add相同） 元素添加在链表结尾
    private static void method() {
        // TODO Auto-generated method stub
        LinkedList<String> list = new LinkedList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        
        //list.addFirst("e");
        list.addFirst("f");
        list.addLast("e");
        System.out.println(list);
    }
}
