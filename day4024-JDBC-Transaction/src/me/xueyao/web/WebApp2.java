package me.xueyao.web;

import me.xueyao.service.AccountService02;

/**
 * @author Yao Xue
 * @date Aug 18, 2017 9:32:52 PM
 */
public class WebApp2 {
    public static void main(String[] args) {
        String outUser = "jack";
        String inUser = "rose";
        double money = 100;
        

        
        AccountService02 accountService02 = new AccountService02();
        accountService02.transfer(inUser, outUser, money);
        
        
        
    }
}
