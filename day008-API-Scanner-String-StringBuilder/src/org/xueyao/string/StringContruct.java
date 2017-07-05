package org.xueyao.string;

/**
 * String:字符串类
 *      由多个字符组成的一串数据
 *      字符串其本质是一个字符数组
 * 
 * 构造方法：
 *      public String(String original):把字符串数据封装成字符串对象
 *      public String(char[] value)  ：把字符数组的数据封装成字符串对象
 *      public String(char[] value,int offset,int count) ： 把字符数组中的一部分数据封装成字符串对象
 *      
 * 注意：字符串是一种比较特殊的引用数据类型，直接输出字符串对象输出的是该对象中的数据。
 * @author Yao Xue
 *
 */
public class StringContruct {
    public static void main(String[] args) {
        // public String(String original)
        String s1 = new String("Hello");
        System.out.println("s1:"+s1);
        
        //public String(char[] value)
        char[] chs = {'H','e','l','l','o'};
        String s2 = new String(chs);
        System.out.println("s2:"+s2);
        
    }
}
