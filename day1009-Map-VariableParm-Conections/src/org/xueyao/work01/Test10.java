package org.xueyao.work01;

import java.util.ArrayList;
import java.util.Collections;

/**
 * ArrayList集合中有如下内容: {11,33,55,77},
 * 使用Collections.reverse()对ArrayList集合中的数据进行反转,
 * 使用增强for遍历ArrayList集合
 * @author Yao Xue
 * @date Jul 30, 2017 1:34:52 AM
 */
public class Test10 {
    public static void main(String[] args) {
        ArrayList<Integer> list  = new ArrayList<Integer>();
        
        list.add(11);
        list.add(33);
        list.add(55);
        list.add(77);
        
        Collections.reverse(list);
        
        for (Integer i: list) {
            System.out.print(i+" ");
        }
    }
    
}
