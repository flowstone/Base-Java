package com.itheima.string;
/**
 * @author Yao Xue
 * @date Jul 5, 2017 11:17:59 AM
 */
public class StringDemoCopy {
    public static void main(String[] args) {
        String s1 = new String("HelloWorld");
        System.out.println("s1:"+s1);
        
        char[] chs = {'H','e','l','l','0'};
        String s2 = new String(chs);
    }
}
