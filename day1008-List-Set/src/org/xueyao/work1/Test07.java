package org.xueyao.work1;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * ArrayList有以下元素: "a","f","b","c","a","d"利用HashSet对ArrayList集合去重
 * (最终结果: ArrayList中没有重复元素)
 * 1.   创建ArrayList
    2.  使用add方法往ArrayList添加元素
    3.  创建HashSet.用于将ArrayList中重复的元素去除
    4.  调用HashSet的addAll方法,将ArrayList中的元素添加到HashSet中
    5.  清空list的所有元素
    6.  将set集合中的元素再添加回ArrayList集合

 * @author Yao Xue
 * @date Jul 27, 2017 8:33:02 PM
 */
public class Test07 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("a");
        list.add("f");
        list.add("b");
        list.add("c");
        list.add("a");
        list.add("d");
        
        HashSet<String> set = new HashSet<String>();
        set.addAll(list);
        list.clear();
        list.addAll(set);
        
        System.out.println(list);
        
    }
}
