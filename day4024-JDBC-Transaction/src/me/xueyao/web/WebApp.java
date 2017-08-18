package me.xueyao.web;

import me.xueyao.service.AccountService;

/**
 * @author Yao Xue
 * @date Aug 18, 2017 9:32:52 PM
 */
public class WebApp {
    public static void main(String[] args) {
        String outUser = "jack";
        String inUser = "rose";
        double money = 100;
        
        AccountService accountService = new AccountService();
        accountService.transfer(inUser, outUser, money);
        
    }
}
