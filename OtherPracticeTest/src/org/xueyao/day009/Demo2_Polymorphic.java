package org.xueyao.day009;
/**
 * ��Ա����
 * ���뿴���(����)�����п����(����)
 * 
 * ��Ա����
 * ���뿴���(����)�����п��ұ�(����)�� ��̬��
 * @author Yao Xue
 * @date Jul 17, 2017 2:20:21 PM
 */
public class Demo2_Polymorphic {
    public static void main(String[] args) {
        Father f = new Son();
        f.print();
        //System.out.println(f.num);
    }
}

class Father {
    int num = 10;
    public void print() {
        System.out.println("father");
    }
}

class Son extends Father {
    int num = 20;
    public void print() {
        System.out.println("son");
    }
}
