package org.xueyao02.interfaced;
/**
 * @author Yao Xue
 * @date Jul 21, 2017 9:15:36 AM
 */
public class Demo {
    public static void main(String[] args) {
        
        Dog dog = new Dog();
        dog.name = "哮天犬";
        dog.shout();
        dog.eat();
        dog.run();
        
        Cat c = new Cat();
        c.name = "波斯猫";
        c.shout();
        c.eat();
        c.run();
        
        Wolf wolf = new Wolf();
        wolf.name = "灰太狼";
        wolf.shout();
        wolf.eat();
        wolf.run();
        
        //接口与多态;
        //接口类型可以接收实现了该接口的实现类对象
        blind(dog);
        
        blind(c);
        
        drug(dog);
        drug(wolf);
    }
    
    //导盲
    public static void blind(Guideable g) {
        g.blindGuiding();
    }
    
    //缉毒
    public static void drug(DrugDetectable d) {
        d.drugDetection();
    }
}
