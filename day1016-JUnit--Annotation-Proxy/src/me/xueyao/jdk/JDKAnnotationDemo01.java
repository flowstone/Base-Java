package me.xueyao.jdk;
/**
 * @author Yao Xue
 * @date Aug 7, 2017 9:42:23 AM
 */
public class JDKAnnotationDemo01 {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.eat();
    }
}

interface Inter {
    void shout();
}

class Animal {
    public void eat() {
        System.out.println("随便吃");
    }
}

class Wolf extends Animal implements Inter{
    @Override
    public void eat() {
        System.out.println("狼吃肉。。。");
    }

    @Override
    public void shout() {
        System.out.println("嗷嗷。。。。");
    }
}
