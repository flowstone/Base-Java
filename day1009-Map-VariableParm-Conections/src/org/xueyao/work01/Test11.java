package org.xueyao.work01;

import java.util.ArrayList;
import java.util.Collections;

/**
 * ArrayList集合中有如下内容: {11,33,55,77},
 * 使用Collections.binarySearch ()查询33元素在ArrayList集合中的索引是多少
 * @author Yao Xue
 * @date Jul 30, 2017 1:37:30 AM
 */
public class Test11 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(11);
        list.add(33);
        list.add(55);
        list.add(77);
        
        Integer index = Collections.binarySearch(list,33);
        System.out.println(index);
    }
}
