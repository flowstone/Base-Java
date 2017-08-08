package org.xueyao.annotation.task04;
/**
 * @author Yao Xue
 * @date Aug 7, 2017 7:25:56 PM
 */
public class Student {
    @MyTest
    public void say() {
        System.out.println("正在说话");
    }
    @MyBefore
    public void eat() {
        System.out.println("正在吃饭");
    }
    @MyAfter
    public void paly() {
        System.out.println("正在打豆豆");
    }
}
