package org.xueyao.work01;

import java.util.ArrayList;
import java.util.Collections;

/**ArrayList集合中有如下内容: {33,11,77,55},
 * 使用Collections.sort()对ArrayList集合中的数据进行排序,并打印出排序后的结果
 * 
 * @author Yao Xue
 * @date Jul 30, 2017 1:27:45 AM
 */
public class Test08 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(33);
        list.add(11);
        list.add(77);
        list.add(55);
        
        Collections.sort(list);
        System.out.println(list);
        for (Integer i : list) {
            System.out.print(i+" ");
        }
    }
}
