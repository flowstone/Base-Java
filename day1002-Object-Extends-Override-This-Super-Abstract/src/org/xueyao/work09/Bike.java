package org.xueyao.work09;
/**
 * @author Yao Xue
 * @date Jul 19, 2017 9:45:47 PM
 */
public class Bike extends Traffic{

    public Bike() {
        super();
    }

    public Bike(int leg, String color) {
        super(leg, color);
    }

    @Override
    public void run() {
        System.out.println(getLeg()+"个轮子的"+getColor()+"电动自行车骑着跑");
    }
    
    //靠什么工作
    public void work() {
        System.out.println(getLeg()+"个轮子的"+getColor()+"电动自行车充电");
    }
}
