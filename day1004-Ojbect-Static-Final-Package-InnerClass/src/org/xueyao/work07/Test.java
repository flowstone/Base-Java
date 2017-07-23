package org.xueyao.work07;
/**
 * @author Yao Xue
 * @date Jul 22, 2017 10:05:27 PM
 */
public class Test {
    public static void main(String[] args) {
        player(new Swim() {
            
            @Override
            public void play() {
                System.out.println("大家快去游泳吧");
            }
        });
    }
    
    public static void player(Swim s) {
        s.play();
    }
}
