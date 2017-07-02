package com.itheima;


/**
 * * 需求：打印5位数中的所有回文数。
 *      什么是回文数呢?举例：12321是回文数，个位与万位相同，十位与千位相同。
 * 
 * 分析：
 *      A:5位数告诉了我们数据的范围，用for循环实现
 *      B:获取每一个5位数，然后得到它的个位，十位，千位，万位
 *          假设x是一个5位数：
 *              个位：x%10
 *              十位：x/10%10
 *              千位：x/10/10/10%10
 *              万位：x/10/10/10/10%10
 *      C:把满足条件的数据输出即可

 * @author Yao Xue
 * @date Jul 2, 2017 11:57:06 AM
 */
public class PalindromeMethod {
    public static void main(String[] args) {
        printPalindrome();
    }

    public static void printPalindrome() {
        for (int i = 10000; i <= 99999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            //int bai = i / 10 / 10 % 10;
            int qian = i / 10 / 10 / 10 % 10;
            int wan = i / 10 / 10 / 10 / 10 % 10;
            
            if (ge == wan && shi == qian) {
                System.out.println(i);
            }
        }
    }
}
