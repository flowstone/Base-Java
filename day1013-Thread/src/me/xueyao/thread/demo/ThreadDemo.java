package me.xueyao.thread.demo;
/**
 * @author Yao Xue
 * @date Aug 3, 2017 3:55:32 PM
 */
public class ThreadDemo {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();
        
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}