package org.xueyao.day008;
/**
 * @author Yao Xue
 * @date Jul 14, 2017 5:28:31 PM
 */
public class Demo3_Extends {
    public static void main(String[] args) {
        Son son = new Son();
        son.show();
    }
}
/**
 * �̳е�ע������
 *   ����ֻ�ܼ̳и������з�˽�еĳ�Ա(��Ա�����ͳ�Ա����)
 *   ���಻�ܼ̳и���Ĺ��췽�������ǿ���ͨ��super()���ؼ���ȥ���ʸ��๹�췽��
 *   ��ҪΪ�˲��ֹ��ܶ�ȥ�̳�
 * */

class Father {
    public void show() {
        System.out.println("Hello World");
    }
}

class Son extends Father {
    
}
