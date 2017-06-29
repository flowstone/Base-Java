package org.xueyao.homework;
/**
 * 
 * @author Yao Xue
 * @date Jun 29, 2017 10:10:30 PM
 */
public class HomeWork_01 {
    public static void main(String[] args) {
        /*
         * 第一题：分析以下需求，并用代码实现(每个小需求都需要封装成方法)
            1.求两个数据之和(整数和小数)
            2.判断两个数据是否相等(整数和小数)
            3.获取两个数中较大的值(整数和小数)
            4.获取两个数中较小的值(整数和小数)
            5.否能用一个方法实现3和4的两个功能
         */
        
        // 1.求两个数据之和(整数和小数)
        int intSum = sum(2, 5);
        float floatSum = sum(2.5F, 2.4F);
        
        //2.判断两个数据是否相等(整数和小数)
        boolean intNumberEqual = numberEqual(5, 6);
        boolean flaotNumberEqual = numberEqual(5.3F, 5.3F);
        
        //3.获取两个数中较大的值(整数和小数)
        int intNumberMax = numberMax(5, 6);
        float floatNumberMax = numberMax(5.3F, 5.9F);
        
        //4.获取两个数中较小的值(整数和小数)
        int intNumberMin = numberMin(15, 20);
        float floatNumberMin = numberMin(8.9F, 10.8F);
    }
    
    
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }
    
    public static float sum(float num1, float num2) {
        return num1 + num2;
    }
    
    public static boolean numberEqual(int num1, int num2) {
        return num1 == num2;
    }
    
    public static boolean numberEqual(float num1, float num2) {
        return num1 == num2;
    }
    
    public static int numberMax(int num1, int num2) {
        return num1 > num2 ? num1 : num2;
    }
    
    public static float numberMax(float num1, float num2) {
        return num1 > num2 ? num1 : num2;
    }
    
    public static int numberMin(int num1, int num2) {
        return num1 < num2 ? num1 : num2;
    }
    
    public static float numberMin(float num1, float num2) {
        return num1 < num2 ? num1 : num2;
    }
}
