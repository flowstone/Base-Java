package me.xueyao.web;

import me.xueyao.service.ThreadLocalAccountService03;

/**
 * @author Yao Xue
 * @date Aug 18, 2017 9:32:52 PM
 */
public class WebApp3 {
    public static void main(String[] args) {
        String outUser = "jack";
        String inUser = "rose";
        double money = 100;
        

       System.out.println(Thread.currentThread()+"=====");
       ThreadLocalAccountService03 accountService03 = new ThreadLocalAccountService03();
       accountService03.transfer(inUser, outUser, money);
    }
}
