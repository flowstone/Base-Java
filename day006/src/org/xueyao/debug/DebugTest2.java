package org.xueyao.debug;

import java.util.Scanner;

/**
 * �������ĵ�������
 * ��ͷ����ĵ���
 * ����¼�����ݵģ��鿴ִ������
 * 
 * ע�⣺
 *      Ҫ�뿴�����÷�����ִ�����̣���ô�����÷���Ҳ����Ӷϵ�
 * @author Yao Xue
 * @date Jun 30, 2017 4:58:36 PM
 */
public class DebugTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("�������һ������");
        int num1 = sc.nextInt();
        
        System.out.println("������ڶ�������");
        int num2 = sc.nextInt();
        
        int result = sum(num1, num2);
        System.out.println("sum:"+result);
    }
    
    /**
     * @Description: TODO ��ͷ���
     * @return: int
     */
    public static int sum(int num1, int num2) {
        int sum =  num1 + num2;
        return sum;
    }
}


