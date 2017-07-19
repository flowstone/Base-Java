package org.xueyao.work08;
/**
 * @author Yao Xue
 * @date Jul 19, 2017 9:32:27 PM
 */
public class Test {
    public static void main(String[] args) {
        Bear bear = new Bear("白色", "四");
        bear.eat();
        bear.catchFish();
        
        Panda panda = new Panda("黑色", "四");
        panda.eat();
        panda.climbTree();
    }
}
