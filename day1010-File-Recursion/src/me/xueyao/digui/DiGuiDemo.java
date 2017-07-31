package me.xueyao.digui;
/**
 *  需求：使用递归求1-5的和值，禁止使用循环
 * 使用递归注意事项：
 * 1.必须要有结束条件
 * if(n<=1)
 * {
 *  return 1;
 * }
 * 2.找规律
 * 5+4+3+2+1
 * @author Yao Xue
 * @date Jul 31, 2017 1:56:12 PM
 */
public class DiGuiDemo {
    public static void main(String[] args) {
        //调用方法求和值
        int sum = getSum(5);
        System.out.println(sum);//15
    }
    
    public static int getSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + getSum(n-1);
    }
}
