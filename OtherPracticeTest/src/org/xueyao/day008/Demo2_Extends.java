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
 * Javaֻ֧�ֵ��̳У���֧�ֶ�̳С�(һ������ֻ����һ����)
 * ��̳��а�ȫ����
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
