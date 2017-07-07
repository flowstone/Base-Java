package com.itheima.arraylist;

import java.util.ArrayList;

/**
 * @author Yao Xue
 * @date Jul 7, 2017 11:42:22 AM
 */
public class PrintArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("小红");
        arrayList.add("小华");
        arrayList.add("小李");
        arrayList.add("小明");
        
        for (int i = 0; i < arrayList.size(); i++) {
            String name = arrayList.get(i);
            System.out.println(name);
        }
    }
}
