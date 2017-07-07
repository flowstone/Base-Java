package com.itheima.stringbuilder;
/**
 * @author Yao Xue
 * @date Jul 7, 2017 8:40:43 AM
 */
public class StringBuilderTest {
    public static void main(String[] args) {
        /*StringBuilder sb = new StringBuilder();
        sb.append("hello").append("world");
        String s = sb.toString();
        System.out.println(s);*/
        
        //String -- StringBuilder
        String s = "helloworld";
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb);
    }
}
