package org.xueyao.day009_02;
/**
 * @author Yao Xue
 * @date Jul 18, 2017 11:34:14 AM
 */
public class Demo2_Abstract {
    public static void main(String[] args) {
        
    }
}

/*
 * ������ĳ�Ա�ص㣺
 *      ��Ա�������ȿ����Ǳ�����Ҳ�����ǳ�����abstract�������γ�Ա����
 *      ���췽������
 *          �������� ���ʸ������ݵĳ�ʼ��
 *      ��Ա�������ȿ����ǳ���ģ�Ҳ�����Ƿǳ����
 * ������ĳ�Ա�������ԣ�
 *      ���󷽷�  ǿ��Ҫ��������������
 *      �ǳ��󷽷�  ����̳е����飬��ߴ��븴���ԡ�
 */
abstract class Demo {
    int num1 = 10;
    final int num2 = 20;
    
    public Demo(){}
    
    public void print() {
        System.out.println("111");
    }
    
    public abstract void method();
}

class Test extends Demo {

    @Override
    public void method() {
        // TODO Auto-generated method stub
        System.out.println("1111");
    }
    
}