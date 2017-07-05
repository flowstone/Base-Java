package com.itheima.string;
/**
 * 通过构造方法创建字符串对象
 * @author Yao Xue
 * @date Jul 5, 2017 11:22:49 AM
 */
public class StringDmeo2 {
    public static void main(String[] args) {
        String s1 = new String("hello");
        String s2 = "hello";
        
        System.out.println("s1:"+s1);
        System.out.println("s2:"+s2);
        
        System.out.println("s1==s2:"+(s1==s2));
        
        String s3 = "hello";
        System.out.println("s1==s3:"+(s1==s3));
        
        System.out.println("s2==s3:"+(s2==s3));
        
        
    }
}
