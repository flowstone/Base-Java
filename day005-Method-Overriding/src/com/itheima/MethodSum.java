package com.itheima;
/**
 * 
 * 使用汉字写出定义方法的格式
 *
 * 修饰符  返回值类型   方法名(参数类型 参数名，参数类型1 参数名1，....) {
 *      方法体；
 *      return 返回值
 * }
        定义一个方法: 求两个整数的和
             要求: 1.注释中描述该方法的作用
         2.注释中明确该方法的返回值类型
         3.注释中明确该方法的参数的个数和类型

 * @author Yao Xue
 * @date Jul 1, 2017 10:12:41 AM
 */
public class MethodSum {
    public static void main(String[] args) {
        int sum = numberSum(5, 6);
        System.out.println("sum:"+sum);
    }
    
    /**
     * @Description: TODO 两个整数的和
     * @param int  整数1
     * @param int  整数2
     * @return: int
     */
    public static int numberSum(int num1, int num2) {
        return num1 + num2;
    }
}
