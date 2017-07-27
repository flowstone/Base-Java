package org.xueyao.work;
/**
 * 自定义一个泛型接口Inter <E>,包含show(E e)抽象方法.
 *  使用1.定义实现类时确定泛型的类型, 
 *  2.定义实现类时不确定泛型的类型2种方式定义实现类.并使用实现类
 *  1.  定义泛型接口Inter<E>
    2.  在Inter接口中定义抽象的show(E e)方法
    3.  定义Imple01类.实现Inter接口,使用定义实现类时确定泛型的类型方式
    4.  重写Imple01中的show(String e)方法.打印传入的内容
    5.  定义Imple02类.实现Inter接口,定义实现类时不确定泛型的类型
    6.  重写Imple02类中的show(E e)方法.打印传入的内容
    7.  在测试类中创建Imple01对象
    8.  调用Imple01类的show方法传入String参数
    9.  在测试类中创建Imple02对象,并确定泛型为Integer类型
    10. 调用Imple02类的show方法传入Integer参数

 * @author Yao Xue
 * @date Jul 26, 2017 8:25:56 PM
 */
public class Test09 {
    public static void main(String[] args) {
        Imple01 imple01 = new Imple01();
        imple01.show("小明");
        
        Imple02<Integer> imple02 = new Imple02<Integer>();
        imple02.show(1000);
    }
}

class Imple01 implements Inter<String> {

    @Override
    public void show(String e) {
        // TODO Auto-generated method stub
        System.out.println(e);
    }
    
}

class Imple02<E> implements Inter<E> {

    @Override
    public void show(E e) {
        // TODO Auto-generated method stub
        System.out.println(e);
    }
    
}
