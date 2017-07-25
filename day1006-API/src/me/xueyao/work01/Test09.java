package me.xueyao.work01;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *   获取当前的日期,并把这个日期转换为指定格式的字符串,
 *   如2088-08-08 08:08:08
 * @author Yao Xue
 * @date Jul 25, 2017 7:52:17 PM
 */
public class Test09 {
    public static void main(String[] args) {
        Date date = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String now = df.format(date);
        System.out.println(now);
    }
}
