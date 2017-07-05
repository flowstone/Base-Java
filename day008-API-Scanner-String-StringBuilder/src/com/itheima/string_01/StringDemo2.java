package com.itheima.string_01;
/**
 * @author Yao Xue
 * @date Jul 5, 2017 3:40:58 PM
 */
public class StringDemo2 {
    public static void main(String[] args) {
        String str = "helloworld";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
        System.out.println("-------");
        
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]);
        }
        
        System.out.println("-----------");
        
        String str2 = "hello world you win";
        String[] split = str2.split(" ");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
        
    }
}
