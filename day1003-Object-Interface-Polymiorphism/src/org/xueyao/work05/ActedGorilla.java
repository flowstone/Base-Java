package org.xueyao.work05;
/**
 * @author Yao Xue
 * @date Jul 21, 2017 10:12:38 PM
 */
public class ActedGorilla extends Gorilla implements Actor{
    
    public ActedGorilla(){}
    public ActedGorilla(String color, int age) {
        super(color, age);
    }
    @Override
    public void play() {
        System.out.println(getAge()+"岁的"+getColor()+"大猩猩在表演骑自行车");
    }

}
