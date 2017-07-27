package org.xueyao.work;
/**
 * 自定义泛型方法function.可以传入任意类型数据t.在这个方法中打印传入的t.并使用这个泛型方法
 * 1.   定义泛型方法
    2.  在泛型方法中,将传入的参数放到输出语句中
    3.  调用function传入字符串
    4.  调用function传入数字

 * @author Yao Xue
 * @date Jul 26, 2017 8:18:41 PM
 */
public class Test08 {
    public static void main(String[] args) {
        GenericClass<String> genericClass = new GenericClass<String>();
        genericClass.function("你好,饭吃了吗");
    }
    
}
