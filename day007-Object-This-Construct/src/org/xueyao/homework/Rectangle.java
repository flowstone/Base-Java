package org.xueyao.homework;
/**
 * �������ࣺ
            ���ԣ�������
            ��Ϊ����ȡ�ܳ��ķ�������ȡ����ķ���
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
    //�ܳ�
    public void perimeter() {
        System.out.println("��Ϊ"+length+",���"+width+",�ܳ��ǣ�"+(length+width)*2);
    }
    
    public void area() {
        System.out.println("��Ϊ"+length+",���"+width+",�ܳ��ǣ�"+(length*width));
    }
}
