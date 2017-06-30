package org.xueyao.debug;

import java.util.Scanner;

/**
 * 看方法的调用流程
 * 求和方法的调用
 * 带有录入数据的，查看执行流程
 * 
 * 注意：
 *      要想看被调用方法的执行流程，那么被调用方法也必须加断点
 * @author Yao Xue
 * @date Jun 30, 2017 4:58:36 PM
 */
public class DebugTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("请输入第一个数据");
        int num1 = sc.nextInt();
        
        System.out.println("请输入第二个数据");
        int num2 = sc.nextInt();
        
        int result = sum(num1, num2);
        System.out.println("sum:"+result);
    }
    
    /**
     * @Description: TODO 求和方法
     * @return: int
     */
    public static int sum(int num1, int num2) {
        int sum =  num1 + num2;
        return sum;
    }
}


