package org.xueyao.work08;
/**
 * @author Yao Xue
 * @date Jul 19, 2017 9:21:38 PM
 */
public class Animal {
    private String color;
    private String numOfLeg;
    
    public Animal() {
        super();
    }

    public Animal(String color, String numOfLeg) {
        this.color = color;
        this.numOfLeg = numOfLeg;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNumOfLeg() {
        return numOfLeg;
    }

    public void setNumOfLeg(String numOfLeg) {
        this.numOfLeg = numOfLeg;
    }

    public void eat() {
        System.out.println("吃东西");
    }
    
}
