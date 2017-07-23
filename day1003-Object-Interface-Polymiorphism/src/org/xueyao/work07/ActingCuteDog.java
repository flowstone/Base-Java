package org.xueyao.work07;
/**
 * @author Yao Xue
 * @date Jul 22, 2017 8:27:08 AM
 */
public class ActingCuteDog extends Dog implements Actor{
    public ActingCuteDog(){}
    public ActingCuteDog(String color, int age) {
        super(color, age);
    }
    @Override
    public void actingCute() {
        System.out.println(getAge()+"岁"+getColor()+"的狗喜欢卖萌");
    }


}
