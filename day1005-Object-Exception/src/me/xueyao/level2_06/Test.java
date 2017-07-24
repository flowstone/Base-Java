package me.xueyao.level2_06;
/**
 * @author Yao Xue
 * @date Jul 24, 2017 1:09:07 PM
 */
public class Test {
    public static void main(String[] args) {
        DebitCard dc = new DebitCard();
        try {
            dc.setMoney(-10);
        } catch (NoMoneyException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
