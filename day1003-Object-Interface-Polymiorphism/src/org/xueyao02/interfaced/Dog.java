package org.xueyao02.interfaced;
/**
 * @author Yao Xue
 * @date Jul 21, 2017 8:53:20 AM
 */
public class Dog extends Animal implements Guideable,DrugDetectable{

    @Override
    public void drugDetection() {
        System.out.println(name + "正在执行的功能...");
    }

    @Override
    public void blindGuiding() {
        System.out.println("经过"+Guideable.YEARS+"年的训练,"+name+"正在执行导盲的任务...");
    }

    @Override
    public void shout() {
        System.out.println("汪汪汪....");
    }

    @Override
    public void eat() {
        System.out.println("跟我混，有骨头吃...");
    }
    
    
}
