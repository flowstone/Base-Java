package org.xueyao.method;
/**
 * �����ĵ���(����ȷ����ֵ �ķ�������) ��
 *      A���������ã�û������
 *      B��������ã������壬���ǲ����ã���Ϊ�ҿ�����Ҫ���
 *      B����ֵ���ã��Ƽ�ʹ��
 * @author Yao Xue
 * @date Jun 29, 2017 7:05:26 PM
 */
public class MethodSum {
    public static void main(String[] args) {
        //��������
        //sum(10, 20);
        
        //�������
        //System.out.println(sum(10,20));
        
        //��ֵ����
        int sum = sum(10, 20);
        System.out.println("sum:"+sum);
    }
    
    /*
     * ��͵ķ���
     * 
     * ������ȷ��
     *      ����ֵ����:int
     *      �����б�int a, int b;
     */
    
    public static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
