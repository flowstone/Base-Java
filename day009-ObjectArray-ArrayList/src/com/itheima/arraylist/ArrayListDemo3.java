package com.itheima.arraylist;

import java.util.ArrayList;

/**
 *  * 给定一个字符串数组：{"张三丰”,"宋远桥”,"张无忌”,"殷梨亭”,"张翠山”,"莫声谷”}，将数组中的元素添加到集合中，并把所有姓张的人员打印到控制台上。
 * @author Yao Xue
 * @date Jul 7, 2017 11:52:32 AM
 */
public class ArrayListDemo3 {
    public static void main(String[] args) {
        String[] str = {"张三丰","宋远桥","张无忌","殷梨亭","张翠山","莫声谷"};
        ArrayList<String> arrayList = new ArrayList<String>();
        //增加到集合中
        for (int i = 0; i < str.length; i++) {
            arrayList.add(str[i]);
        }
        //遍历集合，把姓张的输出
        for (int i = 0; i < arrayList.size(); i++) {
            String s = arrayList.get(i);
            if (s.startsWith("张")) {
                System.out.println(s);
            }
        }
    }
}
