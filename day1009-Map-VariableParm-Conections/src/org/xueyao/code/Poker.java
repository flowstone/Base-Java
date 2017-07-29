package org.xueyao.code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * 1. 准备
 *   1. Map(Integer,String)  编号: 牌面
 *   2. List<Integer> 编码集合
 * 2. 洗牌
 * 
 * 3. 发牌
 * 
 * 4. 看牌
 * @author Yao Xue
 * @date Jul 29, 2017 10:24:29 PM
 */
public class Poker {
    public static void main(String[] args) {
        HashMap<Integer,String> pokerMap = new HashMap<Integer,String>();
        ArrayList<Integer> numList = new ArrayList<Integer>();
        
        String[] colors = {"♠","♥","♣","♦"};
        String[] nums = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        int index = 0;
        
        for (String num : nums) {
            for (String color : colors) {
                String poker = color + num;
                pokerMap.put(index, poker);
                numList.add(index);
                index++;
            }
        }
        
//        System.out.println(pokerMap);
//        System.out.println(numList);
        pokerMap.put(52, "小王");
        numList.add(52);
        pokerMap.put(53,"大王");
        numList.add(53);
        
        /*
         * 洗牌(编号)
         */
        Collections.shuffle(numList);
        
        /*
         * 发牌
         */
        ArrayList<Integer> p1 = new ArrayList<Integer>();
        ArrayList<Integer> p2 = new ArrayList<Integer>();
        ArrayList<Integer> p3 = new ArrayList<Integer>();
        ArrayList<Integer> dp = new ArrayList<Integer>();
        
        for (int i = 0; i< numList.size(); i++) {
            Integer num = numList.get(i);
            if (i < 3) {
                dp.add(num);
            } else if (i % 3 == 0) {
                p1.add(num);
            } else if (i % 3 == 1) {
                p2.add(num);
            } else if (i % 3 == 2) {
                p3.add(num);
            }
        }
        /*
         * 看牌
         */
        //对编号进行排序
        Collections.sort(p1);
        Collections.sort(p2);
        Collections.sort(p3);
        Collections.sort(dp);
        
        lookPoker(pokerMap,p1,p2,p3,dp);
    }
    @SafeVarargs
    public static void lookPoker(HashMap<Integer,String> pokerMap,ArrayList<Integer> ... numLists) {
        for (ArrayList<Integer> numList : numLists) {
            for (Integer num : numList) {
                String poker = pokerMap.get(num);
                System.out.print(poker);
            }
            System.out.println();
        }
    }
    
    public static void lookPoker(ArrayList<Integer> numList,HashMap<Integer,String> pokerMap) {
        for (Integer num : numList) {
            String poker = pokerMap.get(num);
            System.out.print(poker);
        }
        System.out.println();
    }
}
