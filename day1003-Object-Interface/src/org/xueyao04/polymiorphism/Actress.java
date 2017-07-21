package org.xueyao04.polymiorphism;
/**
 * @description 女演员
 * @author Yao Xue
 * @date Jul 21, 2017 10:32:00 AM
 */
public class Actress extends Person{
    
    @Override
    public void doSomething() {
        System.out.println(getName()+"立即停止的表演.");
    }
}
