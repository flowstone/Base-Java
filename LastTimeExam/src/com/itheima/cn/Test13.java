package com.itheima.cn;
/**
 * //编写一个Java程序，有一个String字符串"   ab123cd  "，
//* 先需要去除字符串两端的空白后，截取出字符串中的123，
//* 获取截取出来的字符串长度，将长度和截取出的字符串在控制台打印输出；
 * @author Yao Xue
 * @date Jul 9, 2017 5:26:54 PM
 */
public class Test13 {
    public static void main(String[] args) {
        //String str = "   ab12adfasdfsas3456465cd  ";
        String str = "   ab123cd  ";
        /*String str1 = str.trim().substring(2, 5);
        int len = str1.length();
        
        System.out.println("长度："+len+"截取的字符："+str1);*/
        
        //方法二
        String str1 = str.trim();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) >= '0' && str1.charAt(i) <= '9') {
                sb.append(str1.charAt(i));
            }
        }
        String s = sb.toString();
        System.out.println("长度为"+s.length()+"截取出的字符串"+s);
    }
}
