package com.itheima.string_01;
/**
 *  int length()
    char charAt(int index)
    int indexOf(String str)
    String substring(int start)
    String substring(int start,int end)

 * @author Yao Xue
 * @date Jul 5, 2017 2:07:23 PM
 */
public class StringDemo {
    /**
     * @param args
     */
    public static void main(String[] args) {
        String s = "helloworld";
        
        System.out.println(s.length());
        System.out.println("--------");
        
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(1));
        System.out.println("----------");
        
        System.out.println(s.substring(1));
        System.out.println(s.substring(1, 5));
    }
}
