package com.itheima.cn;
/**
 * 定义一个长度为4的String类型数组，包含如下元素：”12ab”，”java”，”45Cd”，”Server78”；
 * 遍历数组进行判断，如果字符串是以数字开头或结尾，就将该字符串中包含的小写字符串转换成大写字符串，并在控制台打印输出。
 * @author Yao Xue
 * @date Jul 8, 2017 10:43:25 PM
 */
public class Test06 {
    public static void main(String[] args) {
        String[] arr = {"12ab","java","45Cd","Server78"};
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            if (s.charAt(0) >= '0' && s.charAt(0) <= '9' || s.charAt(s.length()-1) >= '0' && s.charAt(s.length()-1) <= '9') {
                System.out.println(s.toUpperCase());
            }
        }
    }
}
