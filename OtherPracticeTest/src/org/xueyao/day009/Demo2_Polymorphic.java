package org.xueyao.day009;
/**
 * @author Yao Xue
 * @date Jul 17, 2017 2:20:21 PM
 */
public class Demo2_Polymorphic {
    public static void main(String[] args) {
        Father f = new Son();
        System.out.println(f.num);
    }
}

class Father {
    int num = 10;
}

class Son extends Father {
    int num = 20;
}
