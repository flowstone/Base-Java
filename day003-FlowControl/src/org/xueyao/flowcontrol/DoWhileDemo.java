package org.xueyao.flowcontrol;
/*
 * do...whileѭ����ʽ��
 * 
 *      do {
 *          ѭ�������;
 *      } while (�ж��������);
 *  ��չ��ʽ��
 *      ��ʼ�����;
 *      do {
 *          ѭ�������;
 *          �����������;
 *      } while (�ж��������);
 */
public class DoWhileDemo {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println("HelloWorld");
            i++;
        } while (i <= 10);
    }
}
