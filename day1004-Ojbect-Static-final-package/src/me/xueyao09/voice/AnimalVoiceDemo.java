package me.xueyao09.voice;
/**
 * 5. 有一个Animal的抽象父类,其中有shout()抽象方法.
 * 在主类中有一个动物之声的函数,其参数为Animal类型的对象.需要使用匿名内部实现动物之声方法的调用.
 * @author Yao Xue
 * @date Jul 23, 2017 11:49:01 AM
 */
public class AnimalVoiceDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        
        voice(dog);
        class Cat extends Animal {
            
            @Override
            void shout() {
                System.out.println("喵喵的叫");
            }
            
        }
        voice(new Cat());
        //匿名内部类：没有定义类  new 父类/接口(){类体：一般是重写方法}
        //Animal类的子类对象
        voice(new Animal() {
            
            @Override
            void shout() {
                System.out.println("嗷嗷的叫");
            }
        });
        
        voice(new Animal() {
            
            @Override
            void shout() {
                System.out.println("嘎嘎的叫");
                
            }
        });
    }
    private static void voice(Animal a) {
        a.shout();
    }
}

abstract class Animal {
    abstract void shout();
}

class Dog extends Animal {

    @Override
    void shout() {
        System.out.println("汪汪的叫");
    }
    
}
