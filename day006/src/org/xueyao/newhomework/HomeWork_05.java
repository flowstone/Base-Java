package org.xueyao.newhomework;
/**
 * ������: �����������󣬲��ô���ʵ��
    ��һ�������У�2/1��3/2��5/3��8/5��13/8��21/13... ����һ���������������е�ǰ20 ��֮�͡�
 * @author Yao Xue
 * @date Jul 2, 2017 9:10:06 PM
 */
public class HomeWork_05 {
    public static void main(String[] args) {
        int m = 1;
        int n = 1;
        int sum = 0;
        for (int i = 1; i <= 20; i++) {
            sum += (m + n) / n;
            System.out.println(m+"+"+n+"/"+n);
            int temp = n;
            n = m + n;
            m = temp;
        }
        System.out.println("ǰ20��֮��"+sum);
    }
}
