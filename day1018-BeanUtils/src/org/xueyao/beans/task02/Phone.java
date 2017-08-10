package org.xueyao.beans.task02;
/**
 * 1.   定义一个Phone类，要求：
属性：品牌、颜色、价格、屏幕尺寸
方法：无参构造方法、全参构造方法，get/set方法。

 * @author Yao Xue
 * @date Aug 10, 2017 7:04:30 PM
 */
public class Phone {
    private String brand;
    private String color;
    private float price;
    private float size;
    public Phone() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Phone(String brand, String color, float price, float size) {
        super();
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.size = size;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public float getSize() {
        return size;
    }
    public void setSize(float size) {
        this.size = size;
    }
    
    
}
