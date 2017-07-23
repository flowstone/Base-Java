package org.xueyao02.staticd;
/**
 * @author Yao Xue
 * @date Jul 22, 2017 10:19:40 AM
 */
public class Calculator {
    private  String color;
    private int price;
    
    public Calculator(){}
    public Calculator(String color, int price) {
        this.color = color;
        this.price = price;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public String getColor() {
        return this.color;
    }
    
    public void setPrice(int price) {
        if (price >= 0) {
            this.price = price;
        } else {
            this.price = 0;
        }
        
    }
    
    public int getPrice() {
        return this.price;
    }
    
    public static int getSum(int num1, int num2) {
        return num1 + num2;
    }
}
