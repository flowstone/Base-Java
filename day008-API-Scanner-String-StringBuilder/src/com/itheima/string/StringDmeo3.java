package com.itheima.string;
/**
 * Object:是类层次结构中的根类，所有的类都直接或间接的继承自该类
 * 
 * boolean equals(Object obj)  比较字符串的内容是否相同
   boolean equalsIgnoreCase(String str) 比较字符串的内容是否相同(忽略大小写)
   boolean startsWith(String str)  判断字符串对象是否以指定的str开头
   boolean endsWith(String str)  判断字符串对象是否以指定的str结尾

 * @author Yao Xue
 * @date Jul 5, 2017 11:42:44 AM
 */
public class StringDmeo3 {
    public static void main(String[] args) {
        
        String s1 = "hello";
        String s2 = "hello";
        String s3 = "Hello";
        
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        
        System.out.println("------------");
        
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equalsIgnoreCase(s3));
        
        System.out.println("------------");
        
        
        System.out.println(s1.startsWith("he"));
        System.out.println(s1.endsWith("lo"));
        
        System.out.println("------------");
    }
}
