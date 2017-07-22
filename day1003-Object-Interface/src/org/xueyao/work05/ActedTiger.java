package org.xueyao.work05;
/**
 * @author Yao Xue
 * @date Jul 21, 2017 10:07:47 PM
 */
public class ActedTiger extends Tiger implements Actor{
    
    public ActedTiger(){}
    public ActedTiger(String color, int age) {
        super(color,age);
    }
    @Override
    public void play() {
        System.out.println(getAge()+"岁的"+getColor()+"老虎在表演钻火圈");
    }

}
