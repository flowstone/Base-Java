package org.xueyao03.constructor;
/**
 * @author Yao Xue
 * @date Jul 19, 2017 5:33:20 PM
 */
public class Demo {
    public static void main(String[] args) {
        new Son();
    }
}

class Father {
    public Father() {
        System.out.println("Father 构造方法被调用  ...");
    }
    
}

class Son extends Father {
    public Son() {
        System.out.println("Son 构造方法被调用");
    }
}