package org.xueyao.homework;
/**
 * ����Dog
        ����:
            ë����ɫcolor
            Ʒ��breed
        ��Ϊ:
            �Է�()
            ����lookHome()
 * @author Yao Xue
 * @date Jul 3, 2017 5:45:00 PM
 */
public class Dog {
    private String color;
    private String breed;
    public Dog() {
        
    }
    public Dog(String color, String breed) {
        super();
        this.color = color;
        this.breed = breed;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    
    public void eat() {
        System.out.println(color+"��"+breed+"���ڿй�ͷ.....");

    }
    
    public void lookHome() {
        System.out.println(color+"��"+breed+"���ڿ���.....");

    }
    
}
