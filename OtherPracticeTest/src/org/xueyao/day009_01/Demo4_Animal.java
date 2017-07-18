package org.xueyao.day009_01;
/**
 * @author Yao Xue
 * @date Jul 18, 2017 10:37:24 AM
 */
public class Demo4_Animal {
    public static void main(String[] args) {
        //Cat cat = new Cat();
        //cat.eat();
        method(new Cat());
        method(new Dog());
        
        //������ʱ������ڴ��������ʱ���ø������� ָ���������ֱ�Ӵ��������������㣬����ʹ���������������Ժ���Ϊ
        Animal a = new Dog(); 
    }
    
   /* public static void method(Cat c) {
        c.eat();
    }
    
    public static void method(Dog d) {
        d.eat();
    }*/
    
    //����ѹ�ǿת��è�ͻ��������ת���쳣��ClassCastException
    public static void method(Animal a) { //����������ʱ���ö�̬��ã���Ϊ��չ��ǿ
        //a.eat();
        //�ؼ��� instanceof �ж�ǰ�ߵ������Ƿ��Ǻ�ߵ���������
        if (a instanceof Cat) {
            Cat cat = (Cat) a;
            cat.eat();
            cat.catchMouse();
        } else if (a instanceof Dog) {
            Dog dog = (Dog) a;
            dog.eat();
            dog.lookHome();
        } else {
            a.eat();
        }
    }
}
/*
 * A����̬�ĺô�
 *      a:����˴����ά����(�̳б�֤)
 *      b:����˴������չ��(�ɶ�̬��֤)
 * B��������ʾ
 *      ��̬�ĺô�
 *      ���Ե�����ʽ���������Խ��������������
 * C:��̬�ı׶�
 *      ����ʹ������ ���������Ժ���Ϊ��     
 */

class Animal {
    public void eat() {
        System.out.println("����Է�");
    }
}

class Cat extends Animal {
    public void eat() {
        System.out.println("è����");
    }
    
    public void catchMouse() {
        System.out.println("ץ����");
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("������");
    }
    
    public void lookHome() {
        System.out.println("������");
    }
}