package org.xueyao.method;
/**
 * 方法：其实就是完成特定功能 的代码块
 * 
 * 定义格式：
 *      修饰符  返回值类型  方法名(参数类型 参数名1,参数类型 参数2.....) {
 *          方法体;
 *          return 返回值;
 *      }
 * 格式解释：
 *      A:修饰符  目前记住public static 
 *      B:返回值类型   用于限定返回值的数据类型
 *      C：方法名  为了方便我们调用方法的名字
 *      D：参数类型  用于限定调用方法时传入的数据的类型
 *      E：参数名  用于接收调用 方法时传入的数据的变量
 *      F：方法体  完成功能的代码
 *      G：return 结束方法，并且把返回值返回给调用者
 * 写一个方法有两个明确：
 *      A:返回值类型   明确功能结果的数据类型
 *      B：参数列表    明确有几个参数，以及参数的数据类型
 * 
 * 案例：
 *      写一个方法用于求和
 * @author Yao Xue
 * @date Jun 29, 2017 6:30:38 PM
 */
public class MethodDemo {
    public static void main(String[] args) {
       int result = sum(5, 6);
       System.out.println("两个数的和为"+result);
    }
    
    /*
     * 两个明确
     *      返回值类型：int
     *      参数列表： int a,int b
     */
    public static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }
    
}
