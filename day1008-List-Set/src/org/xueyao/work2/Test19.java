package org.xueyao.work2;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

/**
 * HashSet
 * 双色球规则:双色球每注投注号码由6个红色球号码和1个蓝色球号码组成。
 * 红色球号码从1—33中选择；蓝色球号码从1—16中选择.请随机生成一注双色球号码
 * @author Yao Xue
 * @date Jul 27, 2017 10:51:22 PM
 */
public class Test19 {
    public static void main(String[] args) {
        //String[] color = {"红","蓝"};
        Random ran = new Random();
        
        HashSet<Integer> hashSet = new HashSet<Integer>();
        while (hashSet.size() < 6) {
            int num = ran.nextInt(33)+1;
            //System.out.println(num);
            hashSet.add(num);
        }
        //System.out.println(hashSet);
        int blueBall = ran.nextInt(16) + 1;
        
        System.out.println("中奖号码是:");
        System.out.println("红球是:");
        for (Integer i : hashSet) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("蓝球是:"+blueBall);
        
    }
}
