package org.xueyao.debug;
/**
 * 看循环的执行流程
 * 1-5求和案件
 * @author Yao Xue
 * @date Jun 30, 2017 4:33:12 PM
 */
public class DebugTest {
    public static void main(String[] args) {
        //定义求和变量
        int sum = 0;
        
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println("sum:"+sum);
    }
}
