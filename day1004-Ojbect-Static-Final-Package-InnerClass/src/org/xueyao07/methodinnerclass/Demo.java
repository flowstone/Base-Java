package org.xueyao07.methodinnerclass;
/**
 * @author Yao Xue
 * @date Jul 22, 2017 11:48:15 AM
 */
public class Demo {
    public static void main(String[] args) {
        Outer out = new Outer();
        out.introduce();
    }
}

class Outer {
    private String name = "外部类的name属性";
    public static String schoolName = "小明爱心之家";
    
    public void introduce() {
        System.out.println("大家好，我是外部类的方法introduce().");
        // 定义一个方法内部类

        class Inner {
            private String name;
            private int age;

            public void introduce() {
                System.out.println("大家好，我叫" + name + ",我今年" + age + "岁了.");
            }
        }

        // 在该方法结束之后，创建该类的对象，并实现调用
        Inner in = new Inner();
        in.name = "jack";
        in.age = 30;
        in.introduce();
    }
}
