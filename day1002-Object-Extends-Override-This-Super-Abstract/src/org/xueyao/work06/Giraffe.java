package org.xueyao.work06;
/**
 * @author Yao Xue
 * @date Jul 19, 2017 8:57:28 PM
 */
public class Giraffe extends Herbivore{

    public Giraffe() {
        super();
    }

    public Giraffe(int age, int numOfLeg) {
        super(age, numOfLeg);
    }

    @Override
    public void eat() {
        System.out.println("年龄为 "+getAge()+"的"+getNumOfLeg()+"条腿的长颈鹿在吃树叶");

    }

}
