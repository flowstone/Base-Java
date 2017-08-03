package org.xueyao.thread.demo;
/**
 * 匿名内部类
 * @author Yao Xue
 * @date Aug 3, 2017 1:10:34 PM
 */
public class ThreadDemo4 {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            
            @Override
            public void run() {
                // TODO Auto-generated method stub
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName()+"==="+i);
                }
            }
        };
        
        new Thread(r,"t1").start();
        new Thread(r,"t2").start();
    }
}
