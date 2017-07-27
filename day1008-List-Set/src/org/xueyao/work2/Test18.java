package org.xueyao.work2;

import java.util.ArrayList;

/**
 * 定义一个方法filterChars(ArrayList<String> list)将传入的ArrayList<String>集合中的每个元素中的字母过滤掉,
 * 比如list有2个元素{"hello123java", "11world555java"}，返回结果{"123", "11555"}
 * 1.   定义ArrayList strs存放元素
    2.  使用add方法往ArrayList中添加元素,元素包含字母和数字
    3.  定义filterChars(ArrayList<String> list)方法
    4.  在filterChars方法中使用for循环拿出每个元素
    5.  替换掉字符串中所有的字母
    6.  使用替换后的字符串覆盖原来的字符串
    7.  调用filterChars方法

 * @author Yao Xue
 * @date Jul 27, 2017 10:38:39 PM
 */
public class Test18 {
    public static void main(String[] args) {
        ArrayList<String> strs = new ArrayList<String>();
        strs.add("hello123java");
        strs.add("11world555java");
        filterChars(strs);
    }
    public static void filterChars(ArrayList<String> list) {
        for (String s : list) {
            s = s.replaceAll("[a-zA-Z]+", "");
            
            System.out.println(s);
            
        }
    }
}
