package org.xueyao.work07;
/**
 * 1. 定义衣服类(Clothes)
    a)  成员变量:
    i.  颜色(color)
    ii. 品牌(brand)
    b)  提供 无参,带参构造和setXxx和getXxx方法

 * @author Yao Xue
 * @date Jul 19, 2017 9:02:32 PM
 */
public class Clothes {
    private String color;
    private String brand;
    public Clothes() {
        super();
    }
    public Clothes(String color, String brand) {
        this.color = color;
        this.brand = brand;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    
}
