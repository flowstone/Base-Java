package org.xueyao.homework;
/**
 * è�����������
 * @author Yao Xue
 * @date Jul 4, 2017 7:59:09 AM
 */
public class CatDogTest {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setBreed("��˹è");
        cat.setColor("��ɫ");
        cat.eat();
        cat.catchMouse();
        
        Dog dog = new Dog();
        dog.setBreed("����");
        dog.setColor("��ɫ");
        dog.eat();
        dog.lookHome();
        
        System.out.println("-------------");
        
        Cat cat2 = new Cat("��˹è","��ɫ");
        cat2.eat();
        cat2.catchMouse();
        
        Dog dog2 = new Dog("����","��ɫ");
        dog2.eat();
        dog2.lookHome();
    }
}
