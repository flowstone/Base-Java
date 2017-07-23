package org.xueyao.work06;
/**
 * @author Yao Xue
 * @date Jul 22, 2017 12:19:37 AM
 */
public class BattlePlane extends Plane implements Battle{

    @Override
    public void fire() {
        System.out.println("我是战斗机，我会发导弹");
    }

    @Override
    public void fly() {
        System.out.println("我是战斗机，我会飞");
    }

}
