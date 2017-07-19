package org.xueyao.work07;
/**
 * 定义Girl类,继承Person类
    a)  成员变量
    i.  脸型(String face)
    b)  成员方法: 
    i.  重写父类的  void say(String content) 方法
    1.  输出格式: 欧阳青青微笑着用于甜美的声音对慕容紫英说:有你在我就安心.
    ii. 特有方法: 洗衣服 wash(Clothes c) 
    输出格式: 欧阳青青在洗一件白色的李宁牌子的衣服
    c)  要求:
    i.  提供无参和带参构造
    ii. 提供setXxx和getXxx方法

 * @author Yao Xue
 * @date Jul 19, 2017 9:06:01 PM
 */
public class Girl extends Person{
    private String face;
    
    public Girl() {
        super();
    }

    public Girl(String name, int age, double height, String face) {
        super(name, age, height);
        this.face = face;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    @Override
    public void say(String content) {
        //TODO   
        System.out.println(getName()+"微笑着用于甜美的声音对慕容紫英说:"+content);
    }
    
    public void wash(Clothes c) {
        System.out.println(getName()+"在洗一件"+c.getColor()+"的"+c.getBrand()+"牌子的衣服");
    }

}
