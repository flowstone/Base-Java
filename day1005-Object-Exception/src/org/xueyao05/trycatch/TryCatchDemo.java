package org.xueyao05.trycatch;
/**
 * 3. 异常的处理
        1. 捕获处理，将异常获取，使用try/catch做分支处理：数组越界异常
        2. 原理：JVM检测到异常，抛出，被try抓到扔给catch处理
        
        try {
            //执行的是可能出现异常的代码
        } catch (Exception e) {
            // TODO: handle exception
            //如果出现异常,就在这里处理
        }
 * @author Yao Xue
 * @date Jul 24, 2017 2:30:57 PM
 */
public class TryCatchDemo {
    public static void main(String[] args) {
       // method();
        boolean b = true;
       
        try {
            System.out.println("你给你女朋友转账10000");
            //java.lang.ArithmeticException
            //int i = 1/0;
            System.out.println("你女朋友收到转账10000");
        } catch (Exception e) {
            b = false;
            //当务之急
            System.out.println("给你退款10000");
            //友好的提示：甩锅
            System.out.println("网络异常!");
            System.out.println("服务器正在维护！");
        }
        
        if (b) {
            System.out.println("给你女朋友发送一条信息：转账成功，收到10000");
        } else  {
            System.out.println("给你女朋友发送一条信息：你男朋友转了100元，但是余额不足");
        }
    }

    private static void method() {
        int[] array = {1,2,3};
        try {
            int i = array[3];
            System.out.println(i);
        } catch (Exception e) {
            System.out.println("异常被处理了!");
        }
        System.out.println("程序继续运行");
    }
}
