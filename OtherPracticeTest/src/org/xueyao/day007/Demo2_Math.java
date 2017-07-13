package org.xueyao.day007;
/**
 * @author Yao Xue
 * @date Jul 13, 2017 8:25:16 PM
 */
public class Demo2_Math {
    public static void main(String[] args) {
//        double d = Math.random();
//        System.out.println(d);
        //Math.random()会生成大于等于0.0，并且小于1.0的伪随机数
        for (int i = 0; i < 10; i++) {
            System.out.println(Math.random());
        }
        
        //如何生成1-100的随机数
        //Math.random() 0.000000 - 0.999999
        //Math.random()*100 0.000000 - 99.9999
        //(int)(Math.random()*100)    0-99
        //(int)(Math.random()*100)+1    1-100
        
        for(int i = 0; i < 10; i++) {
            System.out.println((int)(Math.random()*100)+1);
        }
    }
}
