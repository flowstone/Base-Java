package org.xueyao.tools;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/** 
 * @description 常用工具类
 * @author Yao Xue
 * @date Jul 26, 2017 8:16:39 AM
 */
public class Functions {
    public static void main(String[] args) {
        
    }
    /**
     * @description: 关闭输入输入流对象
     * @param ios 输入输出流对象 
     * 
     */
    public static void closeTo(Closeable ... ios) {
        for (Closeable io : ios) {
            if (io != null) {
                try {
                    io.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
    /**
     * @description 遍历任意类型的ArrayList
     * @param list  任意类型的ArrayList
     */
    public static void printArrayList(ArrayList<?> list) {
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            System.out.println(next);
        }
    }
    
    /**
     * @description 反转任意类型数组
     * @param arr  任意类型的数组
     */
    public static <E> void reverse(E[] arr) {
        for (int start  = 0, end = arr.length-1; start < end; start++, end--) {
            E temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
    }
}
