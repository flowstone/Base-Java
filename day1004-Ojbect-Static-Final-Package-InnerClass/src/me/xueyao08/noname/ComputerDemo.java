package me.xueyao08.noname;
/**
 * @author Yao Xue
 * @date Jul 23, 2017 11:30:55 AM
 */
public class ComputerDemo {
    public static void main(String[] args) {
        Computer c = new Computer();
        
        Mouse m = new Mouse();
        c.useUSB(m);
        
        //方法内部类
        class Keyboard implements USB {

            @Override
            public void open() {
                System.out.println("keyboard is open...");
            }

            @Override
            public void close() {
                System.out.println("keyboard is close...");
            }
            
        }
        
        USB k = new Keyboard();
        c.useUSB(k);
        /**
         * 匿名内部类：没有名字的类
         * 简化格式(没有具体的定义一个类),作用是传参
         */
//        new USB();  //接口不可以实体化
        //直接创建USB的实现类对象
        //class Keyboard implements USB  
        USB u = new USB() {
            
            @Override
            public void open() {
                System.out.println("video is open...");
            }
            
            @Override
            public void close() {
                System.out.println("video is close...");
            }
        };
        
        c.useUSB(u);
        //规范：匿名内部类的匿名对象
        c.useUSB(new USB() {
            
            @Override
            public void open() {
                System.out.println("camera is open...");
            }
            
            @Override
            public void close() {
               System.out.println("cammera is close...");   
            }
        });
    }
}
