package org.xueyao.flowcontrol;

/*
 * break:�жϵ���˼ 
 * 
 * ʹ�ó�����
 *      A��switch�����
 *      B��ѭ����
 */
public class BreakDemo {
    public static void main(String[] args) {
        for (int x = 1; x <=10; x++) {
            if (x == 3) {
                break;
            }
            System.out.println("HelloWorld");
        }
    }
}
