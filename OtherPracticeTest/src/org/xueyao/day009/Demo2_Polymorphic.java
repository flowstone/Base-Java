package org.xueyao.day009;
/**
 * ��Ա����
 * ���뿴���(����)�����п����(����)
 * 
 * ��Ա����
 * ���뿴���(����)�����п��ұ�(����)�� ��̬��
 * 
 * ��̬����
 * ���뿴���(����)�����п����(����)
 * (��̬������أ��㲻����д�����ԣ����ʻ������)
 * ֻ�зǾ�̬�ĳ�Ա���������뿴��ߣ����п��ұ�
 * 
 * @author Yao Xue
 * @date Jul 17, 2017 2:20:21 PM
 */
public class Demo2_Polymorphic {
    public static void main(String[] args) {
        Father f = new Son();
        f.print();
        //System.out.println(f.num);
        //f.method();  Father.method();
    }
}

class Father {
    int num = 10;
    public void print() {
        System.out.println("father");
    }
    public static void method() {
        System.out.println("father static method");
    }
}

class Son extends Father {
    int num = 20;
    public void print() {
        System.out.println("son");
    }
    
    public static void method() {
        System.out.println("son static method");
    }
}
