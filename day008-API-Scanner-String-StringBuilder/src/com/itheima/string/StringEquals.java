package com.itheima.string;
/**
 * @author Yao Xue
 * @date Jul 5, 2017 11:54:11 AM
 */
public class StringEquals {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "hello";
        String s3 = "hello";
        System.out.println("s1==s1 "+s1.equals(s2==s3));
        System.out.println("s1==s2 "+s1.equalsIgnoreCase(s1));
        
        System.out.println(s1.startsWith("He"));
        System.out.println(s2.endsWith("lo"));
    }
}
