package com.itheima.string_01;
/**
 * @author Yao Xue
 * @date Jul 5, 2017 6:47:42 PM
 */
public class StringBuilderDemo {
    public static void main(String[] args) {
        /*StringBuilder sb = new StringBuilder();
        
        sb.append("hello").append("world").reverse();
        System.out.println(sb);*/
        
        //String  str = "hello";
        //StringBuilder sb = new StringBuilder(str);
        StringBuilder sb = new StringBuilder("hello");
        String str2 = sb.append("1").append(20).append(true).toString();
        System.out.println(str2);
    }
}
