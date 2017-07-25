package me.xueyao.work03;

import java.util.Calendar;

/**
 * 500天后是几几年几月几日.
 * @author Yao Xue
 * @date Jul 25, 2017 8:01:38 PM
 */
public class Test11 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DAY_OF_YEAR, 500);
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);
        
        System.out.println(year+"年"+month+"月"+day+"月");

    }
}
