package org.xueyao.work05;
/**
 * 4. 定义Test类   
    a)  提供main方法
    b)  在main方法中
    i.  创建Dog对象d,并把颜色赋值为”黑色”,腿的个数赋值为4
    ii. 调用Dog对象d的吃饭方法
    iii.    调用Dog对象d的看家方法
    iv. 创建Porrot对象 p,并把颜色赋值为”绿色”,腿的个数赋值为2.
    v.  调用Porrot对象 p 的吃饭方法
    vi. 调用Porrot对象 p 的说话方法

 * @author Yao Xue
 * @date Jul 19, 2017 8:44:35 PM
 */
public class Test {
    public static void main(String[] args) {
        Dog d = new Dog("黑色", 4);
        d.eat();
        d.lookHome();
        
        Parrot p = new Parrot("绿色", 2);
        p.eat();
        p.say();
    }
}
