package me.xueyao03.auntie;
/**
 * @description 保姆案例
 * @author Yao Xue
 * @date Jul 21, 2017 8:32:59 PM
 */
/*
 * 接口可以继承接口  extends
 * 接口可以多继承
 * 接口不属于java类继承体系，接口没有构造方法
 */
public class AuntieDemo {
    public static void main(String[] args) {
        Auntie a = new Auntie();
        
        a.changeTheDiaper();
        a.coaxTheBabyToSleep();
        a.feedTheBaby();
        a.teachBabyToSing();
    }
}

interface BabySitter {
    public abstract void feedTheBaby();
    public abstract void coaxTheBabyToSleep();
}

interface Singable {
    public abstract void teachBabyToSing();
}

interface GoodBabySitter extends BabySitter,Singable {
    public abstract void changeTheDiaper();
}

class Auntie implements GoodBabySitter,Singable {

    @Override
    public void feedTheBaby() {
        System.out.println("喂宝宝吃东西");
    }

    @Override
    public void coaxTheBabyToSleep() {
        System.out.println("哄宝宝睡觉");
    }

    @Override
    public void teachBabyToSing() {
        System.out.println("教宝宝唱歌");
    }

    @Override
    public void changeTheDiaper() {
        System.out.println("给宝宝换尿不湿");
    }
    
}
