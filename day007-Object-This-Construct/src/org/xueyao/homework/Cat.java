package org.xueyao.homework;
/**
 * 1.猫类Cat      
        属性:
            毛的颜色color
            品种breed
        行为:
            吃饭eat()
            抓老鼠catchMouse()
        狗特有行为:看家lookHome
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
        System.out.println(color+"的"+breed+"正在吃鱼.....");
    }
    public void catchMouse() {
        System.out.println(color+"的"+breed+"正在逮老鼠.....");
    }
    
}
