package org.xueyao06.regex;
/**
 * @author Yao Xue
 * @date Jul 25, 2017 9:51:45 AM
 */
public class RegexDemo {
    public static void main(String[] args) {
        /**
         * 举例：校验qq号码.
            1:要求必须是5-15位数字
            2:0不能开头
         */
        String qq = "604154942";
        String regex = "[1-9][0-9]{4,14}";
        boolean flag = qq.matches(regex);
        System.out.println(flag);
        
        /**
         * 举例：校验手机号码
            1：要求为11位数字
            2：第1位为1，第2位为3、4、5、7、8中的一个，后面9位为0到9之间的任意数字。

         * */
        String phone = "18800022116";
        String regex1 = "1[34578][0-9]{9}";
        boolean flag2 = phone.matches(regex1);
        System.out.println(flag2);
        
        /**
         * 举例：分割出字符串中的的数字
         */
        String s = "18-22-40-65";
        String regex2 = "-";
        String[] split = s.split(regex2);
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
    }
}    
