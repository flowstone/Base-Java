package org.xueyao.work05;
/**
 * @author Yao Xue
 * @date Jul 21, 2017 10:17:07 PM
 */
public class ActedParrot extends Parrot implements Actor{
    
    public ActedParrot(){}
    public ActedParrot(String color, int age) {
        super(color,age);
    }
    @Override
    public void play() {
        System.out.println(getAge()+"岁的"+getColor()+"鹦鹉在表演过跷跷板");
    }
    
}
