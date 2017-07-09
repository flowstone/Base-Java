package com.itheima.cn;
/**
 **定义一个长度为4的String类型数组，包含如下元素：”12ab”，”java”，”45Cd”，”Server78”；遍历数组进行判断，如果字符串是以数
字开头或结尾，就将该字符串中包含的小写字符串转换成大写字符串，并在控制台打印输出。 
 * @author Yao Xue
 * @date Jul 9, 2017 4:29:12 PM
 */
public class Test10 {
    public static void main(String[] args) {
        String[] str = {"12ab","java","45Cd","Server78"};
        for (int i = 0; i < str.length; i++) {
            boolean flag = false;
            char[] chs = str[i].toCharArray();
            if (chs[0] <='9' &&chs[0]>='0' || chs[chs.length-1] <='9'&&chs[chs.length-1]>='0') {
                flag = true;
            }
            if (flag) {
                System.out.println(str[i].toUpperCase());
            }
        }
    }
}
