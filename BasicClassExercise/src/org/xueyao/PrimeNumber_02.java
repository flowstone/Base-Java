package org.xueyao;
/**
 * ������2��
��Ŀ���ж�101-200֮���ж��ٸ����������������������
������ֻ�ܱ�1�ͱ�������������������

 * @author Yao Xue
 * @date Jul 1, 2017 1:51:10 PM
 */
public class PrimeNumber_02 {
    public static void main(String[] args) {
        PrintPrime(1,9);
    }
    
    public static void PrintPrime(int n, int m) {
        int count = 0;
        for (int i = n; i <=m ; i++) {
            int flag = 1;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) {
                count++;
                System.out.println(i+"������");
            }
        }
        System.out.println(n+"-"+m+"֮����"+count+"������");
    }
}


