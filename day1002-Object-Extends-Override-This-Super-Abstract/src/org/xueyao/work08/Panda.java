package org.xueyao.work08;
/**
 * @author Yao Xue
 * @date Jul 19, 2017 9:30:05 PM
 */
public class Panda extends Animal{
    
    public Panda() {
        super();
    }

    public Panda(String color, String numOfLeg) {
        super(color, numOfLeg);
    }

    public void eat() {
        System.out.println(getColor()+getNumOfLeg()+"条腿的大熊猫会吃吃竹子");
    }
    
    public void climbTree() {
        System.out.println(getColor()+getNumOfLeg()+"条腿的大熊猫会爬树");
    }
}
