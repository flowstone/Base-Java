package me.xueyao.thread.task;
/**
 * 请按如下要求编写多线程程序：
        1. 创建两个类，一个是测试类，一个是Thread的子类；
        2. 在测试类中，创建两个Thread类的子类对象，将其中的一个线程对象的优先级
           设置10，另一个线程对象的优先级设置为6。
        3. 让优先级为10的线程打印5次“线程1正在运行”，让优先级为6的线程打印
           10次“线程2正在运行”；
        提示：
1.  设置线程优先级的方法为setPriority方法；
2.  得到线程优先级的方法为getPriority方法；

 * @author Yao Xue
 * @date Aug 3, 2017 9:49:10 PM
 */
public class Task06 {
    public static void main(String[] args) {
        MyThreads mt  = new MyThreads();
        
        
        Thread t1 = new Thread(mt,"线程1");
        Thread t2 = new Thread(mt,"线程2");
        
        t1.setPriority(10);
        t2.setPriority(6);
        
        t1.start();
        t2.start();
    }
}

class MyThreads extends Thread {
    private Object obj = new Object();
    @Override
    public void run() {
        synchronized (obj) {
            if (Thread.currentThread().getPriority() == 10) {
                for (int i = 0; i < 5; i++) {
                    System.out.println(Thread.currentThread().getName()+"正在运行");
                }
            } 
            if (Thread.currentThread().getPriority() == 6) {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName()+"正在运行");
                }
            }
        }
    }
}
