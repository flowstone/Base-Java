package com.itheima.arraylist;

import java.util.ArrayList;

/**
 * 新建一个存储字符串集合
存储”hello”,”world”,”java”
利用for循环遍历出集合中的元素

 * @author Yao Xue
 * @date Jul 7, 2017 11:24:12 AM
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        
        //存储”hello”,”world”,”java”
        arrayList.add("hello");
        arrayList.add("world");
        arrayList.add("java");

        //System.out.println(arrayList);
        //利用for循环遍历出集合中的元素
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}   
