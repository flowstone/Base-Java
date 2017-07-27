 package org.xueyao.work;
/**
 * 自定义泛型类GenericClass<E>,包含E类型的成员变量,提供get/set方法,并使用这个泛型类
 * 1.   自定义泛型类
    2.  定义E类型的成员变量
    3.  添加get/set方法
    4.  创建泛型类对象.并指定具体类型
    5.  调用set方法传入对应的类型
    6.  调用get方法获取成员变量的值

 * @author Yao Xue
 * @date Jul 26, 2017 8:15:02 PM
 */
public class Test07 {
    public static void main(String[] args) {
        GenericClass<String> genericClass = new GenericClass<String>();
        genericClass.setE("小明");
        String e = genericClass.getE();
        System.out.println(e);
    }
}
