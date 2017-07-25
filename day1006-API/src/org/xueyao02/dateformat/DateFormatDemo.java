package org.xueyao02.dateformat;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Yao Xue
 * @date Jul 25, 2017 8:44:07 AM
 */
public class DateFormatDemo {
    public static void main(String[] args) throws ParseException {
        //
        DateFormat df = new SimpleDateFormat("YYYY-MM-dd");
        
        Date date = new Date(1607616000000L);
        String str_time = df.format(date);
        System.out.println(str_time);
        
        //练习一：把Date对象转换成String
        Date date2 = new Date(1607616000000L);
        DateFormat df2 = new SimpleDateFormat("yyyy年MM月dd日");
        String format = df2.format(date2);
        System.out.println(format);
        
        //练习二：把String转换成Date对象
        String string = "2020年12月11日";
        DateFormat df3 = new SimpleDateFormat("yyyy年MM月dd日");
        Date parse = df3.parse(string);
        System.out.println(parse);
    }
}
