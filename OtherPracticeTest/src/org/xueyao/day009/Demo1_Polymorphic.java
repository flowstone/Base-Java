package org.xueyao.day009;
/**
 * @author Yao Xue
 * @date Jul 17, 2017 8:30:08 AM
 */
public class Demo1_Polymorphic {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        
        Animal a = new Cat(); //��������ָ���������
    }
}


class Animal {
    public void eat() {
        System.out.println("����Է�");
    }
    
}

class Cat extends Animal {
    public void eat() {
        System.out.println("è����");
    }
}