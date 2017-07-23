package org.xueyao02.interfaced;
/**
 * @author Yao Xue
 * @date Jul 21, 2017 8:56:33 AM
 */
public class Cat extends Animal implements Guideable{

    @Override
    public void blindGuiding() {
        System.out.println("经过"+Guideable.YEARS+"年的训练,"+name+"正在执行导盲的任务...");
    }

    @Override
    public void shout() {
        System.out.println("喵喵喵....");

    }

    @Override
    public void eat() {
        System.out.println("跟我混，有鱼吃...");

    }

    
    
}
