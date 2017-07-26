package org.xueyao.demo;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 按照斗地主的规则，完成洗牌发牌的动作。
具体规则：
    使用54张牌打乱顺序
    三个玩家参与游戏，三人交替摸牌，每人17张牌，最后三张留作底牌。

 * @author Yao Xue
 * @date Jul 26, 2017 10:12:20 AM
 */
public class Poker {
    public static void main(String[] args) {
        //♠♥♦♣
        //准备牌
        ArrayList<String> poker = new ArrayList<String>();
        //花色
        ArrayList<String> color = new ArrayList<String>();
        color.add("♠");
        color.add("♥");
        color.add("♦");
        color.add("♣");
        
        //数字
        ArrayList<String> number = new ArrayList<String>();
        for (int i = 2; i <= 10; i++) {
            number.add(i+" ");
        }
        
        number.add("J");
        number.add("Q");
        number.add("K");
        number.add("A");
        
        //完成新牌
        for (String thisColor : color) {
            for (String thisNumber : number) {
                String thisCard = thisColor + thisNumber;
                poker.add(thisCard);
            }
        }
        poker.add("小☺");
        
        poker.add("大☻");
        
        //洗牌
        Collections.shuffle(poker);
        
        //发牌
        //玩家1
        ArrayList<String> player1 = new ArrayList<String>();
        //玩家2
        ArrayList<String> player2 = new ArrayList<String>();
        //玩家2
        ArrayList<String> player3 = new ArrayList<String>();
        
        //底牌
        ArrayList<String> secretCards = new ArrayList<String>();
        
        for(int i=0; i<poker.size(); i++) {
            if (i > 51) {
                //最后三张发给底牌
                secretCards.add(poker.get(i));
            } else {
                //剩余牌通过对3取模依次棋牌 
                if (i % 3 == 0) {
                    player1.add(poker.get(i));
                } else if (i % 3 == 1) {
                    player2.add(poker.get(i));
                } else  {
                    player3.add(poker.get(i));
                }
            }
        }
        
        //看牌
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
        System.out.println(secretCards);
        
    }
}
