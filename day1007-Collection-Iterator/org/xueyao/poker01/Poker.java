package org.xueyao.poker01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
一副牌有如下内容:有四种花色:????,每种花色的牌 2 3 4 5 6 7 8 9 10 J Q K A
大王,小王
具体规则：
    1.不要大王和小王
    2.使52张牌打乱顺序
    3.四个玩家,每个玩家随机获取2张牌,注意玩家抽走的牌不能再给其他玩家使用
    4.将2张牌相加比较点数大小.A=1,J=11,Q=12,K=13
    5.打印玩家中2张牌加起来最大的点数

 * @author Yao Xue
 * @date Jul 27, 2017 11:37:44 AM
 */
public class Poker {
    public static void main(String[] args) {
        ArrayList<String> pokers = new ArrayList<String>();
        //添加牌
        addPokers(pokers);
        
        //洗牌
        washPokers(pokers);
        
        //发牌
        dealPokers(pokers);
        
        
        
    }

    public static void dealPokers(ArrayList<String> pokers) {
        ArrayList<String> player01 = new ArrayList<String>();
        ArrayList<String> player02 = new ArrayList<String>();
        ArrayList<String> player03 = new ArrayList<String>();
        ArrayList<String> player04 = new ArrayList<String>();
        
        //玩家已经拿走的牌的索引
        ArrayList<Integer> removePokers = new ArrayList<Integer>();
        getPokers(pokers, player01, removePokers);
        getPokers(pokers, player02, removePokers);
        getPokers(pokers, player03, removePokers);
        getPokers(pokers, player04, removePokers);
        
        System.out.println(player01);
        System.out.println(player02);
        System.out.println(player03);
        System.out.println(player04);
        
        //定义一个数组放四个玩家的点数 
        int[] container = new int[4];
        container[0] = getPoint(player01);
        container[1] = getPoint(player02);
        container[2] = getPoint(player03);
        container[3] = getPoint(player04);
        
       
        //定义最大点数
        int max = 0;
        for (int point : container) {
            if (max < point) {
                max = point;
            }
        }
        System.out.println("四个玩家中最大点数是:"+max);
    }
    /**
     * 根据玩家的牌,计算出点数
     * @param player 玩家的牌
     * @return
     */
    private static int getPoint(ArrayList<String> player) {
        int point = 0;
        for (String str : player) {
            if (str.contains("A")) {
                point += 1;
            } else if (str.contains("J")) {
                point += 11;
            } else if (str.contains("Q")) {
                point += 12;
            } else if (str.contains("K")) {
                point += 13;
            } else  {
                point += Integer.valueOf(str.substring(1));
            }
                
        }
        return point;
    }

    /**
     * 一个玩家拿2张牌
     * @param pokers  所有牌
     * @param player01   玩家
     * @param removePokers   已经拿走牌的序号
     */
    private static void getPokers(ArrayList<String> pokers, ArrayList<String> player,
            ArrayList<Integer> removePokers) {
        Random ran = new Random();
        //如果玩家的牌小于2张,就拿一张
        while (player.size() < 2) {
            //拿到牌的索引
            int index = ran.nextInt(52);
            //看这张牌是否有人拿走过
            if (!removePokers.contains(index)) {
                //这张牌没有被别人拿走过,就给玩家
                player.add(pokers.get(index));
                //这张牌已经被别人拿走,后面的人就不要来拿这张牌
                removePokers.add(index);
            }
        }
    }

    public static void addPokers(ArrayList<String> pokers) {
        String[] colors = {"♣", "♦", "♠", "♥"};
        String[] numbers = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        
        for (int i = 0; i < colors.length; i++) {
            String color = colors[i];
            for (int j = 0; j < numbers.length; j++) {
                String number = numbers[j];
                
                String poker = color + number;
                pokers.add(poker);
            }
            
        }
        
    }

    public static void washPokers(ArrayList<String> pokers) {
        Collections.shuffle(pokers);
    }

    private static void showPoker(ArrayList<String> poker) {
        for (String s : poker) {
            System.out.print(s+" ");
        }
        System.out.println();
    }
}
