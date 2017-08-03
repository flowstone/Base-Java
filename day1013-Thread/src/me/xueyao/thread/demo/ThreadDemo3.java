package me.xueyao.thread.demo;

import java.util.Date;

/**
 * @author Yao Xue
 * @date Aug 3, 2017 5:29:28 PM
 */
public class ThreadDemo3 {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            
            @Override
            public void run() {
                // TODO Auto-generated method stub
                for (int i = 0; i < 10; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"---"+i+new Date());
                }
            }
        };
        new Thread(r,"柳岩").start();
    }
}
