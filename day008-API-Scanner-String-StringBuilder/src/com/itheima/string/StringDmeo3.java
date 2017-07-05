package com.itheima.string;
/**
 * Object:�����νṹ�еĸ��࣬���е��඼ֱ�ӻ��ӵļ̳��Ը���
 * 
 * boolean equals(Object obj)  �Ƚ��ַ����������Ƿ���ͬ
   boolean equalsIgnoreCase(String str) �Ƚ��ַ����������Ƿ���ͬ(���Դ�Сд)
   boolean startsWith(String str)  �ж��ַ��������Ƿ���ָ����str��ͷ
   boolean endsWith(String str)  �ж��ַ��������Ƿ���ָ����str��β

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
