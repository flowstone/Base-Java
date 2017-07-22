package org.xueyao.work03;
/**
 * @author Yao Xue
 * @date Jul 21, 2017 9:23:17 PM
 */
public class Phone {
    private String brand;
    private int price;
    
    public Phone(){}
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
    
    public void call(String name) {
        System.out.println("在使用"+price+" 元 "+brand+" 手机 给 "+name+" 打电话");
    }
    
    public void sendMessage(String name) {
        System.out.println("在使用"+price+" 元 "+brand+" 手机 给 "+name+" 发短信");

    }
    
    
}
