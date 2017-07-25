package me.xueyao03.calendar;

import java.util.Calendar;

/**
 * 1. Calendar 类是一个抽象类，它为特定瞬间与一组诸如 YEAR、MONTH、DAY_OF_MONTH、HOUR 等 日历字段之间的转换提供了一些方法，并为操作日历字段（例如获得下星期的日期）提供了一些方法。
    2. 日历类Calendar静态方法getInstance方法获取子类实例
        1. Calendar是抽象类，子类GregorianCalendar
    3. 日历类Calendar用get方法获取日历的某个字段：年、月、日
    4. set方法设置日历的时期
    5. add方法设置日历的偏移量
        1. 对日历偏移, 月份中天数,向后偏移199天
        2. 火车票预售期
 * @author Yao Xue
 * @date Jul 25, 2017 11:57:33 PM
 */
public class CalendarDemo {
    public static void main(String[] args) {
        method();
        method2();
        method3();
    }
    
    private static void method3() {
        Calendar c = Calendar.getInstance();
        
        //1.对日历偏移,月份中天数,向后偏移199天
        c.add(Calendar.YEAR, -1999);
        int year = c.get(Calendar.YEAR); //1
        int month = c.get(Calendar.MONTH) + 1;
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(year+"年"+month+"月"+day+"日");
        
    }
    
    private static void method2() {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, 2019);
        c.set(Calendar.MONTH,7);
        c.set(Calendar.DAY_OF_MONTH,21);
        
        c.set(2019,7,21);
        
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH)+1;
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(year+"年"+month+"月"+day+"日");
    }
    private static void method() {
        Calendar c = Calendar.getInstance();
        System.out.println(c);
      //日历类Calendar用get方法获取日历的某个字段：年、月、日
        /**
         * 键值对(Key-Value):一个键对应一个值   通过键获取值  
         * name = 张三      age = 18
         */
        
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(year+"年"+month+"月"+day+"日");
    }
}
