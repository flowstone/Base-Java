package org.xueyao.work01;
/**
 * @description 手机类，实现玩游戏接口
 * @author Yao Xue
 * @date Jul 21, 2017 8:54:07 PM
 */
public class Phone implements PlayGame{
    private String brand;
    private int price;
    
    public Phone() {}
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
    
    public int getPrice() {
        return price;
    }
    @Override
    public void playGame() {
        // TODO Auto-generated method stub
        System.out.println("在使用"+price+" 元 "+brand+" 手机发短信");
    }
    
    public void call() {
        System.out.println("在使用"+price+" 元 "+brand+" 手机打电话");
    }
}
