package org.xueyao.day008_04;
/**
 * @author Yao Xue
 * @date Jul 14, 2017 7:18:38 PM
 */
public class Demo7_Phone {
    public static void main(String[] args) {
        Ios8 ios8 = new Ios8();
        ios8.siri();
        ios8.call();
    }
}

/*
 * ������д��Ӧ�ã�
 * */

class Ios7 {
    public void call() {
        System.out.println("��绰");
    }
    
    public void siri() {
        System.out.println("speak English");
    }
}

class Ios8 extends Ios7 {
    public void siri() {
        super.siri();
        System.out.println("˵����");
    }
}
