package org.xueyao.web;

import org.xueyao.service.AccountService;

/**
 * @author Yao Xue
 * @date Aug 18, 2017 7:07:55 PM
 */
public class WebApp {
    public static void main(String[] args) {
        String outUser = "panzeyao";
        String inUser = "cuishuohuan";
        
        int money = 100;
        //直接调用Service层的方法完成转账的操作
        AccountService accountService = new AccountService();
        accountService.transfer(outUser, inUser, money);
    }
}
