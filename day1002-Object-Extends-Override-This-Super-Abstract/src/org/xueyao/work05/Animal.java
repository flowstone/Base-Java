package org.xueyao.work05;
/**
 * 1. 定义抽象类 动物类(Animal)
    i.  成员变量(私有):  颜色(color),腿的个数(numOfLegs)
    ii. 抽象方法:  吃饭(void eat())
    iii.    提供空参和带参构造方法
    iv. 提供setXxx和getXxx方法

 * @author Yao Xue
 * @date Jul 19, 2017 8:38:26 PM
 */
public abstract class Animal {
    private String color;
    private int numOfLegs;
    
    
    public Animal() {
        super();
        // TODO Auto-generated constructor stub
    }
    

    public Animal(String color, int numOfLegs) {
        super();
        this.color = color;
        this.numOfLegs = numOfLegs;
    }
    

    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }


    public int getNumOfLegs() {
        return numOfLegs;
    }


    public void setNumOfLegs(int numOfLegs) {
        this.numOfLegs = numOfLegs;
    }


    public abstract void eat();
}
