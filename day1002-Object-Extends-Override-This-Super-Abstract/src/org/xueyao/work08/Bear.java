package org.xueyao.work08;
/**
 * @author Yao Xue
 * @date Jul 19, 2017 9:24:10 PM
 */
public class Bear extends Animal {
    
    
    public Bear() {
        super();
    }
    public Bear(String color, String numOfLeg) {
        super(color, numOfLeg);
    }
    public void eat() {
        System.out.println(getColor()+getNumOfLeg()+"条腿的北极熊会吃蜂蜜");
    }
    public void catchFish() {
        System.out.println(getColor()+getNumOfLeg()+"条腿的北极熊会抓鱼");
    }
}
