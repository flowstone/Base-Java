package org.xueyao.work09;
/**
 * 交通工具类
 * @author Yao Xue
 * @date Jul 19, 2017 9:39:33 PM
 */
public abstract  class Traffic {
    private int leg;
    private String color;
    
    public Traffic() {
        super();
    }

    public Traffic(int leg, String color) {
        this.leg = leg;
        this.color = color;
    }

    public int getLeg() {
        return leg;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void run();
}
