package me.xueyao.work06;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Yao Xue
 * @date Jul 25, 2017 8:37:06 PM
 */
public class Test14 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        
        //testSimpleDateFormatInLoop();
        testSimpleDateFormatOutLoop();
        long end = System.currentTimeMillis();
        
        System.out.println("程序执行花费时间为"+(end-start)+"ms");
    }
    
    public static void testSimpleDateFormatInLoop() {
        Date now = new Date();
        for (int i = 0; i < 100000; i++) {
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            df.format(now);
        }
    }
    
    public static void testSimpleDateFormatOutLoop() {
        Date now = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        for (int i = 0; i < 100000; i++) {
            df.format(now);
        }
    }
}
