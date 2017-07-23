package org.xueyao.work01;
/**
 * @description 电脑类实现玩游戏接口
 * @author Yao Xue
 * @date Jul 21, 2017 9:00:18 PM
 */
public class Computer implements PlayGame{
    private String brand;
    private int price;
    
    public Computer(){}
    public Computer(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }
    
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }
    
    public void setPrice(int price) {
        this.price = price;
    }
    
    public int getPrice() {
        return price;
    }
    @Override
    public void playGame() {
        System.out.println("使用"+price+"元的"+brand+"电脑玩游戏");
    }
    
    public void coding() {
        System.out.println("使用"+price+"元的"+brand+"电脑开发JavaEE应用");
    }

}
