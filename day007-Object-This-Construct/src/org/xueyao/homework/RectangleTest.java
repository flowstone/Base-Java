package org.xueyao.homework;
/**
 * 测试类：
            测试长方形类中的每一个方法
 * @author Yao Xue
 * @date Jul 4, 2017 8:39:52 AM
 */
public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(12);
        rectangle.setWidth(3);
        rectangle.perimeter();
        rectangle.area();
        
        Rectangle rectangle2 = new Rectangle(12, 3);
        rectangle2.perimeter();
        rectangle2.area();
    }
}
