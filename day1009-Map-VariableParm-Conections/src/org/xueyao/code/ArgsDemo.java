package org.xueyao.code;
/**
 *  可变参数
    1. JDK1.5版本特性,方法的可变参数
    2. 适用: 数据类型已知,但是参数的个数不确定
    3. 格式: 方法的参数列表中   数据类型...变量名
    4. 调用可变参数的方法:参数可以传递,也可以不传,传递的个数不受限(0个也可以),相当于数组
    
    5. 注意事项: 一个方法的参数列表只能有1个可变参数,而且只能写在参数列表的最后面
 *
 * @author Yao Xue
 * @date Jul 29, 2017 9:40:26 PM
 */
public class ArgsDemo {
    public static void main(String[] args) {
        int sum = getSum(1,2,3);
        System.out.println(sum);
    }

    private static int getSum(int ... num) {
        // TODO Auto-generated method stub
        int sum = 0;
        for (int i : num) {
            sum += i;
        }
        return sum;
    }
}
