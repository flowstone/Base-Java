package org.xueyao03.calendard;

import java.util.Calendar;
import java.util.Date;

/**
 * @author Yao Xue
 * @date Jul 25, 2017 9:21:52 AM
 */
public class CalendarDemo {
    public static void main(String[] args) {
        Calendar instance = Calendar.getInstance(); //返回当前日历对象
        //System.out.println(instance);
        int year = instance.get(Calendar.YEAR);
        System.out.println(year);
        
        instance.set(Calendar.YEAR, 2020);
        instance.set(Calendar.MONTH,4);
        instance.set(Calendar.DATE,20);
        System.out.println(instance.get(Calendar.YEAR));
        
        Calendar c = Calendar.getInstance();
        Date d = c.getTime();
        System.out.println(d);
    }
}
