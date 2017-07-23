package org.xueyao02.interfaced;
/**
 * @author Yao Xue
 * @date Jul 21, 2017 8:53:39 AM
 */
public abstract class Animal {
    public String name;
    public abstract void shout();
    public abstract void eat();
    public void run() {
        System.out.println(name + "正在疯狂裸奔...");
    }
}
