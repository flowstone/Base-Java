package org.xueyao.poker.d20170814;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Yao Xue
 * @date Aug 14, 2017 9:19:42 PM
 */
public class Demo15 {
    public static void main(String[] args) {
        ArrayList<String> pokers = new ArrayList<String>();
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("♣");
        colors.add("♦");
        colors.add("♠");
        colors.add("♥");
        
        ArrayList<String> numbers = new ArrayList<String>();
        for (int i=2; i<=10; i++) {
            numbers.add(i+"");
        }
        numbers.add("J");
        numbers.add("Q");
        numbers.add("K");
        numbers.add("A");
        
        for (String color : colors) {
            for (String number : numbers) {
                String poker = color + number;
                pokers.add(poker);
            }
        }
        
        pokers.add("大王");
        pokers.add("小王");
        
        Collections.shuffle(pokers);
        
        ArrayList<String> player1 = new ArrayList<String>();
        ArrayList<String> player2 = new ArrayList<String>();
        ArrayList<String> player3 = new ArrayList<String>();
        
        ArrayList<String> base = new ArrayList<String>();
        
        for (int i = 0; i < pokers.size(); i++) {
            String poker = pokers.get(i);
            if (i >= 51) {
                
            }
        }
    }
}
