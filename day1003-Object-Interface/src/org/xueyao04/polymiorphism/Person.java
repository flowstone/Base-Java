package org.xueyao04.polymiorphism;
/**
 * @author Yao Xue
 * @date Jul 21, 2017 10:28:35 AM
 */
public class Person {
    private String name;
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    public void doSomething() {
        System.out.println(name+"正在做xxx...");
    }
}
