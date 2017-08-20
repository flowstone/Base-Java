package org.xueyao.web;

import java.util.Scanner;

/**
 * @author XueYao
 *         2017-08-19
 */
public class WebApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入以下指令进行操作：");
            System.out.println("c:创建、u：修改、d:删除、da：删除所有、i:通过id查询、fa:查询所有、q:退出");
            //接受用户输入的指令
            String choose = sc.nextLine();
            //根据用户输入的指令判断做什么操作
            switch (choose) {
                case "a":
                    break;
                case "c":
                    break;
                case "u":
                    break;
                case "d":
                    break;
                case "da":
                    break;
                case "i":
                    break;
                case "fa":
                    break;
                case "q":
                    System.out.println("退出程序");
                    System.exit(0);
                    break;
                default:
                    System.out.println("请输入正确的指令!!");
                    break;
            }
        }
    }
}
