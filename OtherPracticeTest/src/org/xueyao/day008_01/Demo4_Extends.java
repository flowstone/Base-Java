package org.xueyao.day008_01;
/**
 * @author Yao Xue
 * @date Jul 14, 2017 5:42:40 PM
 */
public class Demo4_Extends {
    public static void main(String[] args) {
        Son son = new Son();
        son.print();
    }
}


/**
 * ������ʾ
 *      ��ͬ���ı���
 *      ͬ���ı��� 
 *        �Ӹ������ͬ���ı���ֻ���ڽ����о������У��ڿ������ǲ�������������
 *        ����̳и������Ϊ��ʹ�ø��࣬��ô���������ͬ���ĳ�Ա����û��������
 */

class Father {
    int num1 = 10;
    int num2 = 30;
    
}

class Son extends Father {
    int num2 = 20;
    
    public void print() {
        System.out.println(this.num1);
        System.out.println(num2); //�ͽ�ԭ�������оͲ��ø���
        System.out.println(super.num2); 
    }
}


