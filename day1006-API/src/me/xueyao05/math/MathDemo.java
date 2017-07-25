package me.xueyao05.math;

import java.util.Random;

/**
 * ##五.Math类
    1. java.lang.Math类是数学计算工具，构造也是私有
    2. 常见静态方法：
        1. abs：返回参数的绝对值 
        2. ceil：返回大于或者等于参数的最小整数（向上取整）：用于分页显示
        3. floor：向下取整
        4. round：四舍五入取整数
        5. pow：幂运算: a的b次幂  
        6. random：返回随机数,范围是0.0-1.0之间的伪随机数；结果可能是0.0,不会到达1.0
            1. 计算机中的随机数都是由确定算法计算出来的，不是真正意义上的随机数
            2. 同样是返回随机数 new Random().nextInt(params)用的更多
 * @author Yao Xue
 * @date Jul 26, 2017 1:39:53 AM
 */
public class MathDemo {
    public static void main(String[] args) {
        method6();
        method5();
        method4();
        method3();
        method2();
        method();
    }

    private static void method() {
        int abs = Math.abs(-100);
        System.out.println(abs);
    }

    private static void method2() {
        double ceil = Math.ceil(3.5);
        System.out.println(ceil);
    }

    private static void method3() {
        double floor = Math.floor(-9.2);
        System.out.println(floor);
    }

    private static void method4() {
        //四舍五入
        long round = Math.round(4.49);
        System.out.println(round);
    }

    private static void method5() {
        double pow = Math.pow(-2, 4);
        System.out.println(pow);
    }

    private static void method6() {
        for (int i = 0; i < 5; i++) {
            //返回随机数,范围是0.0-1.0之间的伪随机数,结果可能会是0.0,但是达不到1.0
            double random = Math.random();
            System.out.println(random);
        }
        
        int nextInt = new Random().nextInt(10);
        System.out.println(nextInt);
    }
}
