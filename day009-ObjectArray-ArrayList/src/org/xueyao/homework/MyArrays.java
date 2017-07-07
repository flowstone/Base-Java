package org.xueyao.homework;

import java.util.ArrayList;
import java.util.Scanner;

import javax.management.MXBean;

/**
 * @author Yao Xue
 * @date Jul 6, 2017 5:10:50 PM
 */
public class MyArrays {
    /*
     * 参数ArrayList<Integer> list:要进行操作的集合对象        
            要求：对list集合对象中的元素进行反转(第一个和最后一个交换，第二个和倒数第二个交换，第三个和倒数第三个交换...)
     */
    public static void reverse(ArrayList<String> list) {
        String[] s = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            s[i] = list.get(i);
        }
        for (int i = 0,j=s.length-1; i <= j; i++,j--) {
            String temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
        for (int i = 0; i < s.length; i++) {
            list.set(i,s[i]);
        }
    }
    
    /*
     *   参数ArrayList<Integer> list:要进行操作的集合对象        
                            要求：求出list集合对象中的最大值并返回
     */
    public static Integer max(ArrayList<Integer> list) {
        int max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
            }
        }
        return max;
    }
    
    /*
     * 参数ArrayList<Integer> list:要进行操作的集合对象        
            要求：求出list集合对象中的最小值并返回
     */
    public static Integer min(ArrayList<Integer> list) {
        int min = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (min > list.get(i)) {
                min = list.get(i);
            }
        }
        return min;
    }
    
    /*
     *  参数ArrayList<Integer> list:要进行操作的集合对象
            参数Integer i:需要在集合中查找的元素
            要求：求出元素i在list集合中第一次出现的索引，如果没有返回-1
     */
    public static int indexOf(ArrayList<Integer> list,Integer i) {
        int index = -1;
        for (int j = 0; j < list.size(); j++) {
            if (i == list.get(i)) {
                index = i;
                break;
            }
        }
        return index;
    }
    
    /*
     * 参数ArrayList<Integer> list:要进行操作的集合对象
            参数Integer oldValue:需要被替换掉的原值
            参数Integer newValue：替换后的新值
            要求：将list集合中的所有值为oldValue的元素替换为newValue
     */
    public static void replaceAll(ArrayList<Integer> list,Integer oldValue,Integer newValue) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(oldValue)) {
                list.set(i, newValue);
            }
        }
    }
}
