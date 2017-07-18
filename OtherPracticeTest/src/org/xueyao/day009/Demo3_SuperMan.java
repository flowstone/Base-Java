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
        
        SuperMan superMan = (SuperMan)person; //向下转型
        superMan.fly();
    }
}

class Person {
    String name = "John";
    
    public void talk() {
        System.out.println("谈生意");
    }
}

class SuperMan extends Person {
    String name = "superMan";
    public void talk() {
        System.out.println("谈几个亿的大单子");
    }
    
    public void fly() {
        System.out.println("飞出去救人");
    }
}
