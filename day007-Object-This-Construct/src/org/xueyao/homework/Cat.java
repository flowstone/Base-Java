package org.xueyao.homework;
/**
 * 1.è��Cat      
        ����:
            ë����ɫcolor
            Ʒ��breed
        ��Ϊ:
            �Է�eat()
            ץ����catchMouse()
        ��������Ϊ:����lookHome
 * @author Yao Xue
 * @date Jul 3, 2017 5:44:38 PM
 */
public class Cat {
    private String color;
    private String breed;
    
    public Cat() {}
    public Cat(String color, String breed) {
        this.color = color;
        this.breed = breed;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    
    public void setBreed(String breed) {
        this.breed = breed;
    }
    
    public String getBreed() {
        return breed;
    }
    
    public void eat() {
        System.out.println(color+"��"+breed+"���ڳ���.....");
    }
    public void catchMouse() {
        System.out.println(color+"��"+breed+"���ڴ�����.....");
    }
    
}
