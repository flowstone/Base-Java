package me.xueyao.poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * 1. 准备一副牌
 *    1. 4种花色(♥,♠,♣,♦) 大小王(☺) 54张牌
 *    2. 嵌套循环
 *2. 洗牌
 *  1. Collections.shuffle 对集合随机排列
 *3. 发牌
 *  1. 4个集合(3个人,底牌三张)
 *  2. 取模思想(%3)
 *4. 看牌
 *  1.遍历每一个集合
 *
 * @author Yao Xue
 * @date Jul 27, 2017 1:26:49 AM
 */
public class Poker {
    public static void main(String[] args) {
        //准备一副牌
        ArrayList<String> pokers = new ArrayList<String>();
        String[] colors = {"♠","♥","♣","♦"};
        String[] nums = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        for (String color : colors) {
            for (String num : nums) {
                String poker = color + num;
                pokers.add(poker);
            }
        }
        pokers.add("大☺");
        pokers.add("小☺");
        
        //2.洗牌:对集合中的元素随机排列
        Collections.shuffle(pokers);
        //System.out.println(pokers);
        //发牌
        ArrayList<String> player1 = new ArrayList<String>();
        ArrayList<String> player2 = new ArrayList<String>();
        ArrayList<String> player3 = new ArrayList<String>();
        ArrayList<String> dipai = new ArrayList<String>();
        
        for (int i = 0; i < pokers.size(); i++) {
            int j = i % 3;
            String poker = pokers.get(i);
            //先发底牌
            if (i < 3) {
                dipai.add(poker);
            } else if (j == 0) {
                player1.add(poker);
            } else if (j == 1) {
                player2.add(poker);
            } else if(j == 2) {
                player3.add(poker);
            }
        }
        
        //4.看牌
        lookPoker(dipai);
        lookPoker(player1);
        lookPoker(player2);
        lookPoker(player3);
        
    }

    private static void lookPoker(ArrayList<String> dipai) {
        Iterator<String> it = dipai.iterator();
        while (it.hasNext()) {
            
            System.out.print(it.next()+" ");
        }
        
        System.out.println();
    }
}
