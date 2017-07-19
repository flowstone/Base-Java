package org.xueyao.work09;
/**
 * @author Yao Xue
 * @date Jul 19, 2017 9:41:20 PM
 */
public class Car extends Traffic{
    
    public Car() {
        super();
    }

    public Car(int leg, String color) {
        super(leg, color);
    }

    @Override
    public void run() {
        System.out.println(getLeg()+"个轮子的"+getColor()+"的汽车开着跑");
    }
    
    //靠什么工作
    public void work() {
        System.out.println(getLeg()+"个轮子的"+getColor()+"的汽车加油");
    }
}
