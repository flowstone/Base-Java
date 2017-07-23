package org.xueyao01.interfaced;
/**
 * 接口中定义方法默认使用 public abstract来修改，即抽象方法
 * 接口中变量默认使用public static final 来修饰，使用类名直接访问，接口中的变量，都是常量。因此接口中的
 * 变量名一般都会大写
 * 默认修饰符可以省略不写。
 * @author Yao Xue
 * @date Jul 21, 2017 8:23:24 AM
 */
interface Guidable {
    //int YEARS = 2; //训练时长(常量)
    //void blindGuiding(); //导盲功能(接口方法)

    public static final int YEARS = 2; 
    public abstract void bindGuilding();
}
