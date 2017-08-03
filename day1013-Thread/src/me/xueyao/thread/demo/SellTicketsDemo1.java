package me.xueyao.thread.demo;
/**
 * 售票,多个售票窗口卖100张票
 * @author Yao Xue
 * @date Aug 3, 2017 7:14:57 PM
 */
public class SellTicketsDemo1 {
    public static void main(String[] args) {
        SellTicketTask stt = new SellTicketTask();
        //创建线程对象,启动线程
        new Thread(stt,"窗口1").start();
        new Thread(stt, "窗口2").start();
        new Thread(stt, "窗口3").start();
        new Thread(stt, "窗口4").start();
    }
}

class SellTicketTask implements Runnable {
    //定义100张票
    private int tickets = 100;
    //实现run函数
    @Override
    public void run() {
        //使用循环模拟一直卖票
        while (true) {
            //判断是否还有余票
            if (tickets > 0) {
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
    
}
