package org.xueyao.arraylist;

import java.util.ArrayList;

/**
 * ArrayList集合的遍历
 *      通过size()和get()配合实现的
 * @author Yao Xue
 * @date Jul 5, 2017 11:37:37 PM
 */
public class ArrayListDemo1 {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<String> array = new ArrayList<String>();
        
        //添加元素
        array.add("hello");
        array.add("world");
        array.add("java");
        
        //获取元素
        System.out.println(array.get(0));
        System.out.println(array.get(1));
        System.out.println(array.get(2));
        System.out.println("-----------");
        
        for (int i = 0; i < 3; i++) {
            System.out.println(array.get(i));
        }
        System.out.println("----------------");
        
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
        
        System.out.println("------------");
        
        //最标准的用法
        for (int i = 0; i < array.size(); i++) {
            String s = array.get(i);
            System.out.println(s);
        }
    }
}
