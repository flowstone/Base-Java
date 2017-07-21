package org.xueyao04.polymiorphism;
/**
 * @description 理发师
 * @author Yao Xue
 * @date Jul 21, 2017 10:30:55 AM
 */
public class Barber extends Person{
    
    @Override
    public void doSomething() {
        System.out.println(getName()+"正在给顾客认真细致的剪发");
        
    }
}
