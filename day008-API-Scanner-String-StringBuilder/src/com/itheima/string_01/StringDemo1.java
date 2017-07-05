package com.itheima.string_01;
/**
 * @author Yao Xue
 * @date Jul 5, 2017 3:20:19 PM
 */
public class StringDemo1 {
    public static void main(String[] args) {
        String s = "HelloWorld";
        
        System.out.println(s.indexOf('l', 1));
        System.out.println(s.substring(0));
        System.out.println(s.substring(1, 5));
        System.out.println(s.indexOf('H'));
        
        System.out.println(s.charAt(5));
        System.out.println(s.length());
    }
}
