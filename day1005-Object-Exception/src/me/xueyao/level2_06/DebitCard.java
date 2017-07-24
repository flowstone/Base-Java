package me.xueyao.level2_06;
/**
 * @author Yao Xue
 * @date Jul 24, 2017 1:09:45 PM
 */
public class DebitCard {
    private String accountNumber;
    private double money;
    public DebitCard() {
        super();
        // TODO Auto-generated constructor stub
    }
    public DebitCard(String accountNumber, double money) {
        super();
        this.accountNumber = accountNumber;
        this.money = money;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public double getMoney() {
        return money;
    }
    public void setMoney(double money) throws NoMoneyException {
        if (money < 0) {
            throw new NoMoneyException("余额不能为负数");
        }
        this.money = money;
    }
    
}
