package org.xueyao.work03;
/**
 * @description 平板(Pad)类,实现PlayGame接口
 * @author Yao Xue
 * @date Jul 21, 2017 9:31:25 PM
 */
public class Pad implements PlayGame{
    private String brand;
    private int price;
    
    public Pad(){}
    public Pad(String brand, int price) {
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
        System.out.println("在使用"+price+"元的"+brand+"平板玩游戏");
    }
    
    public void listenMusic() {
        System.out.println("在使用"+price+"元的"+brand+"平板听音乐");
    }
}
