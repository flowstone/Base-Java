package com.itheima;
/**
 * 
 * ʹ�ú���д�����巽���ĸ�ʽ
 *
 * ���η�  ����ֵ����   ������(�������� ����������������1 ������1��....) {
 *      �����壻
 *      return ����ֵ
 * }
        ����һ������: �����������ĺ�
             Ҫ��: 1.ע���������÷���������
         2.ע������ȷ�÷����ķ���ֵ����
         3.ע������ȷ�÷����Ĳ����ĸ���������

 * @author Yao Xue
 * @date Jul 1, 2017 10:12:41 AM
 */
public class MethodSum {
    public static void main(String[] args) {
        int sum = numberSum(5, 6);
        System.out.println("sum:"+sum);
    }
    
    /**
     * @Description: TODO ���������ĺ�
     * @param int  ����1
     * @param int  ����2
     * @return: int
     */
    public static int numberSum(int num1, int num2) {
        return num1 + num2;
    }
}
