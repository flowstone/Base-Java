package org.xueyao.homework;

import java.util.ArrayList;

/**
 * 第四题：分析以下需求，并用代码实现
        1.定义ArrayList集合，存入多个字符串
           如:"ab1" "123ad"  "bca" "dadfadf"  "dddaaa"  "你好啊"  "我来啦"  "别跑啊"
        2.遍历集合,删除长度大于5的字符串,打印删除后的集合对象
        3.基于上一步,删除集合中元素包含0-9数字的字符串(只要字符串中包含0-9中的任意一个数字就需要删除此整个字符串)
    
 * @author Yao Xue
 * @date Jul 6, 2017 2:56:30 PM
 */
public class HomeWork_04 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("ab1");
        arrayList.add("123ad");
        arrayList.add("bca");
        arrayList.add("dadfadf");
        arrayList.add("dddaaa");
        arrayList.add("你好啊");
        arrayList.add("我来啦");
        arrayList.add("别跑啊");
       // System.out.println(arrayList);
        for (int i = arrayList.size()-1; i >= 0; i--) {
            String s = arrayList.get(i);
            if (s.length() > 5) {
                arrayList.remove(i);
            }
           
        }
        
        
        for (int i = 0; i < arrayList.size(); i++) {
            String string = arrayList.get(i);
            System.out.println(string);
        }
    }
}
