package org.xueyao.day008_05;
/**
 * @author Yao Xue
 * @date Jul 14, 2017 8:04:27 PM
 */
public class Demo_Final {
    public static void main(String[] args) {
        Son son = new Son();
        son.print();
    }
}
/**
 * final����
 *    final ������ ��
 * final�����ص�
 *      �����࣬�಻�ܱ��̳�
 *      ���α���   �����ͱ�ɳ�����ֻ�ܱ���ֵһ��
 *      ���η����� �������ܱ���д
 * ������ʾ
 *      final �����ص�
 */
class Father {
    /*public final void print() {
        System.out.println("���ʵײ�������Դ");
    }*/
    public  void print() {
        System.out.println("���ʵײ�������Դ");
    }
}

class Son extends Father {
    //final int num = 10;
     int num = 10;
     final int NUM = 10;
     public static final double PI = 3.14;
    public void print() {
        //num = 20;
        //System.out.println("���������ܱ��Ҹɵ�");
        System.out.println(num);
    }
}