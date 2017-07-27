package org.xueyao.work1;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * 有一个数组 String arr[]={"abc","bad","abc","aab","bad","cef","jhi"};
 * 创建一个ArrayList，将数组里面的元素添加进ArrayList，但元素不能重复(使用HashSet去除重复元素)
 * 1.   创建arr数组
    2.  创建HashSet集合
    3.  遍历arr数组
    4.  将arr数组中的元素添加进HashSet中.重复的就不会添加进去了
    5.  创建ArrayList集合,将HashSet的元素添加到ArrayList中
    6.  遍历ArrayList打印元素

 * @author Yao Xue
 * @date Jul 27, 2017 9:06:55 PM
 */
public class Test11 {
    public static void main(String[] args) {
        String arr[]={"abc","bad","abc","aab","bad","cef","jhi"};
        ArrayList<String> arrayList = new ArrayList<String>();
        HashSet<String> hashSet = new HashSet<String>();
        for (String s : arr) {
            if (!hashSet.contains(s)) {
                hashSet.add(s);
            }
        }
        
        arrayList.addAll(hashSet);
        
        for (String s : arrayList) {
            System.out.println(s);
        }
    }
}
