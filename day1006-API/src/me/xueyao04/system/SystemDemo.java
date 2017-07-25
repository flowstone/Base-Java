package me.xueyao04.system;
/**
 * ##四.System类
    1. System类是final修饰，可是不能实例化，因为构造方法私有
    2. 常见静态方法：
        1. currentTimeMillis()：获取系统当前时间
        2. exit(0)：终止当前正在运行的 Java 虚拟机，0表示正常中止
        3. gc() ：运行垃圾回收器,在java垃圾回收期是自动管理的
        4. getProperty():返回当前的系统属性
    3. 关于arrayCopy方法复制数组：String 和StringBuilder
 * @author Yao Xue
 * @date Jul 26, 2017 1:29:12 AM
 */
public class SystemDemo {
    public static void main(String[] args) {
        method4();
        method3();
        //method2();
        method();
    }

    private static void method() {
        //从时间原点到现在的毫秒值
        long timeMillis = System.currentTimeMillis();
        System.out.println(timeMillis);
    }

    private static void method2() {
        try {
            System.out.println("haha");
            System.exit(0);
        } catch (Exception e) {
            // TODO: handle exception
        } finally {
            System.out.println("haha2");
        }
    }

    private static void method3() {
        // TODO Auto-generated method stub
        //传入属性,获取值
        String property = System.getProperty("os.version");
        System.out.println(property);
    }

    private static void method4() {
        int[] src = {1,2,3,4,5};
        int[] dest = {6,7,8,9,0};
        
        /**
         *   * @param      src      the source array.   源数组
             * @param      srcPos   starting position in the source array. 源数组的开始位置
             * @param      dest     the destination array.          目标数组
             * @param      destPos  starting position in the destination data. 目标数组的开始位置
             * @param      length   the number of array elements to be copied. 被复制的数组元素数量
         */
        System.arraycopy(src, 1, dest, 0, 3);
        for (int i = 0; i < dest.length; i++) {
            System.out.println(dest[i]);
        }
    }
}
