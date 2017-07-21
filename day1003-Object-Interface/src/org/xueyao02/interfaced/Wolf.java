package org.xueyao02.interfaced;
/**
 * @author Yao Xue
 * @date Jul 21, 2017 8:59:03 AM
 */
public class Wolf extends Animal implements DrugDetectable {

    @Override
    public void drugDetection() {
        System.out.println(name + "正在执行缉毒的功能...");
    }

    @Override
    public void shout() {
        System.out.println("嗷嗷嗷...");
    }

    @Override
    public void eat() {
        System.out.println("跟我混，有肉吃...");
    }
    
   
}
