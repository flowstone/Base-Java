package com.itheima.cn;
/**
 * 3 . 编写一个Java程序，有一个String字符串"   ab123cd  "，先需要去除字符串两端的空白后，
 * 截取出字符串中的123，获取截取出来的字符串长度，将长度和截取出的字符串在控制台打印输出；
 * @author Yao Xue
 * @date Jul 8, 2017 7:42:40 PM
 */
public class Test03 {
    public static void main(String[] args) {
        String s = "   ab123cd  ";
        String s1 = s.trim();
        
        String s2 = s1.substring(2, 5);
        System.out.println(s2);
                
    }
}
