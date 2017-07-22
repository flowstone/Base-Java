package org.xueyao.work04;
/**
 * @author Yao Xue
 * @date Jul 22, 2017 9:13:12 PM
 */
public class Test {
    public static void main(String[] args) {
        enter(new Sport() {
            
            @Override
            public void run() {
                System.out.println("参加运动会,奔跑吧");
            }
        });
    }
    
    public static void enter(Sport s) {
        s.run();
    }
}
