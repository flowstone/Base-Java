package org.xueyao.linkedlist;

import java.util.LinkedList;

/**
 * @author Yao Xue
 * @date Jul 27, 2017 4:14:12 PM
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        //method();
        //method1();
        method2();
    }

    private static void method2() {
        // TODO Auto-generated method stub
        LinkedList<String> list = new LinkedList<String>();
        list.add("a");
        list.add("b");
        list.removeFirst();
        list.add("c");
        list.add("d");
        String removeFirst = list.removeFirst();
        System.out.println(removeFirst);
        String removeLast = list.removeLast();
        System.out.println(removeLast);
        //System.out.println(list);
    }

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
