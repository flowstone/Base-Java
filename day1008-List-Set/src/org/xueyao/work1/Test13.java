package org.xueyao.work1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

/**
 * 编写一个程序，获取10个1至20的随机数，要求随机数不能重复。
 * 使用迭代器把最终的结果输出到控制台。
 * 1.   创建HashSet用于保存随机数
    2.  创建Random用于产生随机数
    3.  使用while循环判断hs的size是否小于10
    4.  hs的size小于10就生成一个随机数
    5.  将随机数添加到HashSet,重复的随机数HashSet不会添加
    6.  获取迭代器
    7.  使用迭代器循环判断是否有下一个元素
    8.  获取到下一个元素.打印出来

 * @author Yao Xue
 * @date Jul 27, 2017 9:30:34 PM
 */
public class Test13 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        Random r = new Random();
        
        while (hashSet.size() < 10) {
            
            Integer num = r.nextInt(20)+1;
            hashSet.add(num.toString());
        }
        //System.out.println(hashSet);
        Iterator<String> it = hashSet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
