package org.xueyao.work01;

import java.util.ArrayList;

/**
 * 
 * ArrayList中有如下数据:”a”, ”b”, ”c”, ”c”, ”a”, ”b”, ”b”, ”b”, ”a”.定义名为:frequency(ArrayList arr, String key)的方法.arr是ArrayList集合,key是要查找的某个元素.使用增强for方式查找key在ArrayList中出现的次数.并将次数作为方法的返回值.在mian方法中调用frequency方法
 * 1.   创建ArrayList
    2.  添加元素
    3.  定义frequency方法统计集合中指定元素出现的次数，
    4.  在frequency方法中计数变量
    5.  在frequency方法中使用增强for遍历传入的ArrayList集合.拿到每个元素
    6.  如果遍历出来的元素是要查找的元素.计数器加1
    7.  返回计数值
    8.  在main中调用这个方法测试

 * @author Yao Xue
 * @date Jul 27, 2017 2:34:27 AM
 */
public class Test12 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("c");
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("b");
        arrayList.add("b");
        arrayList.add("a");
        int count = frequency(arrayList,"a");
        System.out.println(count);
    }

    private static int frequency(ArrayList<String> arrayList, String key) {
        int count = 0;
        for (String s : arrayList) {
            System.out.println(s);
            if (s.equals(key)) {
                count++;
            }
        }
        return count;
    }
}

