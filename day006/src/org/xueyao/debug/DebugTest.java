package org.xueyao.debug;
/**
 * ��ѭ����ִ������
 * 1-5��Ͱ���
 * @author Yao Xue
 * @date Jun 30, 2017 4:33:12 PM
 */
public class DebugTest {
    public static void main(String[] args) {
        //������ͱ���
        int sum = 0;
        
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println("sum:"+sum);
    }
}
