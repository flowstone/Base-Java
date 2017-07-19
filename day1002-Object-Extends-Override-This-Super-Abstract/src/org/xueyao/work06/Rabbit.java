package org.xueyao.work06;
/**
 * @author Yao Xue
 * @date Jul 19, 2017 8:58:30 PM
 */
public class Rabbit extends Herbivore{

    
    public Rabbit() {
        super();
    }

    public Rabbit(int age, int numOfLeg) {
        super(age, numOfLeg);
    }

    @Override
    public void eat() {
        System.out.println("年龄为 "+getAge()+"的"+getNumOfLeg()+"条腿的兔子在吃狗尾草");

    }

}
