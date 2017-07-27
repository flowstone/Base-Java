package org.xueyao.poker;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 完成斗地主案例
    2.增加需求:哪个玩家拿到大王,就需要拿底牌

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

    private static void dealPokers(ArrayList<String> pokers) {
        ArrayList<String> player01 = new ArrayList<String>();
        ArrayList<String> player02 = new ArrayList<String>();
        ArrayList<String> player03 = new ArrayList<String>();
        ArrayList<String> diPai = new ArrayList<String>();
        
        for (int i = 0; i < pokers.size(); i++) {
            String poker = pokers.get(i);
            if (i >= 51) {
                diPai.add(poker);
            } else if (i % 3 == 0) {
                player01.add(poker);
            } else if (i % 3 == 1) {
                player02.add(poker);
            } else if (i % 3 == 2) {
                player03.add(poker);
            }
        }
        
        //看哪个玩家拿到大王,就将底牌也拿走
        if (player01.contains("大王")) {
            System.out.println("玩家1拿到大王,底牌也拿走");
            player01.addAll(diPai);
        } else if (player02.contains("大王")) {
            System.out.println("玩家2拿到大王,底牌也拿走");
            player02.addAll(diPai);
        } else if (player03.contains("大王")) {
            System.out.println("玩家3拿到大王,底牌也拿走");
            player03.addAll(diPai);
        }
        
        //将每个玩家的牌打印出来
        System.out.println("玩家1的牌:");
        for (String p : player01) {
            System.out.print(p + " ");
        }
        System.out.println();
        
        System.out.println("玩家2的牌:");
        for (String p : player02) {
            System.out.print(p + " ");
        }
        System.out.println();
        
        System.out.println("玩家3的牌:");
        for (String p : player03) {
            System.out.print(p + " ");
        }
        System.out.println();
        
        System.out.println("底牌:");
        for (String p : diPai) {
            System.out.print(p + " ");
        }
        System.out.println();
        
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
        pokers.add("大王");
        pokers.add("小王");
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
