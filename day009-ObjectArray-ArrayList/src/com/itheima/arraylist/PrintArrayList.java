package com.itheima.arraylist;

import java.util.ArrayList;

/**
 * @author Yao Xue
 * @date Jul 7, 2017 11:42:22 AM
 */
public class PrintArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("С��");
        arrayList.add("С��");
        arrayList.add("С��");
        arrayList.add("С��");
        
        for (int i = 0; i < arrayList.size(); i++) {
            String name = arrayList.get(i);
            System.out.println(name);
        }
    }
}
