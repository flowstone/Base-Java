package org.xueyao.method;
/**
 * �������أ���ͬһ�����У������˷�������ͬ�����
 * �������ص��ص�
 *      ��������ͬ,�����б�ͬ.�뷵��ֵ�޹�
 *      �����б�ͬ��
 *          �����ĸ�����ͬ
 *          �����ĸ�����ͬ���������Ͳ�ͬ
 *          
 * ע�⣺
 *      �ڵ��÷���ʱ��java�������ͨ��������ʶ��
 * @author Yao Xue
 * @date Jun 29, 2017 8:08:52 PM
 */
public class MethodSumOveriding {
    public static void main(String[] args) {
        
        int num1 = 10;
        int num2 = 20;
        
        //��ͷ���
        int result = sum(num1, num2);
        System.out.println("result:"+result);
        
        //�������
        int num3 = 30;
//        int result2 = sum2(num1, num2, num3);
//        System.out.println("result2:"+result2);
    }
    
    public static float sum(float num1, float num2) {
        return num1 + num2;
    }
    
    /**
     * 
     * @Title: sum
     * @Description: TODO ���������ݵĺ�
     * @param 
     * @return int
     */
    public static int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
    /**
     * 
     * @Title: sum
     * @Description: TODO ���������ĺ�
     * @param 
     * @return int
     */
    public static int sum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }
}
