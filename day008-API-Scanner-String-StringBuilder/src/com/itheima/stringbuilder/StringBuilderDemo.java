package com.itheima.stringbuilder;
/**
 * @author Yao Xue
 * @date Jul 7, 2017 8:36:34 AM
 */
public class StringBuilderDemo {
    public static void main(String[] args) {
        
        //创建对象
        StringBuilder sb = new StringBuilder();
        System.out.println("sb:"+sb);
        
        System.out.println("sb.capacity():"+sb.capacity());
        System.out.println("sb.length():"+sb.length());
        
    }
}
