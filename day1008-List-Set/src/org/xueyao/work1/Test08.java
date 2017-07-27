package org.xueyao.work1;

import java.util.HashSet;

/**
 * 向HashSet集合添加姓名{张三,李四,王五,二丫,钱六,孙七},将二丫删除,添加王小丫
 * 1.   创建HashSet集合
    2.  使用add方法往HashSet中添加元素
    3.  使用remove方法删除HashSet中的二丫
    4.  使用add方法往HashSet中添加王小丫

 * @author Yao Xue
 * @date Jul 27, 2017 8:38:18 PM
 */
public class Test08 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("张三");
        hashSet.add("李四");
        hashSet.add("王五");
        hashSet.add("二丫");
        hashSet.add("钱六");
        hashSet.add("孙七");
        
        hashSet.remove("二丫");
        hashSet.add("王小丫");
        System.out.println(hashSet);
    }
}
