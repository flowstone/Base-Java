package org.xueyao.homework;
/**
 * @author Yao Xue
 * @date Jul 3, 2017 4:38:54 PM
 */
public class Phone {
    private String brand;
    private int price;
    //无参构造方法
    public Phone() {
        
    }
    //带参构造方法
    public Phone(String brand, int price) {
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
    
    
    public void call() {
        System.out.println("正在使用价格为"+price+"元的"+brand+"品牌的手机打电话...");
    }
    
    public void sendMessage() {
        System.out.println("正在使用价格为"+price+"元的"+brand+"品牌的手机发短信...");
    }
    
    public void playGame() {
        System.out.println("正在使用价格为"+price+"元的"+brand+"品牌的手机玩游戏...");
    }
}
