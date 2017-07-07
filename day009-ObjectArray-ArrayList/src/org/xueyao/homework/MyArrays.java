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
     * ����ArrayList<Integer> list:Ҫ���в����ļ��϶���        
            Ҫ�󣺶�list���϶����е�Ԫ�ؽ��з�ת(��һ�������һ���������ڶ����͵����ڶ����������������͵�������������...)
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
     *   ����ArrayList<Integer> list:Ҫ���в����ļ��϶���        
                            Ҫ�����list���϶����е����ֵ������
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
     * ����ArrayList<Integer> list:Ҫ���в����ļ��϶���        
            Ҫ�����list���϶����е���Сֵ������
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
     *  ����ArrayList<Integer> list:Ҫ���в����ļ��϶���
            ����Integer i:��Ҫ�ڼ����в��ҵ�Ԫ��
            Ҫ�����Ԫ��i��list�����е�һ�γ��ֵ����������û�з���-1
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
     * ����ArrayList<Integer> list:Ҫ���в����ļ��϶���
            ����Integer oldValue:��Ҫ���滻����ԭֵ
            ����Integer newValue���滻�����ֵ
            Ҫ�󣺽�list�����е�����ֵΪoldValue��Ԫ���滻ΪnewValue
     */
    public static void replaceAll(ArrayList<Integer> list,Integer oldValue,Integer newValue) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(oldValue)) {
                list.set(i, newValue);
            }
        }
    }
}
