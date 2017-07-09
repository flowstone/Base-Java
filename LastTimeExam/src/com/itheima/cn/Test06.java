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
            char[] chs = arr[i].toCharArray();
            if ((chs[0] >= 46 && chs[0] <= 57) ||(chs[chs.length-1] >= 46 && chs[chs.length-1] <= 57)) {
                //arr[i].toUpperCase();
                System.out.println(arr[i].toUpperCase());
            }
        }
    }
}
