package org.xueyao.flowcontrol;

public class BreakAndContinueDemo {
    public static void main(String[] args) {
        //按要求分析结果，并验证
        for (int x = 1; x <= 10; x++) {
            if (x % 3 == 0) {
                //break;  //2次;
                continue;  //7次
            }
            System.out.println("我爱林青霞");
        }
    }
}
