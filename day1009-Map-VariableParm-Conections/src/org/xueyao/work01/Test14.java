package org.xueyao.work01;

import java.util.ArrayList;

/**
 * ArrayList集合中有如下内容: {11,33,55,77}.使用2种方式将集合中的数据转成数组
 * @author Yao Xue
 * @date Jul 30, 2017 2:01:05 AM
 */
public class Test14 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        list.add(11);
        list.add(33);
        list.add(55);
        list.add(77);
        
        Object[] arr = list.toArray();
        for (Object b : arr) {
            System.out.print(b+"  ");
        }
        
        System.out.println("---------");
        Integer[] arr2 = new Integer[list.size()];
        int index = 0;
        for (Integer i: list) {
            arr2[index++] = i;
            
        }
        for (Integer i2: arr2) {
            System.out.print(i2+" ");
        }
        
    }
}
