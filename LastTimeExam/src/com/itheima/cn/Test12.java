package com.itheima.cn;

import java.util.ArrayList;

/**
 * /*1.定义ArrayList集合，存入如下字符串："abc"，"123"， "java"，"mysql"，"别跑啊" 

2.遍历集合,将长度小于4的元素左边填充字符串0，并在控制台打印输出修改后集合中所有元素 

输出结果格式如下： 

[0abc, 0123, java, mysql, 0别跑啊] 

 * @author Yao Xue
 * @date Jul 9, 2017 5:03:02 PM
 */
public class Test12 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("abc");
        arrayList.add("123");
        arrayList.add("java");
        arrayList.add("mysql");
        arrayList.add("别跑啊");
        
        for (int i = 0; i < arrayList.size(); i++) {
            String s = arrayList.get(i);
            if (s.length() < 4) {
                s = '0'+ s;
            }
            arrayList.set(i, s);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
