package org.xueyao.thread.demo;
/**
 * @author Yao Xue
 * @date Aug 3, 2017 1:03:07 PM
 */
public class ThreadDemo2 {
    public static void main(String[] args) {
        MyThread2 mt = new MyThread2();
        mt.setName("小明");
        mt.start();
        MyThread2 mt2 = new MyThread2();
        mt2.setName("小华");
        mt2.start();
        
        for (int i = 0; i < 10; i++) {
            
        }
        
    }
}


class MyThread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"..."+i);
        }
    }
}