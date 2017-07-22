package org.xueyao.work07;
/**
 * @author Yao Xue
 * @date Jul 22, 2017 8:22:27 AM
 */
public class ActingCuteCat extends Cat implements Actor{

    public ActingCuteCat(){}
    public ActingCuteCat(String color,int age) {
        super(color, age);
    }
    @Override
    public void actingCute() {
        System.out.println(getAge()+"岁"+getColor()+"的猫喜欢卖萌");
    }

}
