package org.xueyao.homework;
/**
 * 长方形类：
            属性：长、宽
            行为：获取周长的方法、获取面积的方法
 * @author Yao Xue
 * @date Jul 4, 2017 8:29:36 AM
 */
public class Rectangle {
    private double length;
    private double width;
    
    public Rectangle() {
        
    }
    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    //周长
    public void perimeter() {
        System.out.println("长为"+length+",宽度"+width+",周长是："+(length+width)*2);
    }
    
    public void area() {
        System.out.println("长为"+length+",宽度"+width+",周长是："+(length*width));
    }
}
