package org.xueyao.flowcontrol;

/*
 * if����ʽ2��
 *      if (��ϵ���ʽ) {
 *          �����;
 *      } else {
 *          �����2;
 *      }
 */
public class IfDemo2 {
    public static void main(String[] args) {
        System.out.println("��ʼ");
        
        //�ж�һ������ż����������
        int a = 100;
        
        if (a%2 == 0) {
            System.out.println("a��ż��");
        } else {
            System.out.println("a������");
        }
        
        System.out.println("����");
    }
}
