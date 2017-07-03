package org.xueyao_06;
/**
 * @author Yao Xue
 * @date Jul 3, 2017 4:18:42 PM
 */
public class Car {
    private String brand;
    private int price;
    private String color;
    
    
    
    public String getBrand() {
        return brand;
    }



    public void setBrand(String brand) {
        this.brand = brand;
    }



    public int getPrice() {
        return price;
    }



    public void setPrice(int price) {
        this.price = price;
    }



    public String getColor() {
        return color;
    }



    public void setColor(String color) {
        this.color = color;
    }



    public void run() {
        System.out.println("看我，我在跑");
    }
    
    
}
