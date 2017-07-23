package org.xueyao03.interfaced;
/**
 * @description 阿姨类
 * @author Yao Xue
 * @date Jul 21, 2017 9:41:34 AM
 */
public class Auntie implements GoodBabySitter,Singable{

    @Override
    public void feedTheBaby() {
        System.out.println("保姆阿姨正在喂宝宝吃东西.");
    }

    @Override
    public void coaxTheBabyToSleep() {
        System.out.println("保姆阿姨正在哄宝宝睡觉.");
        
    }

    @Override
    public void teachBabyToSing() {
        System.out.println("保姆阿姨正在教宝宝唱儿歌");
    }

    @Override
    public void changeTheDiaper() {
        System.out.println("保姆阿姨正在给宝宝换尿不湿");
    }
    
    public void laugh() {
        System.out.println("保姆阿姨正在和宝宝一起大笑");
    }

}
