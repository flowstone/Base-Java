package org.xueyao.day008;
/**
 * @author Yao Xue
 * @date Jul 14, 2017 5:05:41 PM
 */
public class Demo1_Extends {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.color = "��";
        cat.leg = 4;
        cat.eat();
        cat.sleep();
    }
}

class Animal {
    String color;  //��ɫ 
    int leg;     //�ȵĸ��� 
    
    public void eat() {
        System.out.println("�Է�");
    }
    
    public void sleep() {
        System.out.println("˯��");
    }
}
class Cat extends Animal{
    /*String color;  //��ɫ 
    int leg;     //�ȵĸ��� 
    
    public void eat() {
        System.out.println("�Է�");
    }
    
    public void sleep() {
        System.out.println("˯��");
    }*/
}

class Dog extends Animal {
   /* String color;  //��ɫ 
    int leg;     //�ȵĸ��� 
    
    public void eat() {
        System.out.println("�Է�");
    }
    
    public void sleep() {
        System.out.println("˯��");
    }*/
}
