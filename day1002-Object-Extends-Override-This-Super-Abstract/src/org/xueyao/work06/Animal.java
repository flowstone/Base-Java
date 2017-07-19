package org.xueyao.work06;
/**
 * @author Yao Xue
 * @date Jul 19, 2017 8:48:36 PM
 */
public abstract class Animal {
    private int age;
    private int numOfLeg;
    
    
    public Animal() {
        super();
    }


    public Animal(int age, int numOfLeg) {
        this.age = age;
        this.numOfLeg = numOfLeg;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public int getNumOfLeg() {
        return numOfLeg;
    }


    public void setNumOfLeg(int numOfLeg) {
        this.numOfLeg = numOfLeg;
    }


    public abstract void eat();
}
