package org.xueyao04.polymiorphism;
/**
 * @author Yao Xue
 * @date Jul 21, 2017 10:35:04 AM
 */
public class Demo2 {
    public static void main(String[] args) {
        Barber b = new Barber();
        b.setName("理发师");
        
        Actress a = new Actress();
        a.setName("女演员");
        
        Doctor d = new Doctor();
        d.setName("女医生");
        
//        b.doSomething();
//        a.doSomething();
//        d.doSomething();
        
        cut(b);
        cut(a);
        cut(d);
    }
    
    //功能：cut行为
    //理发师听到cut需要做的事情
    public static void cut(Barber b) {
        b.doSomething();
    }
    
    //女演员听到cut需要做的事情 
    public static void cut(Actress a) {
        a.doSomething();
    }
    
    //医生听到了cut需要做的事情
    public static void cut(Doctor d) {
        d.doSomething();
    }
}
