package org.xueyao.work01;
/**
 * @author Yao Xue
 * @date Jul 21, 2017 9:06:20 PM
 */
public class Test {
    public static void main(String[] args) {
        Phone p = new Phone("华为", 3000);
        p.playGame();
        p.call();
        
        Computer c = new Computer("雷神", 6000);
        c.playGame();
        c.coding();
    }
}
