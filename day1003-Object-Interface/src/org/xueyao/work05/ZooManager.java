package org.xueyao.work05;
/**
 * @author Yao Xue
 * @date Jul 21, 2017 10:19:22 PM
 */
public class ZooManager {
    private String name;
    private int age;
    
    public ZooManager(){}
    public ZooManager(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    
    //喂养动物
    public void feed(Animal a) {
        a.eat();
    }
    
    //组织演出
    public void letItShow(Actor a) {
        a.play();
        if (a instanceof ActedParrot) {
            //TODO:向下转型有问题
            ((Parrot) a).say();
        }
    }
}
