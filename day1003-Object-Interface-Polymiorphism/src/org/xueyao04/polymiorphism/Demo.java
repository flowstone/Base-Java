package org.xueyao04.polymiorphism;
/**
 * 多态：同一个行为，传入不同的对象，具有完全不同的表现形式
 * 
 * 代码：父类的引用 指向了子类 的对象
 * 
 * 使用场景1：
 * 如果参数是一个父类类型，我们传递一个子类对象，可不可以？
 * 当然是可以的，因为 子类就是一个父类
 * 
 * 使用场景2：
 * 创建了一个子类对象，可以使用父类的引用进行接收，程序编译不受影响。
 * @author Yao Xue
 * @date Jul 21, 2017 10:35:04 AM
 */
public class Demo {
    public static void main(String[] args) {
        Person p = new Barber();
        p.setName("理发师");
        

        cut(p);
    }
    
   
    //Person听到了cut需要做的事情
    public static void cut(Person p) {
        p.doSomething();
    }
}
