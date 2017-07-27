package org.xueyao.work01;

import java.util.ArrayList;

/**
 * 有一个数组 String arr[]={"abc","bad","abc","aab","bad","cef","jhi"};
 * 创建一个ArrayList，将arr数组里面的元素添加进ArrayList中去，但ArrayList中元素不能重复 (arr数组不变)
 * @author Yao Xue
 * @date Jul 27, 2017 10:33:50 AM
 */
public class Test16 {
    public static void main(String[] args) {
        String arr[]={"abc","bad","abc","aab","bad","cef","jhi"};
        ArrayList<String> list = new ArrayList<String>();
        
        for (String s : arr) {
            if (!list.contains(s)) {
                list.add(s);
            }
        }
        
        System.out.println(list);
        
    }
}
