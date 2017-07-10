package com.itheima.cn;
/**
 * 二.(1)定义数字字符串数组{"010","3223","666","7890987","123123"} 
(2)判断该数字字符串数组中的数字字符串是否是对称(第一个数字和最后一个数字相等，第二个数字和倒数第二个数字是相等的，依次类推)的，并逐个输出 
如：010 是对称的，3223 是对称的，123123 不是对称的。
 * @author Yao Xue
 * @date Jul 9, 2017 6:47:26 PM
 */
public class Test18 {
    public static void main(String[] args) {
        String[] str = {"010","3223","666","7890987","123123"} ;
        String[] strings = new String[str.length];
        for (int i = 0; i < str.length; i++) {
            strings[i]  = str[i];
            //如果使用StringBuilder中的反转方法，它会把原字符的数据改变，为了比较，我们要把原来的数据保存到一个新的字符中，以便比较
            StringBuilder stringBuilder = new StringBuilder(str[i]);
            
            if (strings[i].contentEquals(stringBuilder.reverse())) {
                System.out.println(strings[i]+" 是对称的");
            } else {
               System.out.println(strings[i]+" 不是对称的");
            }
        }
    }
}
