package com.itheima.string;
/**
 * @author Yao Xue
 * @date Jul 5, 2017 10:43:29 AM
 */
public class StringDemo {
    public static void main(String[] args) {
        String s1 = new String("Hello");
        System.out.println("s1:"+s1);
        
        char[] chs = {'h','e','l','l','o'};
        String s2 = new String(chs);
        System.out.println("s2:"+s2);
        
        String s3 = new String(chs, 0, chs.length);
        System.out.println("s3:"+s3);
        
        String s4 = "hello";
        System.out.println("s4:"+s4);
    }
}
