package org.xueyao.ford;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Yao Xue
 * @date Jul 26, 2017 9:31:55 AM
 */
public class ForDemo {
    public static void main(String[] args) {
        //练习一:遍历数组
        int[] arr = new int[]{11,22,33};
        for(int n : arr) {
            System.out.println(n);
        }
        
        
        //遍历集合
        Collection<String> coll = new ArrayList<String>();
        coll.add("abc1");
        coll.add("abc2");
        coll.add("abc3");
        coll.add("abc4");
        
        for (String str : coll) { //变量str代表被遍历到的集合元素
            System.out.println(str);
        }
    }
}
