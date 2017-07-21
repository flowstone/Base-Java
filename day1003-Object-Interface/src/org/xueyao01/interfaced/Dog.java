package org.xueyao01.interfaced;
/**
 * @author Yao Xue
 * @date Jul 21, 2017 8:33:09 AM
 */
//定义一个Dog类，继承自Animal类，并实现了Guidable接口
public class Dog extends Animal implements Guidable{
    //实现Guidable接口中的抽象方法
    @Override
    public void bindGuilding() {
        System.out.println("汪汪汪...");
    }

    @Override
    public void shout() {
        System.out.println("跟我混，我骨头吃...");
    }

    @Override
    public void eat() {
        System.out.println("经过"+Guidable.YEARS+"年的训练，Dog类具体了导盲的功能...");
    }
    
    
}
