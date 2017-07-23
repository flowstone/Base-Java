package org.xueyao.work02;
/**
 * 修饰成员变量，需要在创建对象前赋值，否则报错
 * @author Yao Xue
 * @date Jul 22, 2017 8:49:48 PM
 */
public class Final_5 {
    final int a = 10;
    final int b;
    
    public Final_5() {
        b = 20;
    }
    
    public Final_5(int a, int b) {
        
        this.b = b;
        //被final修饰成员变量只能赋值一次
        //this.a = a;
    }
}
