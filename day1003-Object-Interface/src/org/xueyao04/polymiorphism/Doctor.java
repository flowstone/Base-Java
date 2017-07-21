package org.xueyao04.polymiorphism;
/**
 * @description 医生
 * @author Yao Xue
 * @date Jul 21, 2017 10:33:01 AM
 */
public class Doctor extends Person{
    
    public void doSomething() {
        System.out.println(getName()+"正在准备给患者开刀.");
    }
}
