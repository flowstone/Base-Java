package org.xueyao;

import java.util.Scanner;

/**
     ��ȡ������Ԫ��ֵ�����ֵ����Сֵ�Ĳ�ֵ��Ҫ�����£� 
    ����int getNum(int[] arr)��̬�������÷���Ҫ����ɣ���ȡָ������arr��Ԫ��ֵ�����ֵ����Сֵ�Ĳ�ֵ��Ҫ�󷵻صĲ�ֵ���ڵ���0����������
    ����main��������main��������ɣ�
    1.����¼��5���������������int����arr�У�����ǰ��ʾ������ǵڼ���ֵ
    2.��������arr����getNum(int[] arr)��������ȡ����ֵ�����ڿ���̨��ӡ�������ֵ
     
 * @author Yao Xue
 * @date Jul 1, 2017 7:06:42 PM
 */
public class Test_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("�������"+(i+1)+"��ֵ");
            arr[i] = sc.nextInt();
        }
        
        int result = getNum(arr);
        System.out.println("���������ֵ����Сֵ�Ĳ�ֵΪ"+result);
    }
    
    public static int getNum(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if(min > arr[i]) {
                min = arr[i];
            }
        }
        return max - min;
    }
}
