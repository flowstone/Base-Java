package me.xueyao04.cut;
/**
 * @author Yao Xue
 * @date Jul 21, 2017 8:40:58 PM
 */
public class CutDemo {
    public static void main(String[] args) {
        
    }
}

class Person {
    String name;
    public void doSomething() {
        System.out.println(name+"正在不可描述");
    }
}


class Barber extends Person {
    @Override
    public void doSomething() {
        // TODO Auto-generated method stub
    }
}
