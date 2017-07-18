package org.xueyao.day009_02;
/**
 * @author Yao Xue
 * @date Jul 18, 2017 11:15:23 AM
 */
public class Demo1_Abstract {
    public static void main(String[] args) {
        //Animal animal = new Animal();
        Cat cat = new Cat();
        cat.eat();
    }
}

/*
 * �������ص�
 *      a:������ͳ��󷽷�������abstract�ؼ�������
 *          abstract class ����()
 *          public abstract void eat();
 *      b:�����಻һ���г��󷽷����г��󷽷�����һ���ǳ���������ǽӿ�
 *      c:�����಻��ʵ������ô�����������ʵ�����أ�
 *          ���ն�̬�ķ�ʽ���ɾ��������ʵ��������ʵ��Ҳ�Ƕ�̬��һ�֣��������̬
 *      d:�����������
 *          Ҫô�ǳ�����
 *          Ҫô��д�������е����г��󷽷�
 */

abstract class Animal {    //������
    public abstract void eat();   //���󷽷�
}

class Cat extends Animal {

    @Override
    public void eat() {
        // TODO Auto-generated method stub
        System.out.println("è����");
    }
    
}
