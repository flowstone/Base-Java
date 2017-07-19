package org.xueyao.work06;
/**
 * i.   创建老虎对象 t,年龄赋值为2,腿的个数赋值为4;调用老虎对象t的eat()方法
    ii. 创建啄木鸟对象 p,年龄赋值为1,腿的个数赋值为2;调用啄木鸟对象p的eat()方法
    iii.    创建长颈鹿对象 g,年龄赋值为3,腿的个数赋值为4;调用长颈鹿对象g的eat()方法
    iv. 创建兔子对象 r,年龄赋值为1,,腿的个数赋值为4;调用兔子对象r的eat()方法

 * @author Yao Xue
 * @date Jul 19, 2017 8:59:28 PM
 */
public class Test {
    public static void main(String[] args) {
        new Tiger(2, 4).eat();
        new Pecker(1, 2).eat();
        new Giraffe(3, 4).eat();
        new Rabbit(1, 4).eat();
    }
}
