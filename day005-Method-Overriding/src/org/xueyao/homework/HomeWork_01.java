package org.xueyao.homework;
/**
 * 
 * @author Yao Xue
 * @date Jun 29, 2017 10:10:30 PM
 */
public class HomeWork_01 {
    public static void main(String[] args) {
        /*
         * ��һ�⣺�����������󣬲��ô���ʵ��(ÿ��С������Ҫ��װ�ɷ���)
            1.����������֮��(������С��)
            2.�ж����������Ƿ����(������С��)
            3.��ȡ�������нϴ��ֵ(������С��)
            4.��ȡ�������н�С��ֵ(������С��)
            5.������һ������ʵ��3��4����������
         */
        
        // 1.����������֮��(������С��)
        int intSum = sum(2, 5);
        float floatSum = sum(2.5F, 2.4F);
        
        //2.�ж����������Ƿ����(������С��)
        boolean intNumberEqual = numberEqual(5, 6);
        boolean flaotNumberEqual = numberEqual(5.3F, 5.3F);
        
        //3.��ȡ�������нϴ��ֵ(������С��)
        int intNumberMax = numberMax(5, 6);
        float floatNumberMax = numberMax(5.3F, 5.9F);
        
        //4.��ȡ�������н�С��ֵ(������С��)
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
