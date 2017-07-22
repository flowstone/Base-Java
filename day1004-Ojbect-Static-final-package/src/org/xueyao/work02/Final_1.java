package org.xueyao.work02;
/**
 * 验证：final修饰类不可以被继承，但是可以继承其他类
 * @author Yao Xue
 * @date Jul 22, 2017 8:24:32 PM
 */
public class Final_1 {
    
}

//验证：被final的修饰类可以继承其他类
final class FinalClass extends Final_1 {
    
}
/*
class Sub extends FinalClass {
    
}
被final修饰的类不能被继承
*/