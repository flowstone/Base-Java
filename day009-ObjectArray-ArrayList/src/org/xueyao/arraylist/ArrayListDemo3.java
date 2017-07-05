package org.xueyao.arraylist;

import java.util.ArrayList;

/**
 * 给定一个字符串数组：{"张三丰”,"宋远桥”,"张无忌”,"殷梨亭”,"张翠山”,"莫声谷”}，将数组中的元素添加到集合中，并把所有姓张的人员打印到控制台上。
 * @author Yao Xue
 * @date Jul 5, 2017 11:48:31 PM
 */
public class ArrayListDemo3 {
    public static void main(String[] args) {
        String[] str = {"张三丰","宋远桥","张无忌","殷梨亭","张翠山","莫声谷"};
        ArrayList<String> array = new ArrayList<String>();
        for (int i = 0; i < str.length; i++) {
            array.add(str[i]);
        }
        
        for (int i = 0; i < str.length; i++) {
            String s = array.get(i);
            if (s.startsWith("张")) {
                System.out.println(s);
            }
        }
    }
}
