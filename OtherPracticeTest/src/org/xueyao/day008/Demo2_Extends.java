package org.xueyao.day008;
/**
 * @author Yao Xue
 * @date Jul 14, 2017 5:21:18 PM
 */
public class Demo2_Extends {
    public static void main(String[] args) {
        DemoC demoC = new DemoC();
    }
}

/**
 * Java只支持单继承，不支持多继承。(一个儿子只能有一个爹)
 * 多继承有安全隐患
 * 
 */

class DemoA {
    public void show() {
        System.out.println("DemoA");
    }
}
class DemoB {
    public void show() {
        System.out.println("DemoB");
    }
}
class DemoC extends DemoA{
    public void show() {
        System.out.println("DemoC");
    }
}
