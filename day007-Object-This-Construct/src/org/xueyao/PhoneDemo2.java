package org.xueyao;
/**
 * �ֻ�������
 * @author Yao Xue
 * @date Jul 3, 2017 10:57:43 AM
 */
public class PhoneDemo2 {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.brand = "С��5S";
        p.price = 1999;
        p.color = "��ɫ";
        System.out.println(p.brand+"----"+p.price+"----"+p.color);
        p.call("����ϼ");
        p.sendMessage();
        
        Phone p2 = new Phone();
        p2.brand = "IPhone7S";
        p2.price = 7999;
        p2.color = "������";
        System.out.println(p2.brand+"----"+p2.price+"----"+p2.color);
        p2.call("������");
        p2.sendMessage();
    }
}
