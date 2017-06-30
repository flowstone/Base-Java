package org.xueyao.basetest;

import java.util.Scanner;

/**
 * �����ڱ�̾����У���6����ίΪ������ѡ�ִ�֣�����Ϊ0-100�������֡�
 * ѡ�ֵ����÷�Ϊ��ȥ��һ����߷ֺ�һ����ͷֺ� ��4����ίƽ��ֵ��
 * ��д����ʵ�֡�(������С������)
 *  ������
 *      A:����һ������Ϊ6������
 *      B:����¼����ί�ķ���
 *      C:д����ʵ�ֻ�ȡ��߷�,��ͷ�
 *      D:д��������ί�ķ�����
 *      E:ƽ���֣�(��-��߷�-��ͷ�)/(arr.length-2)
 *      F:���ƽ���ּ���
 * @author Yao Xue
 * @date Jun 30, 2017 7:00:06 PM
 */
public class CodeMatchScore {
    public static void main(String[] args) {
        int[] arr = new int[6];
        MatchScore(arr);
        int max = scoreMax(arr);
        int min = scoreMin(arr);
        int sum = scoreSum(arr);
        int avg = scoreAvg(arr, max, min);
        System.out.println("6λ��ί�ķ���Ϊ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("ѡ����߷�Ϊ"+max);
        System.out.println("ѡ����ͷ�Ϊ"+min);
        System.out.println("ѡ���ܷ�Ϊ"+sum);
        System.out.println("ѡ�ֵ�ƽ����Ϊ"+avg);
    }
    
    public static void MatchScore(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("�������"+(i+1)+"����ί�����ķ���(1-100)");
            arr[i] = sc.nextInt();
        }
        
        
       
    }
    
    public static int scoreMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
    
    public static int scoreMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
    
    public static int scoreSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    
    public static int scoreAvg(int[] arr, int max, int min) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (sum - max - min) / arr.length-2;
    }
    
    
}
