package me.xueyao10.interview;
/**
 * @author Yao Xue
 * @date Jul 23, 2017 11:58:19 AM
 */
public class InterviewDemo {
     public static void main(String[] args) {
        new Object() {
            void speck() {
                System.out.println("哈哈");
            }
        }.speck();
        
        new String("abc").equals("");
        Object object = new Object();
        /**
         * new 父类 /接口(){}
         * 是子类的对象
         */
        Object obj = new Object() {
            void speak() {
                System.out.println("哈哈");
            }
        };
        
        //父类引用不能调用子类特有的方法
        //obj.speak();
        //向下转型：子类没有名字（匿名内部类）
        //如果要想用引用调用子类特有方法，乖乖定义一个类
    }
}
