package org.xueyao.homework;
/**
 * 第四题: 分析以下需求，并用代码实现
    有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13... 定义一个方法求出这个数列的前20 项之和。
                  
 * @author Yao Xue
 * @date Jul 1, 2017 9:32:25 PM
 */
public class HomeWork_03 {
    public static void main(String[] args) {
       int m = 1;
       int n = 1;
       double sum = 0;
       for (int i = 1; i <= 20; i++) {
          sum += (m + n) / m;
          //System.out.println(m+"+"+n+"/"+m);
          int temp = m;
          m = m + n;
          n = temp;
          
       }
       System.out.println("2/1，3/2，5/3，8/5，13/8，21/13... 定义一个方法求出这个数列的前20 项之和"+sum);
       
    }
    
    
}
