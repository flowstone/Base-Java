package org.xueyao.work06;
/**
 * @author Yao Xue
 * @date Jul 19, 2017 8:53:03 PM
 */
public class Tiger extends Carnivore{
    
    public Tiger() {
        super();
    }

    public Tiger(int age, int numOfLeg) {
        super(age, numOfLeg);
    }

    @Override
    public void eat() {
        System.out.println("年龄为 "+getAge()+"的"+getNumOfLeg()+"条腿的老虎在吃羊");
    }
    
}
