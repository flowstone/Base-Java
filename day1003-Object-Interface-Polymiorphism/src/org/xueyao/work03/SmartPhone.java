package org.xueyao.work03;
/**
 * @description 智能手机(SmartPhone)类继承手机类(Phone),实现玩游戏接口(PlayGame())
 * @author Yao Xue
 * @date Jul 21, 2017 9:28:21 PM
 */
public class SmartPhone extends Phone implements PlayGame{

    public SmartPhone(){}
    public SmartPhone(String brand, int price) {
        super(brand,price);
    }
    @Override
    public void playGame() {
        System.out.println("在使用"+getPrice()+"元的 "+getBrand()+" 手机玩游戏");
    }
    
}
