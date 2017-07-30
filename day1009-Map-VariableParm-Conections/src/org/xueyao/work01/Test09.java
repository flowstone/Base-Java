package org.xueyao.work01;

import java.util.ArrayList;
import java.util.Collections;

/**
 * ArrayList集合中有如下内容: {11,33,55,77},
 * 使用Collections.shuffle ()对ArrayList集合中的数据进行随机打乱顺序,并打印出排序后的结果
 * @author Yao Xue
 * @date Jul 30, 2017 1:32:00 AM
 */
public class Test09 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(11);
        list.add(33);
        list.add(55);
        list.add(77);
        
        Collections.shuffle(list);
        for (Integer i : list) {
            System.out.print(i+" ");
        }
    }
}
