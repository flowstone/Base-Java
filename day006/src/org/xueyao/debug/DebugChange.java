package org.xueyao.debug;
/**
 * ��������ǻ����������ͣ�
 *      ��ʽ�����ĸı䲻Ӱ��ʵ�ʲ���
 * @author Yao Xue
 * @date Jun 30, 2017 5:25:10 PM
 */
public class DebugChange {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("a:"+a+",b"+b);
        change(a, b);
        System.out.println("a:"+a+",b:"+b);
    }
    
    public static void change(int a, int b) {
        System.out.println("a:"+a+",b:"+b);
        a = b;
        b = a + b;
        System.out.println("a:"+a+",b:"+b);
    }
}
