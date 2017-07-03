package org.xueyao;
/**
 * @author Yao Xue
 * @date Jul 3, 2017 11:15:54 AM
 */
public class PhoneDemo3 {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.brand = "OPPO";
        p.price = 2999;
        p.color = "°×É«";
        System.out.println(p.brand+"----"+p.price+"----"+p.color);
        
        Phone p2 = p;
        p2.brand = "÷È×å";
        p2.price = 1999;
        p2.color = "À¶É«";
        System.out.println(p.brand+"----"+p.price+"----"+p.color);
        System.out.println(p2.brand+"----"+p2.price+"----"+p2.color);
    }
}
