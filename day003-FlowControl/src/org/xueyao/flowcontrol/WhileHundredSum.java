package org.xueyao.flowcontrol;
/*
 * 使用while循环完成1-100之间数据求和
 */
public class WhileHundredSum {
    public static void main(String[] args) {
        
        int sum = 0;
        int i = 1;
        while (i <= 100) {
            sum += i;
            i++;
        }
        
        System.out.println("1-100之间数据的和为"+sum);
    }
}
