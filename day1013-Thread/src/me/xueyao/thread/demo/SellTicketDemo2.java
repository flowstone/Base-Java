package me.xueyao.thread.demo;
/**售票,多个售票窗口卖100张票
 * @author Yao Xue
 * @date Aug 3, 2017 7:23:30 PM
 */
public class SellTicketDemo2 {
    public static void main(String[] args) {
        SellTicketTask2 stt2 = new SellTicketTask2();
        new Thread(stt2, "窗口1").start();
        new Thread(stt2, "窗口2").start();
        new Thread(stt2, "窗口3").start();
        new Thread(stt2, "窗口4").start();
    }
}


//定义线程任务类
class SellTicketTask2 implements Runnable {
    //定义100张票
    //private int tickets = 100;
    private static int tickets = 100;
    //定义一个对象充当同步代码块上的锁
    private Object obj = new Object();
    @Override
    public void run() {
        //使用循环模拟一直卖票
        while (true) {
            //method();
            //method2();
            method3();
        }
    }
    private void method() {
      //为了解决多线程的安全问题,给操作的共享资源代码加同步锁
       /* synchronized(obj) {
            //判断是否琮有余票
            if (tickets > 0) {
                //休眠1毫秒,模拟延迟
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //有余票,使用打印语句模拟卖票
                System.out.println(Thread.currentThread().getName()+"出票:"+tickets);
                //票数量-1
                tickets--;
            }
        }*/
    }
    
   /* public synchronized void method2() {
      //判断是否琮有余票
        if (tickets > 0) {
            //休眠1毫秒,模拟延迟
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //有余票,使用打印语句模拟卖票
            System.out.println(Thread.currentThread().getName()+"出票:"+tickets);
            //票数量-1
            tickets--;
        }
    }*/
    
    public synchronized static void method3() {
        //判断是否琮有余票
          if (tickets > 0) {
              //休眠1毫秒,模拟延迟
              try {
                  Thread.sleep(1);
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
              //有余票,使用打印语句模拟卖票
              System.out.println(Thread.currentThread().getName()+"出票:"+tickets);
              //票数量-1
              tickets--;
          }
      }
    
}