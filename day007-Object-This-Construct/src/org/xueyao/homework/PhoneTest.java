package org.xueyao.homework;
/**
 * @author Yao Xue
 * @date Jul 3, 2017 4:46:36 PM
 */
public class PhoneTest {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.setBrand("小米");
        phone.setPrice(998);
        
        phone.call();
        phone.sendMessage();
        phone.playGame();
        System.out.println("------------------------------");
        Phone phone2 = new Phone("小米", 998);
        phone2.call();
        phone2.sendMessage();
        phone2.playGame();
    }
}
