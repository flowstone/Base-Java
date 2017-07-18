package org.xueyao.day009;
/**
 * @author Yao Xue
 * @date Jul 18, 2017 9:27:34 AM
 */
public class Demo3_SuperMan {
    public static void main(String[] args) {
        Person person = new SuperMan();
        System.out.println(person.name);
        person.talk();
        //person.fly();
        
        SuperMan superMan = (SuperMan)person; //����ת��
        superMan.fly();
    }
}

class Person {
    String name = "John";
    
    public void talk() {
        System.out.println("̸����");
    }
}

class SuperMan extends Person {
    String name = "superMan";
    public void talk() {
        System.out.println("̸�����ڵĴ���");
    }
    
    public void fly() {
        System.out.println("�ɳ�ȥ����");
    }
}
