package org.xueyao.homework;
/**
 * @author Yao Xue
 * @date Jul 3, 2017 4:38:54 PM
 */
public class Phone {
    private String brand;
    private int price;
    //�޲ι��췽��
    public Phone() {
        
    }
    //���ι��췽��
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
    
    
    public void call() {
        System.out.println("����ʹ�ü۸�Ϊ"+price+"Ԫ��"+brand+"Ʒ�Ƶ��ֻ���绰...");
    }
    
    public void sendMessage() {
        System.out.println("����ʹ�ü۸�Ϊ"+price+"Ԫ��"+brand+"Ʒ�Ƶ��ֻ�������...");
    }
    
    public void playGame() {
        System.out.println("����ʹ�ü۸�Ϊ"+price+"Ԫ��"+brand+"Ʒ�Ƶ��ֻ�����Ϸ...");
    }
}
