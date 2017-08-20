package org.xueyao.exam;

/**
 * @author Yao Xue
 * @date Aug 19, 2017 9:09:41 PM
 */
class MyThread extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        System.out.println("a");
    }
}
/*
public class Demo {
    public static void main(String[] args) throws Exception {
        MyThread t = new MyThread();
        t.run();
        t.start();
        System.out.println("b");
    }
    
}*/

/*public class Demo{
    public static void main(String[] args){
     QueryRunner qr = new QueryRunner();
     String sql = “select * from product where pid = 1”;
     Product p = qr.query(sql,new BeanHandler(Product.class));
    }
   }*/
