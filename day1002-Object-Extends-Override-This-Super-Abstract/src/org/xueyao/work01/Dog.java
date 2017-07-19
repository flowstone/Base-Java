package org.xueyao.work01;
/**
 * @author Yao Xue
 * @date Jul 19, 2017 7:50:57 PM
 */
public class Dog extends Animal{
    private String breed;
    
    public Dog() {}
    public Dog(String name, String color,String breed) {
        super(name, color);
        this.breed = breed;
    }
    
    public void setBreed(String breed) {
        this.breed = breed;
    }
    
    public String getBreed() {
        return breed;
    }
}
