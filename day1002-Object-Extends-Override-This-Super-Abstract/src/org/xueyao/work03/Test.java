package org.xueyao.work03;
/**
 * 4. 定义Test类   
    c)  提供main方法
    d)  在main方法中
    i.  创建公鸡对象c,并把颜色赋值为”红色”,年龄赋值为2
    ii. 调用公鸡对象c的吃饭方法
    iii.    调用公鸡对象c的打鸣方法
    iv. 创建鸭子对象 d,并把颜色赋值为”黑色”,年龄赋值为1.
    v.  调用鸭子对象 d 的吃饭方法
    vi. 调用鸭子对象 d 的游泳方法

 * @author Yao Xue
 * @date Jul 19, 2017 8:26:06 PM
 */
public class Test {
    public static void main(String[] args) {
        Cock c = new Cock("红色", 2);
        c.eat();
        c.crow();
        
        Duck d = new Duck("黑色", 1);
        d.eat();
        d.swim();
    }
}
