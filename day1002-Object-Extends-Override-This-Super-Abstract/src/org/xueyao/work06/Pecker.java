package org.xueyao.work06;
/**
 * @author Yao Xue
 * @date Jul 19, 2017 8:56:07 PM
 */
public class Pecker extends Carnivore{

    public Pecker() {
        super();
    }

    public Pecker(int age, int numOfLeg) {
        super(age, numOfLeg);
    }

    @Override
    public void eat() {
        System.out.println("年龄为 "+getAge()+"的"+getNumOfLeg()+"条腿的啄木鸟的在吃昆虫");
    }

}
