package org.xueyao.flowcontrol;
/*
 * while ѭ��������ʽ
 *      while (�ж��������) {
 *          ѭ�������;
 *      }
 * 
 *  ��չ��ʽ��
 *      ��ʼ�����
 *      while (�ж��������) {
 *          ѭ�������;
 *          �����������;
 *      }
 * 
 */
public class WhileDemo {
    public static void main(String[] args) {
        int x = 1;
        while (x <= 10) {
            System.out.println("HelloWorld");
            x++;
        }
    }
}
