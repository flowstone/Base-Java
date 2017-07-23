package org.xueyao08.anonymousinnerclass;
/**
 * @author Yao Xue
 * @date Jul 22, 2017 2:15:40 PM
 */
public class Demo4 {
    public static void main(String[] args) {
        Computer com = new Computer();
        com.run();
        com.useUSB(new Mouse());
        
        //在main方法中创建一个类
        class Keyboard implements USB {

            @Override
            public void open() {
                System.out.println("Keyboard open");
            }

            @Override
            public void close() {
                System.out.println("Keyboard close");
            }
            
            
        }
        
        com.useUSB(new Keyboard());
        
        //说明1：new USB()表示创建一个接口类型的对象，接口不能创建对象，接口只能够被实现
        //说明2：new USB(){}表示实现接口，它就是一个接口的实现类，实现接口中的代码
        //请问：这个接口可以实现类有名称吗？没有名称，因此这种方式就称为匿名内部类
    }
}
